/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import edu.sime.entity.Ventas;
import edu.sime.facade.VentasFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "registroVentasRequest")
@RequestScoped
public class RegistroVentasRequest implements Serializable {
    
    @EJB
    VentasFacadeLocal ventasFacadeLocal;
    
    private Ventas ventaReg = new Ventas();
    
    

    /**
     * Creates a new instance of RegistroVentasRequest
     */
    public RegistroVentasRequest() {
    }
    
            public void registrarVenta() {
        String mensaje = "";
        try {
            ventasFacadeLocal.create(ventaReg);
            mensaje = "Swal.fire('Venta registrado !!!!', 'Correctamente', 'success');";
            ventaReg = new Ventas();
        } catch (Exception e) {
            System.out.println("Error al registrar una Ventas RegistroVentasRequest: registrarVenta " + e.getMessage());
            mensaje = "Swal.fire('Error al registrar Venta !!!!', 'Venta existente en el sistema', 'error')";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public Ventas getVentaReg() {
        return ventaReg;
    }

    public void setVentaReg(Ventas ventaReg) {
        this.ventaReg = ventaReg;
    }
    
}
