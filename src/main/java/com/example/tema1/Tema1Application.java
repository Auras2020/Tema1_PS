package com.example.tema1;

import com.example.tema1.model.*;
import com.example.tema1.repo.AngajatRepository;
import com.example.tema1.repo.VanzatorRepository;
import com.example.tema1.service.*;
//import com.example.tema1.service.FilmService;
//import com.example.tema1.service.SpectacolService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

/**
 * The type Tema 1 application.
 */
@SpringBootApplication
public class Tema1Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Tema1Application.class, args);
    }
}

