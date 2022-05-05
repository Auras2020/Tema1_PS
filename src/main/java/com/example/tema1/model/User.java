package com.example.tema1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * The type User.
 */
@Getter
@Setter
@Entity
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nume;

    /**
     * Instantiates a new User.
     *
     * @param nume the nume
     */
    public User(String nume) {
        this.nume = nume;
    }

    /**
     * Instantiates a new User.
     */
    public User(){

    }

    /**
     * Gets nume.
     *
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * Sets nume.
     *
     * @param nume the nume
     */
    public void setNume(String nume) {
        this.nume = nume;
    }
}
