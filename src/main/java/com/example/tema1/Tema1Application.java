package com.example.tema1;

import com.example.tema1.model.Client;
import com.example.tema1.model.Film;
import com.example.tema1.model.Spectacol;
import com.example.tema1.service.ClientService;
import com.example.tema1.service.FilmService;
import com.example.tema1.service.SpectacolService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Tema1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tema1Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ClientService clientService, FilmService filmService,
                                 SpectacolService spectacolService){
        return (args -> {
            //clientRepository.deleteAll();
            //filmRepository.deleteAll();
            //spectacolRepository.deleteAll();

            if(clientService.count() == 0){
                insertClients(clientService);
                insertFilm(filmService);
                insertSpectacol(spectacolService);
            }

            while(true){
                System.out.println("Selectati operatia dorita: ");
                Scanner nr = new Scanner(System.in);

                int n = nr.nextInt();
                switch (n){
                    case 1:
                        System.out.println("Se introduc clienti noi");
                        clientService.save(new Client("Tudor", 22, "DA"));
                        break;
                    case 2:
                        System.out.println("Se introduc filme noi");
                        filmService.save(new Film("Aftermath", "horror", 15, "simplu", "12:15 06-04-2020 Mi", 34, 18, "Peter Winther",
                                "Ashley Greene, Shawn Ashmo, Jason Liles"));
                        break;
                    case 3:
                        System.out.println("Se introduc spectacole noi");
                        spectacolService.save(new Spectacol("Aievea", "populara", "09-12-2021", "Bucuresti", "Andra", "20-22"));
                        break;
                    case 4:
                        System.out.println("Se sterg clienti");
                        if(clientService.findById((long)1).isPresent()){
                            clientService.deleteById((long)1);
                        }
                        else{
                            System.out.println("Clientul cu id-ul 1 nu exista in baza de date!!");
                        }
                        if(clientService.findById((long)4).isPresent()){
                            clientService.deleteById((long)4);
                        }
                        else{
                            System.out.println("Clientul cu id-ul 4 nu exista in baza de date!!");
                        }
                        break;
                    case 5:
                        System.out.println("Se sterg filme");
                        if(filmService.findById((long)2).isPresent()){
                            filmService.deleteById((long)2);
                        }
                        else{
                            System.out.println("Filmul cu id-ul 2 nu exista in baza de date!!");
                        }
                        if(filmService.findById((long)3).isPresent()){
                            filmService.deleteById((long)3);
                        }
                        else{
                            System.out.println("Filmul cu id-ul 3 nu exista in baza de date!!");
                        }
                        break;
                    case 6:
                        System.out.println("Se sterg spectacole");
                        if(spectacolService.findById((long)1).isPresent()){
                            spectacolService.deleteById((long)1);
                        }
                        else{
                            System.out.println("Spectacolul cu id-ul 1 nu exista in baza de date!!");
                        }
                        if(spectacolService.findById((long)4).isPresent()){
                            spectacolService.deleteById((long)4);
                        }
                        else{
                            System.out.println("Spectacolul cu id-ul 4 nu exista in baza de date!!");
                        }
                        break;
                    case 7:
                        System.out.println("Se actualizeaza clienti");
                        if(clientService.findById((long)2).isPresent()) {
                            Client client = clientService.findById((long)2).get();
                            client.setVarsta(34);
                            clientService.save(client);
                        }
                        else{
                            System.out.println("Clientul cu id-ul 2 nu exista in baza de date!!");
                        }
                        if(clientService.findById((long)3).isPresent()) {
                            Client client = clientService.findById((long)3).get();
                            client.setNume("Brat");
                            clientService.save(client);
                        }
                        else{
                            System.out.println("Clientul cu id-ul 3 nu exista in baza de date!!");
                        }
                        break;
                    case 8:
                        System.out.println("Se actualizeaza filme");
                        if(filmService.findById((long)1).isPresent()) {
                            Film film = filmService.findById((long)1).get();
                            film.setVarsta(10);
                            filmService.save(film);
                        }
                        else{
                            System.out.println("Filmul cu id-ul 1 nu exista in baza de date!!");
                        }
                        if(filmService.findById((long)4).isPresent()) {
                            Film film = filmService.findById((long)4).get();
                            film.setCapacitate(25);
                            filmService.save(film);
                        }
                        else{
                            System.out.println("Filmul cu id-ul 4 nu exista in baza de date!!");
                        }
                        break;
                    case 9:
                        if(spectacolService.findById((long)1).isPresent()) {
                            Spectacol spectacol = spectacolService.findById((long)1).get();
                            spectacol.setLocatie("Fetesti");
                            spectacolService.save(spectacol);
                        }
                        else{
                            System.out.println("Spectacolul cu id-ul 1 nu exista in baza de date!!");
                        }
                        if(spectacolService.findById((long)3).isPresent()) {
                            Spectacol spectacol = spectacolService.findById((long)3).get();
                            spectacol.setNume("Party");
                            spectacolService.save(spectacol);
                        }
                        else{
                            System.out.println("Spectacolul cu id-ul 3 nu exista in baza de date!!");
                        }
                        break;
                    case 10:
                        System.out.println("Afisare clienti");
                        System.out.println(clientService.findAll());
                        break;
                    case 11:
                        System.out.println("Afisare filme");
                        System.out.println(filmService.findAll());
                        break;
                    case 12:
                        System.out.println("Afisare spectacole");
                        System.out.println(spectacolService.findAll());
                        break;
                    default:
                        System.out.println("Nu exista cazul " + n + " !!");
                }
            }
        });
    }

    private void insertClients(ClientService clientService){
        clientService.save(new Client("Andrei", 21, "DA"));
        clientService.save(new Client("Ana", 17, "NU"));
        clientService.save(new Client("Ana", 14, "DA"));
        clientService.save(new Client("Matei", 12, "NU"));
        clientService.save(new Client("Marius", 8, "DA"));
        clientService.save(new Client("Darius", 19, "DA"));
        clientService.save(new Client("Raul", 27, "DA"));
        clientService.save(new Client("Catalin", 13, "DA"));
        clientService.save(new Client("Vasile", 33, "DA"));
        clientService.save(new Client("Bogdan", 65, "DA"));
    }

    private void insertFilm(FilmService filmService){
        filmService.save(new Film("Aftermath", "horror", 15, "simplu", "12:15 06-04-2020 Mi", 34, 18, "Peter Winther",
                "Ashley Greene, Shawn Ashmo, Jason Liles"));
        filmService.save(new Film("Amar", "drama", 12, "premiera", "22:30 12-10-2021 V", 56, 25, "Pol Monta",
                "Maria Pedraza, Sonia Almarcha, Greta Fernand"));
        filmService.save(new Film("Avengers", "actiune", 12, "avanpremiera", "20:30 12-03-2020 L", 50, 26,
                "Joss Whedon", "Scarlett Johanson, Robert Downey, Chris Evans"));
        filmService.save(new Film("Baghul", "horror", 21, "premiera", "14:55 04-08-2021 J", 75, 25, "Scott Derickson",
                "Ethan Hawke, James Ranson, Clare Foley"));
        filmService.save(new Film("Infinite", "actiune", 18, "simplu", "11:12 13-03-2021 S", 21, 22, "Antoine Fuqua",
                "Mark Walhberg, Chris Evans, Dylan O'Brien"));
        filmService.save(new Film("King", "drama", 15, "avanpremiera", "16:45 21-07-2020 S", 87, 28, "David Michord",
                "Robert Patinson, Joel Edgerton"));
        filmService.save(new Film("Liar", "comedie", 12, "premiera", "20:45 14-12-2021 D", 34, 26, "James Strong",
                "Ioan Gruffudd, Shelley Conn"));
        filmService.save(new Film("Nun", "horror", 18, "avanpremiera", "23:15 21-09-2021 V", 78, 30, "Corin Hardy",
                "Taisa Framiga, Vera Farmiga, Patrick Wilson"));
        filmService.save(new Film("Spiderman", "comedie", 12, "premiera", "10:15 23-12-2020 Ma", 35, 22, "John Wats",
                "Jamie Fox, Benedict Cumdum, Tom Holland"));
        filmService.save(new Film("Terminator", "actiune", 15, "simplu", "21:15 23-07-2021 Mi", 67, 20, "Tim Miller",
                "Arnold Schwarzeneger, Linda Hamilton"));
    }

    public void insertSpectacol(SpectacolService spectacolService){
        spectacolService.save(new Spectacol("Aievea", "populara", "09-12-2021", "Bucuresti", "Andra", "20-22"));
        spectacolService.save(new Spectacol("Concert Arenele Romane", "electro", "12-05-2021", "Brasov", "Kraftwerk", "19-20"));
        spectacolService.save(new Spectacol("Crazy Rock", "rap", "21-03-2021", "Cluj-Napoca", "Confessions", "12-18"));
        spectacolService.save(new Spectacol("Emerald Island", "pop", "09-08-2020", "Sibiu", "Caro Emerald", "21-24"));
        spectacolService.save(new Spectacol("Foreigner", "rock", "06-12-2021", "Iasi", "Bone Man", "16-19"));
    }
}
