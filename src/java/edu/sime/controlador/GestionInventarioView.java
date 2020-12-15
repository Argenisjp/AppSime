/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import com.mysql.jdbc.Connection;
import edu.sime.entity.Inventario;
import edu.sime.facade.InventarioFacadeLocal;
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
@Named(value = "gestionInventarioView")
@ViewScoped
public class GestionInventarioView implements Serializable {

    @EJB
    InventarioFacadeLocal inventarioFacadeLocal;
    
    @Inject
    UsuarioSesion usuarioSesion;

    private Inventario inveEdit = new Inventario();

    private ArrayList<Inventario> listaInventario = new ArrayList<>();

    /**
     * Creates a new instance of GestionInventarioView
     */
    public GestionInventarioView() {
    }

    @PostConstruct
    public void cargarListaInventario() {
        listaInventario.addAll(inventarioFacadeLocal.findAll());
    }

    public void cargarEditInventario(Inventario invRemov) {
        inveEdit = invRemov;

    }

    public void editarInven() {
        String mensaje = "";
        try {
            inventarioFacadeLocal.edit(inveEdit);
            mensaje = "Swal.fire('Inventario actualizado !!!!', 'Correctamente', 'success');";
        } catch (Exception e) {
            System.out.println("edu.sime.controlador.GestionInventarioView.editarInven() " + e.getMessage());
            mensaje = "Swal.fire(Error al actualizar Inventario !!!!', 'Inventario no actualizaado', 'error');";
        }

        PrimeFaces.current().executeScript(mensaje);
    }

    public void eliminarInventario(Inventario invRemov) {
        String mensaje = "";
        try {
            inventarioFacadeLocal.remove(invRemov);
            mensaje = "Swal.fire('Mercancia Eliminado !!!!', 'Correctamente', 'success');";
            listaInventario.remove(invRemov);

        } catch (Exception e) {
            System.out.println("edu.controlador.GestionInventarioView.eliminarInventario " + e.getMessage());
            mensaje = "Swal.fire(Error al eliminar Mercancia !!!!', 'Mercancia no Eliminada', 'error');";
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
            parametro.put("RutaImg", context.getRealPath("resources/img/inventario.jpg"));
            Connection conec = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/iroko", "argenis", "Geniio");
            File jasper = new File(context.getRealPath("/WEB-INF/classes/edu/sime/reportes/ReporteInventario.jasper"));

            JasperPrint jp = JasperFillManager.fillReport(jasper.getPath(), parametro, conec);

            HttpServletResponse hsr = (HttpServletResponse) context.getResponse();
            hsr.addHeader("Content-disposition", "attachment; filename=Lista Inventario.pdf");
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

    public ArrayList<Inventario> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(ArrayList<Inventario> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public Inventario getInveEdit() {
        return inveEdit;
    }

    public void setInveEdit(Inventario inveEdit) {
        this.inveEdit = inveEdit;
    }

}
