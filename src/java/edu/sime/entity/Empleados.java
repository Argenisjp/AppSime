/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_empleado")
    private Integer iDempleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CC_empleado")
    private int cCempleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellido_empleado")
    private String apellidoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email_empleado")
    private String emailEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "contrasena_empleado")
    private String contrasenaEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono_empleado")
    private String telefonoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ciudadEmpleado")
    private String ciudadEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "direccion_empleado")
    private String direccionEmpleado;
    @OneToMany(mappedBy = "iDempleado", fetch = FetchType.LAZY)
    private Collection<HorariosEmpleados> horariosEmpleadosCollection;
    @OneToMany(mappedBy = "iDempleado", fetch = FetchType.LAZY)
    private Collection<Ventas> ventasCollection;
    @OneToMany(mappedBy = "iDempleado", fetch = FetchType.LAZY)
    private Collection<Dotacion> dotacionCollection;

    public Empleados() {
    }

    public Empleados(Integer iDempleado) {
        this.iDempleado = iDempleado;
    }

    public Empleados(Integer iDempleado, String tipoDocumento, int cCempleado, String nombreEmpleado, String apellidoEmpleado, String emailEmpleado, String contrasenaEmpleado, String telefonoEmpleado, String ciudadEmpleado, String direccionEmpleado) {
        this.iDempleado = iDempleado;
        this.tipoDocumento = tipoDocumento;
        this.cCempleado = cCempleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.ciudadEmpleado = ciudadEmpleado;
        this.direccionEmpleado = direccionEmpleado;
    }

  

    public Integer getIDempleado() {
        return iDempleado;
    }

    public void setIDempleado(Integer iDempleado) {
        this.iDempleado = iDempleado;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCCempleado() {
        return cCempleado;
    }

    public void setCCempleado(int cCempleado) {
        this.cCempleado = cCempleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getCiudadEmpleado() {
        return ciudadEmpleado;
    }

    public void setCiudadEmpleado(String ciudadEmpleado) {
        this.ciudadEmpleado = ciudadEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    @XmlTransient
    public Collection<HorariosEmpleados> getHorariosEmpleadosCollection() {
        return horariosEmpleadosCollection;
    }

    public void setHorariosEmpleadosCollection(Collection<HorariosEmpleados> horariosEmpleadosCollection) {
        this.horariosEmpleadosCollection = horariosEmpleadosCollection;
    }

    @XmlTransient
    public Collection<Ventas> getVentasCollection() {
        return ventasCollection;
    }

    public void setVentasCollection(Collection<Ventas> ventasCollection) {
        this.ventasCollection = ventasCollection;
    }

    @XmlTransient
    public Collection<Dotacion> getDotacionCollection() {
        return dotacionCollection;
    }

    public void setDotacionCollection(Collection<Dotacion> dotacionCollection) {
        this.dotacionCollection = dotacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDempleado != null ? iDempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.iDempleado == null && other.iDempleado != null) || (this.iDempleado != null && !this.iDempleado.equals(other.iDempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Empleados[ iDempleado=" + iDempleado + " ]";
    }
    
}
