package com.example.tema1.controller;

import com.example.tema1.model.Client;
import com.example.tema1.model.Film;
import com.example.tema1.repo.ClientRepository;
import com.example.tema1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clienti")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/insert")
    public String insertClienti(@RequestBody Client client){
        return clientService.save(client).toString();
    }

    @GetMapping("/all")
    public Iterable<Client> showClienti(Model model){
        model.addAttribute("clienti", clientService.findAll());
        for(Client c : clientService.findAll()) {
            System.out.println(c.toString());
        }
        return clientService.findAll();
    }
}
