package com.example.DentalCoworking.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gabinetes_libres")
public class Cabinete implements Serializable {

    /**
     * atributo id autogenerado
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;
    @Column(name = "condition")
    private boolean condition;



    //constructores
    public Cabinete() {
    }

    public Cabinete(Long id, String type, boolean condition) {
        this.id = id;
        this.type = type;
        this.condition = condition;
    }

    //asociaciones


    //getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    //toString

    @Override
    public String toString() {
        return "Gabinete{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", condition=" + condition +
                '}';
    }
}
