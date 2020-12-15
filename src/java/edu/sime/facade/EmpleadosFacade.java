/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.facade;

import edu.sime.entity.Empleados;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PAVILON
 */
@Stateless
public class EmpleadosFacade extends AbstractFacade<Empleados> implements EmpleadosFacadeLocal {

    @PersistenceContext(unitName = "AppSime2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadosFacade() {
        super(Empleados.class);
    }
    
    @Override
    public Empleados loginUsuario(String correo, String clave) {
        try {
            Query qt;
            qt = em.createQuery("SELECT u FROM Empleados u WHERE u.emailEmpleado = :emailEmpleado AND u.contrasenaEmpleado =:contrasenaEmpleado");
            qt.setParameter("emailEmpleado", correo);
            qt.setParameter("contrasenaEmpleado", clave);
            return (Empleados) qt.getSingleResult();

        } catch (Exception e) {
            return new Empleados();
        }

    }
    @Override
    public Empleados recuperarClave(String correo) {
        try {
            Query qt;
            qt = em.createQuery("SELECT u FROM Empleados u WHERE u.emailEmpleado = :emailEmpleado");
            qt.setParameter("emailEmpleado", correo);
            return (Empleados) qt.getSingleResult();

        } catch (Exception e) {
            return new Empleados();
        }

    }
    
}
