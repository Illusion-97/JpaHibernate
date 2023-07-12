package fr.dawan.jpahibernate.entities.heritage.SingleTable;

import jakarta.persistence.Entity;

@Entity
public class ST_BarA extends ST_Foo {
    // hérite de l'id de ST_Foo
    private boolean aBooleanA = true;

    public boolean isaBooleanA() {
        return aBooleanA;
    }

    public void setaBooleanA(boolean aBooleanA) {
        this.aBooleanA = aBooleanA;
    }
}
