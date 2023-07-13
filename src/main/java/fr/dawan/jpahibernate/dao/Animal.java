package fr.dawan.jpahibernate.dao;

import fr.dawan.jpahibernate.entities.heritage.MappedSuperClass.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NamedQuery(name = "Animal.findAll", query = "FROM Animal ")
public class Animal extends BaseEntity {
    private String name;
    @Temporal(TemporalType.DATE)
    private LocalDate birthday;

    @ManyToMany
    private Set<Animal> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Set<Animal> getChildren() {
        return children;
    }

    public void setChildren(Set<Animal> children) {
        this.children = children;
    }
}
