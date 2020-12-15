/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import com.mysql.jdbc.Connection;
import edu.sime.entity.Empleados;
import edu.sime.facade.EmpleadosFacadeLocal;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.primefaces.PrimeFaces;

/**
 *
 * @author PAVILON
 */
@Named(value = "gestionUsuariosView")
@ViewScoped
public class GestionUsuariosView implements Serializable {

    @EJB
    EmpleadosFacadeLocal empleadosFacadeLocal;

    @Inject
    UsuarioSesion usuarioSesion;

    private Empleados emplEditar = new Empleados();
    private Empleados emplNuevo = new Empleados();

    private ArrayList<Empleados> listaEmpleados = new ArrayList<>();

    @PostConstruct
    public void cargaListaEmpleados() {
        listaEmpleados.addAll(empleadosFacadeLocal.findAll());
    }

    public void cargaEditarEmpleado(Empleados emplRemov) {
        emplEditar = emplRemov;
    }

    public void eliminarEmple(Empleados emplRemov) {
        String mensaje = "";
        try {
            empleadosFacadeLocal.remove(emplRemov);
            mensaje = "Swal.fire('Empleado Eliminado !!!!', 'Correctamente', 'success');";
            listaEmpleados.remove(emplRemov);

        } catch (Exception e) {
            System.out.println("edu.controlador.GestionUsuariosView.eliminarEmple " + e.getMessage());
            mensaje = "Swal.fire(Error al eliminado Empleado !!!!', 'Empleado no Eliminada', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);

    }

    /**
     *
     */
    public void editarEmpleado() {
        String mensaje = "";
        try {
            empleadosFacadeLocal.edit(emplEditar);
            mensaje = "swal('Usuario actualizado !!!!', 'Correctamente', 'success');";
        } catch (Exception e) {
            System.out.println("edu.app.controlador.GestionUsuariosView.editarUsuario() " + e.getMessage());
            mensaje = "swal('Error actualizando !!!!', 'Usuario', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public void registrarEmpleado() {
        String mensaje = "";
        try {
            empleadosFacadeLocal.create(emplNuevo);
            mensaje = "Swal.fire('Usuario registrado !!!!', 'Correctamente', 'success');";
            listaEmpleados.add(emplNuevo);
        } catch (Exception e) {
            System.out.println("Error al registrar un usuario RegistroRequest: registrarEmpleado " + e.getMessage());
            mensaje = "Swal.fire('Error al registrar usuario !!!!', 'Usuario existente en el sistema', 'error')";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    

    /**
     * Creates a new instance of GestionUsuariosView
     */
    public GestionUsuariosView() {
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleados getEmplEditar() {
        return emplEditar;
    }

    public void setEmplEditar(Empleados emplEditar) {
        this.emplEditar = emplEditar;
    }

    public Empleados getEmplNuevo() {
        return emplNuevo;
    }

    public void setEmplNuevo(Empleados emplNuevo) {
        this.emplNuevo = emplNuevo;
    }

}
