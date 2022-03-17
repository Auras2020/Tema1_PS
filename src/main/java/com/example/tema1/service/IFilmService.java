package com.example.tema1.service;

import com.example.tema1.model.Client;
import com.example.tema1.model.Film;

import java.util.Optional;

public interface IFilmService {
    Film save(Film film);
    Optional<Film> findById(Long id);
    void deleteById(Long id);
    Iterable<Film> findAll();
    Long count();
}
