/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.Produccion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PAVILON
 */
@Stateless
public class ProduccionFacade extends AbstractFacade<Produccion> implements ProduccionFacadeLocal {

    @PersistenceContext(unitName = "AppSime2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduccionFacade() {
        super(Produccion.class);
    }
    
}
