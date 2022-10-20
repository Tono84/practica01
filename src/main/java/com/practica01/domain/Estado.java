/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

import lombok.Data;

/**
 *
 * @author joses
 */
@Data
public class Estado {
    private String nombre;
    private int poblacion;
    private String costas;
    private String capital;
    private String moneda;

    public Estado() {
    }
   
    public Estado(String nombre, int poblacion, String costas, String capital, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.costas = costas;
        this.capital = capital;
        this.moneda = moneda;
    }
    
    
}
