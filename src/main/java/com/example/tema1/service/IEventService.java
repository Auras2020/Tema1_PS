package com.example.tema1.service;

import com.example.tema1.model.Event;

import java.util.Optional;

public interface IEventService {

    Event save(Event event);

    Optional<Event> findById(Long id);

    void deleteById(Long id);

    Iterable<Event> findAll();

    Long count();
}
