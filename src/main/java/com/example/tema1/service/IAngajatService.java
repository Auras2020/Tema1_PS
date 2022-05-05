package com.example.tema1.service;

import com.example.tema1.model.Angajat;
import com.example.tema1.model.Client;

import java.util.Optional;

public interface IAngajatService {

    Angajat save(Angajat angajat);

    Optional<Angajat> findById(Long id);

    /**
     * Delete by id.
     *
     * @param id the id
     */
    void deleteById(Long id);

    /**
     * Find all iterable.
     *
     * @return the iterable
     */
    Iterable<Angajat> findAll();

    /**
     * Count long.
     *
     * @return the long
     */
    Long count();
}
