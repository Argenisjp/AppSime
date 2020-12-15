/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import edu.sime.entity.Proveedores;
import edu.sime.facade.ProveedoresFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "registroProveedoresRequest")
@RequestScoped
public class RegistroProveeRequest implements Serializable{
    @EJB
    ProveedoresFacadeLocal proveedoresFacadeLocal;
    
    private Proveedores provReg = new Proveedores();    

    /**
     * Creates a new instance of RegistroProveedoresRequest
     */
    public RegistroProveeRequest() {
    }
    
        public void registrarProveedor() {
        String mensaje = "";
        try {
            proveedoresFacadeLocal.create(provReg);
            mensaje = "Swal.fire('Proveedor registrado !!!!', 'Correctamente', 'success');";
            provReg = new Proveedores();
        } catch (Exception e) {
            System.out.println("Error al registrar un Proveedor RegistroRequest: registrarEmpleado " + e.getMessage());
            mensaje = "Swal.fire('Error al registrar Proveedor !!!!', 'Proveedor existente en el sistema', 'error')";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public Proveedores getProvReg() {
        return provReg;
    }

    public void setProvReg(Proveedores provReg) {
        this.provReg = provReg;
    }
    
}
