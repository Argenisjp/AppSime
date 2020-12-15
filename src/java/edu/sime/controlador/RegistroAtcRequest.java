/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import edu.sime.entity.AtencionAlCliente;
import edu.sime.facade.AtencionAlClienteFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "registroAtcRequest")
@RequestScoped
public class RegistroAtcRequest implements Serializable{
    @EJB
    AtencionAlClienteFacadeLocal atencionAlClienteFacadeLocal;
    
    private AtencionAlCliente regPqr = new AtencionAlCliente();

    /**
     * Creates a new instance of RegistroAtcRequest
     */
    public RegistroAtcRequest() {
    }
    
    public void registarPeticion(){
        String mensaje ="";
        try {
            atencionAlClienteFacadeLocal.create(regPqr);
            mensaje = "Swal.fire('Empleado Eliminado !!!!', 'Correctamente', 'success');";
            regPqr = new AtencionAlCliente();
            
        } catch (Exception e) {
            System.out.println("Error al enviarla solicitud RegistroAtcRequest: registarPeticion " + e.getMessage());
            mensaje = "Swal.fire('Error al enviar Solicitud !!!!', 'Solicitud no enviada', 'error')";
        }
        
        PrimeFaces.current().executeScript(mensaje);
    }

    public AtencionAlCliente getRegPqr() {
        return regPqr;
    }

    public void setRegPqr(AtencionAlCliente regPqr) {
        this.regPqr = regPqr;
    }
    
}
