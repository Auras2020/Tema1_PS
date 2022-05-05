package com.example.tema1.service;

import com.example.tema1.model.Client;
import com.example.tema1.model.Vanzator;

import java.util.Optional;

public interface IVanzatorService {

    Vanzator save(Vanzator vanzator);

    Optional<Vanzator> findById(Long id);

    void deleteById(Long id);

    Iterable<Vanzator> findAll();

    Long count();
}
