/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.Empleados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAVILON
 */
@Local
public interface EmpleadosFacadeLocal {

    void create(Empleados empleados);

    void edit(Empleados empleados);

    void remove(Empleados empleados);

    Empleados find(Object id);

    List<Empleados> findAll();

    List<Empleados> findRange(int[] range);

    int count();

    public Empleados loginUsuario(String corro, String clave);

    public Empleados recuperarClave(String correo);
    
}
