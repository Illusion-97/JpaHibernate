package fr.dawan.jpahibernate.entities.heritage.MappedSuperClass;

import fr.dawan.jpahibernate.entities.cascade.Personne;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class MSC_Foo extends BaseEntity {
    private String name;

    @ManyToOne
    private Personne personne;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
