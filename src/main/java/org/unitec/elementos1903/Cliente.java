/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Servicios Especiales
 */

public class Cliente {
    @Id
    private Integer Id;

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", nombre=" + nombre + ", emai=" + emai + '}';
    }
 
    public Cliente() {
    }

    public Cliente(Integer Id, String nombre, String emai) {
        this.Id = Id;
        this.nombre = nombre;
        this.emai = emai;
    }
    private String nombre;
    private String emai;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
}
