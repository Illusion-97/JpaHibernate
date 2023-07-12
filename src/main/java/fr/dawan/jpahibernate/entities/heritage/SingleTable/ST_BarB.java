package fr.dawan.jpahibernate.entities.heritage.SingleTable;

import jakarta.persistence.Entity;

@Entity
public class ST_BarB extends ST_Foo {
    // hérite de l'id de ST_Foo
    private boolean aBooleanB = false;

    public boolean isaBooleanB() {
        return aBooleanB;
    }

    public void setaBooleanB(boolean aBooleanB) {
        this.aBooleanB = aBooleanB;
    }
}
