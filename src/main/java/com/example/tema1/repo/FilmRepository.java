package com.example.tema1.repo;

import com.example.tema1.model.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {
}
