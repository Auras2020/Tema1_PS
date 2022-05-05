package com.example.tema1.service;

import com.example.tema1.model.Vanzator;
import com.example.tema1.repo.VanzatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VanzatorService implements IVanzatorService{

    @Autowired
    private VanzatorRepository vanzatorRepository;

    @Override
    public Vanzator save(Vanzator vanzator) {
        return vanzatorRepository.save(vanzator);
    }

    @Override
    public Optional<Vanzator> findById(Long id) {
        return vanzatorRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        vanzatorRepository.deleteById(id);
    }

    @Override
    public Iterable<Vanzator> findAll() {
        return vanzatorRepository.findAll();
    }

    @Override
    public Long count() {
        return vanzatorRepository.count();
    }
}
