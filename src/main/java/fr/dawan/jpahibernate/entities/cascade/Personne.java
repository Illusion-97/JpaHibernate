package fr.dawan.jpahibernate.entities.cascade;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String prenom;

    @OneToOne(cascade = CascadeType.PERSIST) // Crée l'enregistrement pour 'persist' quand la personne est créée
    private Chien chien;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, orphanRemoval = true) // Permet de mettre à jour une entité associée quand la personne est mise à jour
    private List<Chat> chats;
    // CascadeType.REMOVE est tres peu recommandé dans des relations ***ToMany
    // On ne supprimera pas d'association dans le cadre d'un ManyToMany
    // Mais il sera possible dans le cas d'un OneToMany de préciser avec ou sans autres cascades : orphanRemoval
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}) // Attention : évitez le plus possible les cascade Remove
    private List<Voiture> voitures;

    // Deux cascades existantes peu utiles pour JPA : CascadeType.REFRESH / CascadeType.DETACH
    // DETACH supprime la Synchronisation entre une entité récupérée en BDD (find) et REFRESH rétablis cette synchronisation
    // Les cascade de ces types, transmettent cette action aux entités associées

    // CascadeType.ALL allias -> {PERSIST,MERGE,REMOVE,REFRESH,DETACH} A éviter le plus possible
    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

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

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }
}
