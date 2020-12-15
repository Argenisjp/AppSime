/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.Produccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAVILON
 */
@Local
public interface ProduccionFacadeLocal {

    void create(Produccion produccion);

    void edit(Produccion produccion);

    void remove(Produccion produccion);

    Produccion find(Object id);

    List<Produccion> findAll();

    List<Produccion> findRange(int[] range);

    int count();
    
}
