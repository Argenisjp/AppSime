/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import edu.sime.entity.Empleados;
import edu.sime.facade.EmpleadosFacadeLocal;
import edu.sime.utilidades.Email;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "registroRequest")
@RequestScoped
public class RegistroRequest implements Serializable {

    @EJB
    EmpleadosFacadeLocal empleadosFacadeLocal;
   

    private String correoIn = "";
    private Empleados usuReg = new Empleados();
    
 

    /**
     * Creates a new instance of RegistroRequest
     */
    public RegistroRequest() {
    }

    public void registrarEmpleado() {
        String mensaje = "";
        try {
            empleadosFacadeLocal.create(usuReg);
            mensaje = "Swal.fire('Usuario registrado !!!!', 'Correctamente', 'success');";
            usuReg = new Empleados();
        } catch (Exception e) {
            System.out.println("Error al registrar un usuario RegistroRequest: registrarEmpleado " + e.getMessage());
            mensaje = "Swal.fire('Error al registrar usuario !!!!', 'Usuario existente en el sistema', 'error')";
        }

        PrimeFaces.current().executeScript(mensaje);
    }


    public void recuperarClave() {
        String mensaje = "";
        try {
            Empleados usuRecuperado = empleadosFacadeLocal.recuperarClave(correoIn);

            if (usuRecuperado.getIDempleado() == null) {
                mensaje = "Swal.fire('No se encontro ningun correo !!!!', 'Registrado existente en el sistema', 'error')";

            } else {

                Email.sendClaves(usuRecuperado.getEmailEmpleado(), usuRecuperado.getNombreEmpleado() + " " + usuRecuperado.getApellidoEmpleado(), usuRecuperado.getContrasenaEmpleado());
                mensaje = "Swal.fire('Clave enviada a su  !!!!', ' correo electronico', 'success');";

            }

        } catch (Exception e) {
            System.out.println("Error al registrar un usuario RegistroRequest: recuperarClave " + e.getMessage());
            mensaje = "Swal.fire('No se encontro ningun correo !!!!', 'Registrado existente en el sistema', 'error')";
        }

        this.correoIn = "";
        PrimeFaces.current().executeScript(mensaje);
    }

    public Empleados getUsuReg() {
        return usuReg;
    }

    public void setUsuReg(Empleados usuReg) {
        this.usuReg = usuReg;
    }

    public String getCorreoIn() {
        return correoIn;
    }

    public void setCorreoIn(String correoIn) {
        this.correoIn = correoIn;
    }

   

}
