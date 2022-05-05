package com.example.tema1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * The type Vanzator.
 */
@Getter
@Setter
@Entity
public class Vanzator extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String interval_orar;
    private int numar_casa;

    /**
     * Instantiates a new Vanzator.
     *
     * @param nume          the nume
     * @param interval_orar the interval orar
     * @param numar_casa    the numar casa
     */
    public Vanzator(String nume, String interval_orar, int numar_casa) {
        super(nume);
        this.interval_orar = interval_orar;
        this.numar_casa = numar_casa;
    }

    /**
     * Instantiates a new Vanzator.
     */
    public Vanzator() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets interval orar.
     *
     * @return the interval orar
     */
    public String getInterval_orar() {
        return interval_orar;
    }

    /**
     * Sets interval orar.
     *
     * @param interval_orar the interval orar
     */
    public void setInterval_orar(String interval_orar) {
        this.interval_orar = interval_orar;
    }

    /**
     * Gets numar casa.
     *
     * @return the numar casa
     */
    public int getNumar_casa() {
        return numar_casa;
    }

    /**
     * Sets numar casa.
     *
     * @param numar_casa the numar casa
     */
    public void setNumar_casa(int numar_casa) {
        this.numar_casa = numar_casa;
    }

    @Override
    public String toString() {
        return "Vanzator{" +
                "id=" + id +
                ", nume='" + this.getNume() + '\'' +
                ", interval_orar='" + interval_orar + '\'' +
                ", numar_casa=" + numar_casa +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Vanzator;
    }
}
