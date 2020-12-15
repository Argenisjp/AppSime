/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import edu.sime.entity.Inventario;
import edu.sime.facade.InventarioFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "registroInventaroRequest")
@RequestScoped
public class RegistroInventaroRequest implements Serializable {
    @EJB
    InventarioFacadeLocal inventarioFacadeLocal;
    
    private Inventario invenReg = new Inventario();
    
    

    /**
     * Creates a new instance of RegistroInventaroRequest
     */
    public RegistroInventaroRequest() {
    }
    
           public void registrarInventario() {
        String mensaje = "";
        try {
            inventarioFacadeLocal.create(invenReg);
            mensaje = "Swal.fire('Mercancia registrada en inventario !!!!', 'Correctamente', 'success');";
            invenReg = new Inventario();
        } catch (Exception e) {
            System.out.println("Error al registrar una mercancia RegistroInventaroRequest: registrarInventario " + e.getMessage());
            mensaje = "Swal.fire('Error al registrar mercancia !!!!', 'Mercancia existente en inventario', 'error')";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public Inventario getInvenReg() {
        return invenReg;
    }

    public void setInvenReg(Inventario invenReg) {
        this.invenReg = invenReg;
    }
    
}
