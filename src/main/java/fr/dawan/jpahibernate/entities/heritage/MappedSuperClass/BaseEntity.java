package fr.dawan.jpahibernate.entities.heritage.MappedSuperClass;

import jakarta.persistence.*;

@MappedSuperclass // Définis des comportements communs mais gérés individuellement
public class BaseEntity { // A utiliser sur "presque" toutes vos entités
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Version
    private int version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
