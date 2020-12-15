/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.AtencionAlCliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PAVILON
 */
@Local
public interface AtencionAlClienteFacadeLocal {

    void create(AtencionAlCliente atencionAlCliente);

    void edit(AtencionAlCliente atencionAlCliente);

    void remove(AtencionAlCliente atencionAlCliente);

    AtencionAlCliente find(Object id);

    List<AtencionAlCliente> findAll();

    List<AtencionAlCliente> findRange(int[] range);

    int count();
    
}
