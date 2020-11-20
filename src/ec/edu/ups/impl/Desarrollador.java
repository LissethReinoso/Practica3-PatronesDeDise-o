/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.impl;

import java.util.List;
import java.util.Random;
import ec.edu.ups.interfaz.Empleado;

/**
 *
 * @author Usuario
 */
public class Desarrollador implements Empleado {
    
    String nombre;

    public Desarrollador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void add(Empleado e) {
        //esta es una hoja por lo el metodo añadir no es aplicable en esta clase
    }

    @Override
    public void remove(Empleado e) {
    //esta es una hoja por lo el metodo aremover no es aplicable en esta clase
    }

    @Override
    public List<Empleado> getEmpleados() {
   
     return null;
    }

    @Override
    public int calcularPuntos() {
        return new Random().nextInt(24);
    }

    @Override
    public String toString() {
        return "Soy " + getNombre() + ", Desarrollador/desarrolladora";
    }
}
