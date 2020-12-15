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
@Table(name = "atencion_al_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AtencionAlCliente.findAll", query = "SELECT a FROM AtencionAlCliente a")})
public class AtencionAlCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_mensaje")
    private Integer iDmensaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombres_completos")
    private String nombrescompletos;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "Mensaje")
    private String mensaje;

    public AtencionAlCliente() {
    }

    public AtencionAlCliente(Integer iDmensaje) {
        this.iDmensaje = iDmensaje;
    }

    public AtencionAlCliente(Integer iDmensaje, String nombrescompletos, String email, String mensaje) {
        this.iDmensaje = iDmensaje;
        this.nombrescompletos = nombrescompletos;
        this.email = email;
        this.mensaje = mensaje;
    }

    public Integer getIDmensaje() {
        return iDmensaje;
    }

    public void setIDmensaje(Integer iDmensaje) {
        this.iDmensaje = iDmensaje;
    }

    public String getNombrescompletos() {
        return nombrescompletos;
    }

    public void setNombrescompletos(String nombrescompletos) {
        this.nombrescompletos = nombrescompletos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDmensaje != null ? iDmensaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionAlCliente)) {
            return false;
        }
        AtencionAlCliente other = (AtencionAlCliente) object;
        if ((this.iDmensaje == null && other.iDmensaje != null) || (this.iDmensaje != null && !this.iDmensaje.equals(other.iDmensaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.AtencionAlCliente[ iDmensaje=" + iDmensaje + " ]";
    }
    
}
