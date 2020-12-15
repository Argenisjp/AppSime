/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.Dotacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PAVILON
 */
@Stateless
public class DotacionFacade extends AbstractFacade<Dotacion> implements DotacionFacadeLocal {

    @PersistenceContext(unitName = "AppSime2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DotacionFacade() {
        super(Dotacion.class);
    }
    
}
