package com.person.proyect_person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

    @Id
    @Column(name = "id_persona")
    private int id_persona;

    @Column(name="nombre", length=50)
    private String nombre;


    public Persona() {
    }

    public Persona(int id_persona, String nombre) {
        this.id_persona = id_persona;
        this.nombre = nombre;
    }


    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
