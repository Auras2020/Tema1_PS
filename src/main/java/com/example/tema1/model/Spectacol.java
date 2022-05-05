package com.example.tema1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * The type Spectacol.
 */
@Getter
@Setter
@Entity
public class Spectacol extends Event{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String tip_muzica;
    private String locatie;
    private String artisti;
    private String interval_orar;

    /**
     * Instantiates a new Spectacol.
     *
     * @param nume          the nume
     * @param tip_muzica    the tip muzica
     * @param data          the data
     * @param locatie       the locatie
     * @param artisti       the artisti
     * @param interval_orar the interval orar
     */
    public Spectacol(String nume, String tip_muzica, String data, String locatie, String artisti, String interval_orar) {
        super(nume, data);
        this.tip_muzica = tip_muzica;
        this.locatie = locatie;
        this.artisti = artisti;
        this.interval_orar = interval_orar;
    }

    /**
     * Instantiates a new Spectacol.
     */
    public Spectacol() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets tip muzica.
     *
     * @return the tip muzica
     */
    public String getTip_muzica() {
        return tip_muzica;
    }

    /**
     * Sets tip muzica.
     *
     * @param tip_muzica the tip muzica
     */
    public void setTip_muzica(String tip_muzica) {
        this.tip_muzica = tip_muzica;
    }

    /**
     * Gets locatie.
     *
     * @return the locatie
     */
    public String getLocatie() {
        return locatie;
    }

    /**
     * Sets locatie.
     *
     * @param locatie the locatie
     */
    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    /**
     * Gets artisti.
     *
     * @return the artisti
     */
    public String getArtisti() {
        return artisti;
    }

    /**
     * Sets artisti.
     *
     * @param artisti the artisti
     */
    public void setArtisti(String artisti) {
        this.artisti = artisti;
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

    @Override
    public String toString() {
        return "Spectacol{" +
                "id=" + id +
                ", nume='" + this.getNume() + '\'' +
                ", tip_muzica='" + tip_muzica + '\'' +
                ", data='" + this.getData() + '\'' +
                ", locatie='" + locatie + '\'' +
                ", artisti='" + artisti + '\'' +
                ", interval_orar='" + interval_orar + '\'' +
                '}' ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Spectacol;
    }
}
