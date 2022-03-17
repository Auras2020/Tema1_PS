package com.example.tema1.service;

import com.example.tema1.model.Client;
import com.sun.mail.imap.protocol.ID;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    Client save(Client client);
    Optional<Client> findById(Long id);
    void deleteById(Long id);
    Iterable<Client> findAll();
    Long count();
}
