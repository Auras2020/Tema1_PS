package com.example.tema1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * The type Angajat.
 */
@Getter
@Setter
@Entity
public class Angajat extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String interval_orar;
    private int post_de_munca;

    /**
     * Instantiates a new Angajat.
     *
     * @param nume          the nume
     * @param interval_orar the interval orar
     * @param post_de_munca the post de munca
     */
    public Angajat(String nume, String interval_orar, int post_de_munca) {
        super(nume);
        this.interval_orar = interval_orar;
        this.post_de_munca = post_de_munca;
    }

    /**
     * Instantiates a new Angajat.
     */
    public Angajat() {

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
     * Gets post de munca.
     *
     * @return the post de munca
     */
    public int getPost_de_munca() {
        return post_de_munca;
    }

    /**
     * Sets post de munca.
     *
     * @param post_de_munca the post de munca
     */
    public void setPost_de_munca(int post_de_munca) {
        this.post_de_munca = post_de_munca;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", nume='" + this.getNume() + '\'' +
                ", interval_orar='" + interval_orar + '\'' +
                ", post_de_munca=" + post_de_munca +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Angajat;
    }
}
