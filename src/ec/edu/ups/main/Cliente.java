/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

import ec.edu.ups.impl.*;

import ec.edu.ups.interfaz.Empleado;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    public static void main(String... args) {

        Empleado m1 = new Manager("Adrián");

        Empleado d1 = new Desarrollador("Maria");
        Empleado d2 = new Desarrollador("Ana ");
        Empleado d3 = new Desarrollador("Pedro");

        m1.add(d1);
        m1.add(d2);
        m1.add(d3);

        Empleado m2 = new Manager("Camila");

        Empleado d4 = new Desarrollador("Antonio");
        Empleado d5 = new Desarrollador("Paola");

        m2.add(d4);
        m2.add(d5);
        
        System.out.println(m1.calcularPuntos());
        System.out.println(m2.calcularPuntos());

    }
    
}
