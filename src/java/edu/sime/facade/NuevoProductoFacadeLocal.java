/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.NuevoProducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAVILON
 */
@Local
public interface NuevoProductoFacadeLocal {

    void create(NuevoProducto nuevoProducto);

    void edit(NuevoProducto nuevoProducto);

    void remove(NuevoProducto nuevoProducto);

    NuevoProducto find(Object id);

    List<NuevoProducto> findAll();

    List<NuevoProducto> findRange(int[] range);

    int count();
    
}
