package fr.dawan.jpahibernate.entities.heritage.TablePerClass;

import jakarta.persistence.Entity;

@Entity
public class TPC_BarB extends TPC_Foo {
    private String valB = "TPC_Bar_B";

    public String getValB() {
        return valB;
    }

    public void setValB(String valB) {
        this.valB = valB;
    }
}
