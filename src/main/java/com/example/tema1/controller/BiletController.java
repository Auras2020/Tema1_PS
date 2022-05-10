package com.example.tema1.controller;

import com.example.tema1.model.Bilet;
import com.example.tema1.model.Client;
import com.example.tema1.model.Event;
import com.example.tema1.service.BiletService;
import com.example.tema1.service.ClientService;
import com.example.tema1.service.EventService;
import com.example.tema1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Bilet controller.
 */
@RestController
@RequestMapping("bilete")
public class BiletController {

    private BiletService biletService;

    /**
     * Instantiates a new Bilet controller.
     *
     * @param biletService the bilet service
     */
    @Autowired
    public BiletController(BiletService biletService) {
        this.biletService = biletService;
    }

    /**
     * Create bilet film bilet.
     *
     * @param idClient the id client
     * @param idFilm   the id film
     * @return the bilet
     */
    @PostMapping("/creareBilet/film")
    public Bilet createBiletFilm(@RequestParam Long idClient, @RequestParam Long idFilm){
        return biletService.createBiletFilm(idClient, idFilm);
    }

    /**
     * Create bilet spectacol bilet.
     *
     * @param idClient    the id client
     * @param idSpectacol the id spectacol
     * @return the bilet
     */
    @PostMapping("/creareBilet/spectacol")
    public Bilet createBiletSpectacol(@RequestParam Long idClient, @RequestParam Long idSpectacol){
        return biletService.createBiletSpectacol(idClient, idSpectacol);
    }
}
