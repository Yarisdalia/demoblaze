package com.demoblaze;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    // Atributtos o propiedades
    private String nombre;
    private String direccion;
    private int cantidadAnnosDeCreada;
    private ArrayList<Persona> empleados = new ArrayList<>();

    // Constructor
    public Empresa (String nombre, String direccion, int cantidadAnnosDeCreada) throws Exception {
        if (nombre.length() < 2){
            throw new Exception("El nombre de la empresa no puede tener menos de 2 caracteres");
        }
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadAnnosDeCreada = cantidadAnnosDeCreada;
    }

    // Getters y Setters
    public int getCantidadAnnosDeCreada() {
        return cantidadAnnosDeCreada;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadAnnosDeCreada(int cantidadAnnosDeCreada) {
        this.cantidadAnnosDeCreada = cantidadAnnosDeCreada;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Funcionalidades
    public int cantTotalPersonalEmpresa(){
        return this.empleados.size();
    }

    public void contratarEmpleados (Persona empleados) {
        this.empleados.add(empleados);
    }
}
