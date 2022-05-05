package com.example.tema1.service;

import com.example.tema1.model.Spectacol;
import com.example.tema1.repo.SpectacolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * The type Spectacol service.
 */
@Service
public class SpectacolService implements ISpectacolService{

    @Autowired
    private SpectacolRepository spectacolRepository;

    @Override
    public Spectacol save(Spectacol spectacol) {
        return spectacolRepository.save(spectacol);
    }

    @Override
    public Optional<Spectacol> findById(Long id) {
        return spectacolRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        spectacolRepository.deleteById(id);
    }

    @Override
    public Iterable<Spectacol> findAll() {
        return spectacolRepository.findAll();
    }

    @Override
    public Long count() {
        return spectacolRepository.count();
    }
}
