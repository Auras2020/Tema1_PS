package com.example.tema1.service;

import com.example.tema1.model.Angajat;
import com.example.tema1.repo.AngajatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AngajatService implements IAngajatService{

    @Autowired
    private AngajatRepository angajatRepository;

    @Override
    public Angajat save(Angajat angajat) {
        return angajatRepository.save(angajat);
    }

    @Override
    public Optional<Angajat> findById(Long id) {
        return angajatRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        angajatRepository.deleteById(id);
    }

    @Override
    public Iterable<Angajat> findAll() {
        return angajatRepository.findAll();
    }

    @Override
    public Long count() {
        return angajatRepository.count();
    }
}
