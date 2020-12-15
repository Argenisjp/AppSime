/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "administrador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_administrador")
    private Integer iDadministrador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "documento")
    private long documento;
    @Size(max = 30)
    @Column(name = "nombre_adimistrador")
    private String nombreAdimistrador;
    @Size(max = 30)
    @Column(name = "apellido_administrador")
    private String apellidoAdministrador;
    @Size(max = 30)
    @Column(name = "email_administrador")
    private String emailAdministrador;
    @Size(max = 30)
    @Column(name = "contrasena_administrador")
    private String contrasenaAdministrador;
    @Size(max = 10)
    @Column(name = "telefono_adinistrador")
    private String telefonoAdinistrador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "direccion")
    private String direccion;

    public Administrador() {
    }

    public Administrador(Integer iDadministrador) {
        this.iDadministrador = iDadministrador;
    }

    public Administrador(Integer iDadministrador, String tipoDocumento, long documento, String ciudad, String direccion) {
        this.iDadministrador = iDadministrador;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Integer getIDadministrador() {
        return iDadministrador;
    }

    public void setIDadministrador(Integer iDadministrador) {
        this.iDadministrador = iDadministrador;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombreAdimistrador() {
        return nombreAdimistrador;
    }

    public void setNombreAdimistrador(String nombreAdimistrador) {
        this.nombreAdimistrador = nombreAdimistrador;
    }

    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public void setApellidoAdministrador(String apellidoAdministrador) {
        this.apellidoAdministrador = apellidoAdministrador;
    }

    public String getEmailAdministrador() {
        return emailAdministrador;
    }

    public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
    }

    public String getContrasenaAdministrador() {
        return contrasenaAdministrador;
    }

    public void setContrasenaAdministrador(String contrasenaAdministrador) {
        this.contrasenaAdministrador = contrasenaAdministrador;
    }

    public String getTelefonoAdinistrador() {
        return telefonoAdinistrador;
    }

    public void setTelefonoAdinistrador(String telefonoAdinistrador) {
        this.telefonoAdinistrador = telefonoAdinistrador;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDadministrador != null ? iDadministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.iDadministrador == null && other.iDadministrador != null) || (this.iDadministrador != null && !this.iDadministrador.equals(other.iDadministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Administrador[ iDadministrador=" + iDadministrador + " ]";
    }
    
}
