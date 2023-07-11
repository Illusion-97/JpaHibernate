package fr.dawan.jpahibernate.entities.cascade;

import jakarta.persistence.*;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String prenom;

    @OneToOne(cascade = CascadeType.PERSIST) // Crée l'enregistrement pour 'persist' quand la personne est créée
    private Chien chien;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Chien getChien() {
        return chien;
    }

    public void setChien(Chien chien) {
        this.chien = chien;
    }
}
