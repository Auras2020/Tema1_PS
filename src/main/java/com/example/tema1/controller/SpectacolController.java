package com.example.tema1.controller;

import com.example.tema1.model.Client;
import com.example.tema1.model.Film;
import com.example.tema1.model.Spectacol;
import com.example.tema1.repo.SpectacolRepository;
import com.example.tema1.service.SpectacolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spectacole")
public class SpectacolController {

    private SpectacolService spectacolService;

    @Autowired
    public SpectacolController(SpectacolService spectacolService) {
        this.spectacolService = spectacolService;
    }

    @PostMapping("/insert")
    public String insertSpectacole(@RequestBody Spectacol spectacol){
        return spectacolService.save(spectacol).toString();
    }

    @GetMapping("/all")
    public Iterable<Spectacol> showSpectacole(Model model){
        model.addAttribute("spectacole", spectacolService.findAll());
        for(Spectacol s : spectacolService.findAll()) {
            System.out.println(s.toString());
        }
        return spectacolService.findAll();
    }
}
