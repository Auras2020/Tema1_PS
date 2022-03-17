package com.example.tema1.controller;

import com.example.tema1.model.Client;
import com.example.tema1.model.Film;
import com.example.tema1.repo.FilmRepository;
import com.example.tema1.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmController {

    private FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping("/insert")
    public String insertFilme(@RequestBody Film film){
        return filmService.save(film).toString();
    }

    @GetMapping("/all")
    public Iterable<Film> showFilme(Model model){
        model.addAttribute("filme", filmService.findAll());
        for(Film f : filmService.findAll()) {
            System.out.println(f.toString());
        }
        return filmService.findAll();
    }

}
