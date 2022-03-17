package com.example.tema1.service;

import com.example.tema1.model.Film;
import com.example.tema1.model.Spectacol;

import java.util.Optional;

public interface ISpectacolService {
    Spectacol save(Spectacol spectacol);
    Optional<Spectacol> findById(Long id);
    void deleteById(Long id);
    Iterable<Spectacol> findAll();
    Long count();
}
