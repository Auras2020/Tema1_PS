package com.example.tema1.controller;

import com.example.tema1.model.*;
import com.example.tema1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

/**
 * The type Spectacol controller.
 */
@RestController
@RequestMapping("/spectacole")
public class SpectacolController {

    private final SpectacolService spectacolService;

    /**
     * Instantiates a new Spectacol controller.
     *
     * @param eventFactory the event factory
     */
    @Autowired
    public SpectacolController(EventFactory eventFactory) {
       this.spectacolService = (SpectacolService) eventFactory.createEvent(EventType.SPECTACOL);
    }

    /**
     * Insert spectacole string.
     *
     * @param spectacol the spectacol
     * @return the string
     */
    @PostMapping("/insert")
    public String insertSpectacole(@RequestBody Spectacol spectacol){

        return spectacolService.save(spectacol).toString();
    }

    /**
     * Show spectacole iterable.
     *
     * @return the iterable
     */
    @GetMapping("/all")
    public Iterable<Spectacol> showSpectacole(){

        return spectacolService.findAll();
    }

    /**
     * Find spectacol optional.
     *
     * @param id the id
     * @return the optional
     */
    @GetMapping("/find")
    public Optional<Spectacol> findSpectacol(@RequestParam Long id){
        return spectacolService.findById(id);
    }

    /**
     * Delete spectacol.
     *
     * @param id the id
     */
    @DeleteMapping("/delete")
    public void deleteSpectacol(@RequestParam Long id){
        spectacolService.deleteById(id);
    }

    /**
     * Update spectacol spectacol.
     *
     * @param id     the id
     * @param params the params
     * @return the spectacol
     */
    @PutMapping("/update")
    public Spectacol updateSpectacol(@RequestParam(required = false) Long id,
                                 @RequestParam(required = false) Map<String, String> params){
        return spectacolService.updateSpectacol(id, params);
    }
}
