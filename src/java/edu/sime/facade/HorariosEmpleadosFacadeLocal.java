/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.HorariosEmpleados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAVILON
 */
@Local
public interface HorariosEmpleadosFacadeLocal {

    void create(HorariosEmpleados horariosEmpleados);

    void edit(HorariosEmpleados horariosEmpleados);

    void remove(HorariosEmpleados horariosEmpleados);

    HorariosEmpleados find(Object id);

    List<HorariosEmpleados> findAll();

    List<HorariosEmpleados> findRange(int[] range);

    int count();
    
}
