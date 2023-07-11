package fr.dawan.jpahibernate.entities.cascade;

import jakarta.persistence.*;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String prenom;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Personne persist;

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

    public Personne getPersist() {
        return persist;
    }

    public void setPersist(Personne persist) {
        this.persist = persist;
    }
}
