package com.example.tema1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * The type Client.
 */
@Getter
@Setter
@Entity
public class Client extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private int varsta;
    private String certificatVerde;

    /**
     * Instantiates a new Client.
     *
     * @param nume            the nume
     * @param varsta          the varsta
     * @param certificatVerde the certificat verde
     */
    public Client(String nume, int varsta, String certificatVerde) {
        super(nume);
        this.varsta = varsta;
        this.certificatVerde = certificatVerde;
    }

    /**
     * Instantiates a new Client.
     */
    public Client() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets varsta.
     *
     * @return the varsta
     */
    public int getVarsta() {
        return varsta;
    }

    /**
     * Sets varsta.
     *
     * @param varsta the varsta
     */
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    /**
     * Gets certificat verde.
     *
     * @return the certificat verde
     */
    public String getCertificatVerde() {
        return certificatVerde;
    }

    /**
     * Sets certificat verde.
     *
     * @param certificatVerde the certificat verde
     */
    public void setCertificatVerde(String certificatVerde) {
        this.certificatVerde = certificatVerde;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + this.getNume() + '\'' +
                ", varsta=" + varsta +
                ", certificatVerde='" + certificatVerde + '\'' +
                '}' ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Client;
    }
}
