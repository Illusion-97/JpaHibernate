package fr.dawan.jpahibernate.entities.lifecycle;

import fr.dawan.jpahibernate.entities.Audit;
import fr.dawan.jpahibernate.entities.heritage.MappedSuperClass.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Alive extends BaseEntity {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Alive{" +
                "id='" + getId() + '\'' +
                ", version='" + getVersion() + '\'' +
                ", text='" + text + '\'' +
                '}';
    }


    @PrePersist // Déclenché AVANT la création en BDD
    public void prePersist() {
        System.out.println("\u001B[36mAlive.prePersist\u001B[0m");
        System.out.println("getId() = \u001B[31m" + getId() + "\u001B[0m");
    }

    @PostPersist // Déclenché APRES création
    public void postPersist() {
        System.out.println("\u001B[36mAlive.postPersist\u001B[0m");
        System.out.println("getId() = \u001B[31m" + getId() + "\u001B[0m");
    }

    @PreUpdate // AVANT Mise à jour
    public void preUpdate() {
        System.out.println("\u001B[36mAlive.preUpdate\u001B[0m");
        System.out.println("getVersion() = \u001B[31m" + getVersion() + "\u001B[0m");
    }

    @PostUpdate // Apres Mise à jour
    public void postUpdate() {
        System.out.println("\u001B[36mAlive.postUpdate\u001B[0m");
        System.out.println("getVersion() = \u001B[31m" + getVersion() + "\u001B[0m");
    }

    @PostLoad  // APRES lecture en BDD
    public void postLoad() {
        System.out.println("\u001B[36mAlive.postLoad\u001B[0m");
        System.out.println("text = \u001B[31m" + text + "\u001B[0m");
    }

    @PreRemove // AVANT suppression
    public void preRemove() {
        System.out.println("\u001B[36mAlive.preRemove\u001B[0m");
        System.out.println("getId() = \u001B[31m" + getId() + "\u001B[0m");
    }

    @PostRemove // Apres supression
    public void postRemove() {
        System.out.println("\u001B[36mAlive.postRemove\u001B[0m");
        System.out.println("getId() = \u001B[31m" + getId() + "\u001B[0m");
        Audit.saveHistory(this);
    }
}
