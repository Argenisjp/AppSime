/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import edu.sime.entity.Empleados;
import edu.sime.facade.EmpleadosFacadeLocal;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "usuarioSesion")
@SessionScoped
public class UsuarioSesion implements Serializable {

    @EJB
    EmpleadosFacadeLocal empleadosFacadeLocal;
    
    

    private String correo;
    private String clave;
    private Empleados usuLogin = new Empleados();

    /**
     * Creates a new instance of UsuarioSesion
     */
    public UsuarioSesion() {
    }

    public void validarUsuario() {
        String mensaje = "";
        try {
            usuLogin = empleadosFacadeLocal.loginUsuario(correo, clave);
            if (usuLogin.getIDempleado() == null) {
                mensaje = "Swal.fire('Usuario no registrado !!!!', 'En el sistema', 'error');";

            } else {
                FacesContext fc = FacesContext.getCurrentInstance();
                fc.getExternalContext().redirect("./index-admi.xhtml");

//            mensaje = "Swal.fire('Usuario registrado !!!!', 'Correctamente', 'success');";
            }

        } catch (IOException e) {
            mensaje = "Swal.fire('Usuario no registrado  !!!!', 'En el sistema', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public void actualizaMisDatos() {
        String mensaje = "";
        try {

            empleadosFacadeLocal.edit(usuLogin);
            mensaje = "Swal.fire('Datos actualizados  !!!!', 'Correctamente', 'success');";

        } catch (Exception e) {
            mensaje = "Swal.fire('Los datos no se pudieron actualizar  !!!!', 'En el sistema', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Empleados getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(Empleados usuLogin) {
        this.usuLogin = usuLogin;
    }

}
