package fr.dawan.jpahibernate.entities.heritage.Joining;

import jakarta.persistence.Entity;

@Entity
public class J_BarB extends J_Foo {
    private String valB = "J_Bar_B";

    public String getValB() {
        return valB;
    }

    public void setValB(String valB) {
        this.valB = valB;
    }
}
