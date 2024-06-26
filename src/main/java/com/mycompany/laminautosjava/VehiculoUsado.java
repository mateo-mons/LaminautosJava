/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laminautosjava;

/**
 *
 * @author mons
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VehiculoUsado extends Vehiculo {
    
    public int id_usado;
    public int kilometraje;
    public int siniestros;
    public double valorComercial;
    public double valorCompra;
    public Propietario propietario;
    

    // Constructor
    public VehiculoUsado(int id_usado, String marca, String modelo, String color, int cilindraje, int num_llantas, int anio, int kilometraje, int siniestros, double valorComercial, double valorCompra, Propietario propietario) {
        super(id_usado, marca, modelo, color, cilindraje, num_llantas, anio);
        this.id_usado = id_usado;
        this.kilometraje = kilometraje;
        this.siniestros = siniestros;
        this.valorComercial = valorComercial;
        this.valorCompra = valorCompra;
        this.propietario = propietario;
    }

    public void leerUsado() {
        System.out.println("----------------------------------------");
        System.out.println("Detalles del automóvil...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Número de llantas: " + num_llantas);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Siniestros: " + siniestros);
        System.out.println("Valor de venta: $" + calcularValorVenta());
        System.out.println("Propietario anterior: " +  propietario.getNombre());
        System.out.println("----------------------------------------");
    }

    public double calcularValorVenta() {
        double valorVenta = 1.35 *  this.valorCompra;

        // Reducción del valor comercial por siniestros
        if (siniestros > 0) {
            valorVenta -= (siniestros * 0.05 * valorVenta);
        }

        // Reducción del valor comercial por años anteriores a 2015
        if (anio < 2015) {
            int añosAntiguos = 2015 - anio;
            valorVenta -= (añosAntiguos * 0.05 * valorVenta);
        }

        // Reducción adicional si el modelo es anterior a 2005
        if (anio < 2005) {
            valorVenta -= 0.1 * valorVenta;
        }

        // Reducción adicional si el kilometraje supera 100,000 km
        if (kilometraje > 100000) {
            valorVenta-= 0.1 * valorVenta;
        }

        return valorVenta;
    }

    // Getters y setters
    public int getIdUsado() {
        return id_usado;
    }

    public void setIdUsado(int id_usado) {
        this.id_usado = id_usado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumLlantas() {
        return num_llantas;
    }

    public void setNumLlantas(int num_llantas) {
        this.num_llantas = num_llantas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getSiniestros() {
        return siniestros;
    }

    public void setSiniestros(int siniestros) {
        this.siniestros = siniestros;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getEstado() {
        return estado;
    }

}
