/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import java.util.List;

/**
 *
 * @author Liss
 */

public interface Empleado {
    
    String getNombre();

    void add(Empleado e);

    void remove(Empleado e);

    List<Empleado> getEmpleados();

    int calcularPuntos();
    
}

