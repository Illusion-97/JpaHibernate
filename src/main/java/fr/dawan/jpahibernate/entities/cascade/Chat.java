package fr.dawan.jpahibernate.entities.cascade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean gros;
    private boolean ingrat;
    private boolean pickpocket;
    private boolean lazy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isGros() {
        return gros;
    }

    public void setGros(boolean gros) {
        this.gros = gros;
    }

    public boolean isIngrat() {
        return ingrat;
    }

    public void setIngrat(boolean ingrat) {
        this.ingrat = ingrat;
    }

    public boolean isPickpocket() {
        return pickpocket;
    }

    public void setPickpocket(boolean pickpocket) {
        this.pickpocket = pickpocket;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }
}
