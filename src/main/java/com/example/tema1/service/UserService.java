package com.example.tema1.service;

import com.example.tema1.model.Angajat;
import com.example.tema1.model.Client;
import com.example.tema1.model.User;
import com.example.tema1.model.Vanzator;
import com.example.tema1.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        if(user instanceof Client){
            return userRepository.save((Client)user);
        }
        if(user instanceof Angajat){
            return userRepository.save((Angajat)user);
        }
        if(user instanceof Vanzator){
            return userRepository.save((Vanzator)user);
        }
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Long count() {
        return userRepository.count();
    }
}
