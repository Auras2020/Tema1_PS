package com.example.tema1.service;

import com.example.tema1.model.Event;
import com.example.tema1.model.EventModelFactory;
import com.example.tema1.model.Film;
import com.example.tema1.model.Spectacol;
import com.example.tema1.repo.SpectacolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;
import java.util.Optional;

/**
 * The type Spectacol service.
 */
@Service
public class SpectacolService implements EventService, ISpectacolService{

    @Autowired
    private final SpectacolRepository spectacolRepository;

    /**
     * Instantiates a new Spectacol service.
     *
     * @param spectacolRepository the spectacol repository
     */
    public SpectacolService(SpectacolRepository spectacolRepository) {
        this.spectacolRepository = spectacolRepository;
    }

    @Override
    public Spectacol save(Spectacol spectacol) {

        EventModelFactory eventModelFactory = new EventModelFactory();
        Event event1 = spectacol;
        spectacol = (Spectacol) eventModelFactory.createEvent(EventType.SPECTACOL, event1);

        return spectacolRepository.save(spectacol);
    }

    @Override
    public Optional<Spectacol> findById(Long id) {
        if(!spectacolRepository.existsById(id)){
            throw new IllegalStateException("Spectacol with id " + id + " doesn't exist");
        }
        return spectacolRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        if(!spectacolRepository.existsById(id)){
            throw new IllegalStateException("Spectacol with id " + id + " doesn't exist");
        }
        spectacolRepository.deleteById(id);
    }

    @Override
    public Iterable<Spectacol> findAll() {

        //for(Spectacol s : spectacolRepository.findAll()) {
          //  System.out.println(s.toString());
        //}
        return spectacolRepository.findAll();
    }

    @Override
    public Long count() {
        return spectacolRepository.count();
    }

    /**
     * Update spectacol spectacol.
     * actualizeaza un spectacol din baza de date in functie de field-urile pe care dorim sa le modificam
     * (numele si valorile field-urilor sunt specificate in postman sau in url)
     *
     * @param id     the id
     * @param params the params
     * @return the spectacol
     */
    @Transactional
    public Spectacol updateSpectacol(Long id, Map<String, String> params){
        Spectacol spectacol = spectacolRepository.findById(id).
                orElseThrow(() -> new IllegalStateException("Spectacol with id " + id + " doesn't exist"));

        for(Map.Entry<String, String> entry: params.entrySet()){
            if(entry.getKey().equals("nume")){
                spectacol.setNume(entry.getValue());
            }
            else if(entry.getKey().equals("tip_muzica")){
                spectacol.setTip_muzica(entry.getValue());
            }
            else if(entry.getKey().equals("data")){
                spectacol.setData(entry.getValue());
            }
            else if(entry.getKey().equals("locatie")){
                spectacol.setLocatie(entry.getValue());
            }
            else if(entry.getKey().equals("artisti")){
                spectacol.setArtisti(entry.getValue());
            }
            else if(entry.getKey().equals("interval_orar")){
                spectacol.setInterval_orar(entry.getValue());
            }
            else if(!entry.getKey().equals("id")){
                System.out.println("Cheia/Cheile introduse nu corespund spectacolului!!!");
                return null;
            }
        }

        return spectacolRepository.save(spectacol);
    }
}
