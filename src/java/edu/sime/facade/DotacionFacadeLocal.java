/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.Dotacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAVILON
 */
@Local
public interface DotacionFacadeLocal {

    void create(Dotacion dotacion);

    void edit(Dotacion dotacion);

    void remove(Dotacion dotacion);

    Dotacion find(Object id);

    List<Dotacion> findAll();

    List<Dotacion> findRange(int[] range);

    int count();
    
}
