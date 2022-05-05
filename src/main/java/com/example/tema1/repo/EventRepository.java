package com.example.tema1.repo;

import com.example.tema1.model.Event;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Event repository.
 */
public interface EventRepository extends CrudRepository<Event, Long> {
}
