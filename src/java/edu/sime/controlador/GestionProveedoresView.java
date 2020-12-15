/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import com.mysql.jdbc.Connection;
import edu.sime.entity.Empleados;
import edu.sime.entity.Proveedores;
import edu.sime.facade.ProveedoresFacadeLocal;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@Named(value = "gestionProveedoresView")
@ViewScoped
public class GestionProveedoresView implements Serializable {

    @Inject
    UsuarioSesion usuarioSesion;

    @EJB
    ProveedoresFacadeLocal proveedoresFacadeLocal;

    private Proveedores proveeEditar = new Proveedores();

    private ArrayList<Proveedores> listaPreovee = new ArrayList<>();

    /**
     *
     */
    @PostConstruct
    public void cargarListaProveedores() {
        listaPreovee.addAll(proveedoresFacadeLocal.findAll());
    }

    public void cargaEditarProveedor(Proveedores provRemov) {
        proveeEditar = provRemov;
    }

    /**
     * Creates a new instance of GestionProveedoresView
     */
    public GestionProveedoresView() {
    }

    public void editarProveedor() {
        String mensaje = "";
        try {
            proveedoresFacadeLocal.edit(proveeEditar);
            mensaje = "Swal.fire('Proveedor actualizado !!!!', 'Correctamente', 'success');";

        } catch (Exception e) {
            System.out.println("edu.controlador.GestionProveedoresView.editarProveedor " + e.getMessage());
            mensaje = "Swal.fire(Error al actualizar un Proveedor !!!!', 'Proveedor no actualizado', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);

    }

    public void eliminarProveedor(Proveedores provRemov) {
        String mensaje = "";
        try {
            proveedoresFacadeLocal.remove(provRemov);
            mensaje = "Swal.fire('Proveedor Eliminado !!!!', 'Correctamente', 'success');";
            listaPreovee.remove(provRemov);

        } catch (Exception e) {
            System.out.println("edu.controlador.GestionProveedoresView.eliminarProveedor " + e.getMessage());
            mensaje = "Swal.fire(Error al eliminar un Proveedor !!!!', 'Proveedor no Eliminada', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);

    }

    public void descargaReporte(String nombreReporte) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext context = facesContext.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();

        HttpServletResponse response = (HttpServletResponse) context.getResponse();
        response.setContentType("application/pdf");

        try {
            Map parametro = new HashMap();
            parametro.put("Ficha", "1966821");
            parametro.put("EmpleadoReporte", usuarioSesion.getUsuLogin().getNombreEmpleado() + " " + usuarioSesion.getUsuLogin().getApellidoEmpleado());
            parametro.put("RutaImg", context.getRealPath("resources/img/pro.png"));
            parametro.put("RutaImg2", context.getRealPath("resources/img/logo.png"));
            Connection conec = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/iroko", "argenis", "Geniio");
            File jasper = new File(context.getRealPath("/WEB-INF/classes/edu/sime/reportes/ReporteProveedores.jasper"));

            JasperPrint jp = JasperFillManager.fillReport(jasper.getPath(), parametro, conec);

            HttpServletResponse hsr = (HttpServletResponse) context.getResponse();
            hsr.addHeader("Content-disposition", "attachment; filename=Lista Proveedores.pdf");
            OutputStream os = hsr.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jp, os);
            os.flush();
            os.close();
            facesContext.responseComplete();

        } catch (JRException e) {
            System.out.println("edu.sime.controlador.GestionInventarioView.descargaReporte() " + e.getMessage());
        } catch (IOException i) {
            System.out.println("edu.sime.controlador.GestionInventarioView.descargaReporte() " + i.getMessage());
        } catch (SQLException q) {
            System.out.println("edu.sime.controlador.GestionInventarioView.descargaReporte() " + q.getMessage());
        }

    }

    public ArrayList<Proveedores> getListaPreovee() {
        return listaPreovee;
    }

    public void setListaPreovee(ArrayList<Proveedores> listaPreovee) {
        this.listaPreovee = listaPreovee;
    }

    public Proveedores getProveeEditar() {
        return proveeEditar;
    }

    public void setProveeEditar(Proveedores proveeEditar) {
        this.proveeEditar = proveeEditar;
    }

}
