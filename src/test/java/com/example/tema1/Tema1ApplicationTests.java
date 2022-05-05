package com.example.tema1;

import com.example.tema1.controller.EventController;
import com.example.tema1.controller.UserController;
import com.example.tema1.model.*;
import com.example.tema1.repo.FilmRepository;
import com.example.tema1.service.EventService;
import com.example.tema1.service.FilmService;
import com.example.tema1.service.SpectacolService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

/**
 * The type Tema 1 application tests.
 */
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class Tema1ApplicationTests {

    /**
     * Context loads.
     * testam daca s-au creat obiectele dorite prin factory pattern si verificam daca obiectele au fost
     * inserate in baza de date(daca ultimul obiect din tabela este cel dorit atunci inseamna ca s-a
     * inserat cu succes)
     */
    @Test
    void contextLoads() {

        EventFactory eventFactory = new EventFactory();
        Event event = eventFactory.createEvent(EventType.FILM);
        Event expectedResult = new Film("Aftermath1", "horror", 15, "simplu", "12:15 06-04-2020 Mi", 34, 18, "Peter Winther",
                "Ashley Greene, Shawn Ashmo, Jason Liles");
        assertEquals(event, expectedResult);

        EventFactory eventFactory1 = new EventFactory();
        Event event1 = eventFactory1.createEvent(EventType.SPECTACOL);
        Event expectedResult1 = new Spectacol("Aievea10", "populara", "09-12-2021", "Bucuresti", "Andra", "20-22");
        assertEquals(event1, expectedResult1);

        UserFactory userFactory = new UserFactory();
        User user = userFactory.createUser(UserType.ANGAJAT);
        User expectedResult2 = new Angajat("Pavel", "12-20", 1);
        assertEquals(user, expectedResult2);

        UserFactory userFactory1 = new UserFactory();
        User user1 = userFactory1.createUser(UserType.CLIENT);
        User expectedResult3 = new Client("Ana", 21, "DA");
        assertEquals(user1, expectedResult3);

        UserFactory userFactory2 = new UserFactory();
        User user2 = userFactory2.createUser(UserType.VANZATOR);
        User expectedResult4 = new Vanzator("Gabi", "8-12", 1);
        assertEquals(user2, expectedResult4);

        Event f1 = null;
        if (EventController.getFilmService().findById((long) 16).isPresent()){
            f1 = (EventController.getFilmService().findById((long)16).get());
        }

        assertEquals(event, f1);

        Event s1 = null;
        if (EventController.getSpectacolService().findById((long) 17).isPresent()){
            s1 = (EventController.getSpectacolService().findById((long)17).get());
        }

        assertEquals(event1, s1);

        User a1 = null;
        if (UserController.getAngajatService().findById((long) 24).isPresent()){
            a1 = (UserController.getAngajatService().findById((long)24).get());
        }

        assertEquals(user, a1);

        User c1 = null;
        if (UserController.getClientService().findById((long) 23).isPresent()){
            c1 = (UserController.getClientService().findById((long)23).get());
        }

        assertEquals(user1, c1);

        User v1 = null;
        if (UserController.getVanzatorService().findById((long) 25).isPresent()){
            v1 = (UserController.getVanzatorService().findById((long)25).get());
        }

        assertEquals(user2, v1);
    }

}
