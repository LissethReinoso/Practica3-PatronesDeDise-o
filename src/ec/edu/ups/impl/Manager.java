/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.impl;

import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.interfaz.Empleado;

/**
 *
 * @author Usuario
 */
public class Manager implements Empleado {
    
    private List<Empleado> empleados = new ArrayList<>();
    private String nombre;

    public Manager(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public List<Empleado> getEmpleados() {
        return this.empleados;
    }

    @Override
    public void add(Empleado e) {
        if (e != null) {
            this.empleados.add(e);
        }
    }

    @Override
    public void remove(Empleado e) {
        if (e != null) {
            this.empleados.remove(e);
        }
    }

    @Override
    public int calcularPuntos() {
        if (this.empleados.isEmpty()) {
            return 0;
        }
        return Math.round(this.empleados.stream().mapToInt(e -> {
            System.out.println(e);
            return e.calcularPuntos();
        }).sum());
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    
}
