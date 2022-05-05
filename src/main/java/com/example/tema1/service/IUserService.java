package com.example.tema1.service;

import com.example.tema1.model.User;

import java.util.Optional;

public interface IUserService {

    User save(User user);

    Optional<User> findById(Long id);

    void deleteById(Long id);

    Iterable<User> findAll();

    Long count();
}
