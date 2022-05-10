package com.example.tema1.controller;

import com.example.tema1.model.Angajat;
import com.example.tema1.model.Event;
import com.example.tema1.model.Film;
import com.example.tema1.model.EventModelFactory;
import com.example.tema1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

/**
 * The type Film controller.
 */
@RestController
@RequestMapping("/filme")
public class FilmController {

    private final FilmService filmService;

    /**
     * Instantiates a new Film controller.
     *
     * @param eventFactory the event factory
     */
    @Autowired
    public FilmController(EventFactory eventFactory) {
        this.filmService = (FilmService) eventFactory.createEvent(EventType.FILM);
    }

    /**
     * Insert filme string.
     *
     * @param film the film
     * @return the string
     */
    @PostMapping("/insert")
    public String insertFilme(@RequestBody Film film){

        return filmService.save(film).toString();
    }

    /**
     * Show filme iterable.
     *
     * @return the iterable
     */
    @GetMapping("/all")
    public Iterable<Film> showFilme(){

        return filmService.findAll();
    }

    /**
     * Find film optional.
     *
     * @param id the id
     * @return the optional
     */
    @GetMapping("/find")
    public Optional<Film> findFilm(@RequestParam Long id){
        return filmService.findById(id);
    }

    /**
     * Delete film.
     *
     * @param id the id
     */
    @DeleteMapping("/delete")
    public void deleteFilm(@RequestParam Long id){
        filmService.deleteById(id);
    }

    /**
     * Update film film.
     *
     * @param id     the id
     * @param params the params
     * @return the film
     */
    @PutMapping("/update")
    public Film updateFilm(@RequestParam(required = false) Long id,
                                 @RequestParam(required = false) Map<String, String> params){
        return filmService.updateFilm(id, params);
    }
}
