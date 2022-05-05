package com.example.tema1.model;

/**
 * The type User factory.
 */
public class UserFactory {
    /**
     * Create user user.
     * cream instante de angajati, clienti si vanzatori pe care le vom folosi pentru a le insera in baza de date
     * @param userType the user type
     * @return the user
     */
    public User createUser(UserType userType){
        if(userType.equals(UserType.ANGAJAT)){
            return new Angajat("Pavel", "12-20", 1);
        }
        if(userType.equals(UserType.CLIENT)){
            return new Client("Ana", 21, "DA");
        }
        if(userType.equals(UserType.VANZATOR)){
            return new Vanzator("Gabi", "8-12", 1);
        }
        return null;
    }
}
