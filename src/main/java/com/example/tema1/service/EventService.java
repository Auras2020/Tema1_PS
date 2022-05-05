package com.example.tema1.service;

import com.example.tema1.model.Event;
import com.example.tema1.model.Film;
import com.example.tema1.model.Spectacol;
import com.example.tema1.repo.EventRepository;
import com.example.tema1.repo.FilmRepository;
import com.example.tema1.repo.SpectacolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService implements IEventService{

    /*@Autowired
    private FilmRepository filmRepository;

    @Autowired
    private SpectacolRepository spectacolRepository;*/

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event save(Event event) {
        if(event instanceof Film){
            return (eventRepository.save((Film) event));
        }
        if(event instanceof Spectacol){
            return (eventRepository.save((Spectacol) event));
        }
        return null;
        //return eventRepository.save(event);
    }

    @Override
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Iterable<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Long count() {
        return eventRepository.count();
    }
}
