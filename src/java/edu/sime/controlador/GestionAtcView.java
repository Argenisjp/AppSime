/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.controlador;

import com.mysql.jdbc.Connection;
import edu.sime.entity.AtencionAlCliente;
import edu.sime.facade.AtencionAlClienteFacadeLocal;

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
@Named(value = "gestionAtcView")
@ViewScoped
public class GestionAtcView implements Serializable {

    @EJB
    AtencionAlClienteFacadeLocal atencionAlClienteFacadeLocal;

    @Inject
    UsuarioSesion usuarioSesion;
    

    private ArrayList<AtencionAlCliente> listaAtc = new ArrayList<>();

    @PostConstruct
    public void cargarListaAtc() {
        listaAtc.addAll(atencionAlClienteFacadeLocal.findAll());
    }

    
    
    public void eliminarPqr(AtencionAlCliente pqrRemove){
        String mensaje = "";
        try {
            atencionAlClienteFacadeLocal.remove(pqrRemove);
            listaAtc.remove(pqrRemove);
            mensaje = "Swal.fire('Sugerencia Eliminado !!!!', 'Correctamente', 'success');";
        } catch (Exception e) {
            System.out.println("edu.sime.controlador.GestionAtcView.eliminarPqr() " + e.getMessage());
              mensaje = "Swal.fire(Error al eliminado sugerencia !!!!', 'Sugerencia no Eliminada', 'error');";
        }
        
        PrimeFaces.current().executeScript(mensaje);
        
    }

    /**
     * Creates a new instance of GestionAtcView
     */
    public GestionAtcView() {
    }

    public ArrayList<AtencionAlCliente> getListaAtc() {
        return listaAtc;
    }

    public void setListaAtc(ArrayList<AtencionAlCliente> listaAtc) {
        this.listaAtc = listaAtc;
    }
    
    
    
    
    
    
    
        public void descargaReporte(String nombreReporte)  {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext context = facesContext.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();

        HttpServletResponse response = (HttpServletResponse) context.getResponse();
        response.setContentType("application/pdf");

        try {
            Map parametro = new HashMap();
            parametro.put("Ficha", "1966821");
             parametro.put("AtcReporte", usuarioSesion.getUsuLogin().getNombreEmpleado() + " " + usuarioSesion.getUsuLogin().getApellidoEmpleado());
            parametro.put("RutaImg", context.getRealPath("resources/img/atCliente.jpg"));
            Connection conec = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/iroko", "argenis", "Geniio");
            File jasper = new File(context.getRealPath("/WEB-INF/classes/edu/sime/reportes/ReporteAtc.jasper"));
             
            JasperPrint jp = JasperFillManager.fillReport(jasper.getPath(), parametro, conec);
            
            HttpServletResponse hsr = (HttpServletResponse) context.getResponse();
            hsr.addHeader("Content-disposition", "attachment; filename=Lista Sugerencias.pdf");
            OutputStream os = hsr.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jp, os);
            os.flush();
            os.close();
            facesContext.responseComplete();
           
        } catch (JRException e) {
            System.out.println("edu.sime.controlador.GestionAtcView.descargaReporte() " + e.getMessage());
        } catch(IOException i){
            System.out.println("edu.sime.controlador.GestionAtcView.descargaReporte() " + i.getMessage());
        } catch (SQLException q){
            System.out.println("edu.sime.controlador.GestionAtcView.descargaReporte() " + q.getMessage());
        }

    }

    
    
    

    
    
    
    
    
    
    

}
