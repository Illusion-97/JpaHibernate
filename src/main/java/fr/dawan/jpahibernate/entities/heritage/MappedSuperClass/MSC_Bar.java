package fr.dawan.jpahibernate.entities.heritage.MappedSuperClass;

import fr.dawan.jpahibernate.entities.cascade.Chat;
import fr.dawan.jpahibernate.entities.cascade.Chien;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class MSC_Bar extends BaseEntity {
    private String animalerie;

    @OneToMany
    private List<Chien> chiens;

    public String getAnimalerie() {
        return animalerie;
    }

    public void setAnimalerie(String animalerie) {
        this.animalerie = animalerie;
    }

    public List<Chien> getChiens() {
        return chiens;
    }

    public void setChiens(List<Chien> chiens) {
        this.chiens = chiens;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    @OneToMany
    private List<Chat> chats;
}
