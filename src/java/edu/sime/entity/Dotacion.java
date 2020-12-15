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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "dotacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dotacion.findAll", query = "SELECT d FROM Dotacion d")})
public class Dotacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_dotacion")
    private Integer iDdotacion;
    @Size(max = 30)
    @Column(name = "tipo_dotacion")
    private String tipoDotacion;
    @Column(name = "cantidad_dotacion")
    private Integer cantidadDotacion;
    @JoinColumn(name = "ID_empleado", referencedColumnName = "ID_empleado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empleados iDempleado;

    public Dotacion() {
    }

    public Dotacion(Integer iDdotacion) {
        this.iDdotacion = iDdotacion;
    }

    public Integer getIDdotacion() {
        return iDdotacion;
    }

    public void setIDdotacion(Integer iDdotacion) {
        this.iDdotacion = iDdotacion;
    }

    public String getTipoDotacion() {
        return tipoDotacion;
    }

    public void setTipoDotacion(String tipoDotacion) {
        this.tipoDotacion = tipoDotacion;
    }

    public Integer getCantidadDotacion() {
        return cantidadDotacion;
    }

    public void setCantidadDotacion(Integer cantidadDotacion) {
        this.cantidadDotacion = cantidadDotacion;
    }

    public Empleados getIDempleado() {
        return iDempleado;
    }

    public void setIDempleado(Empleados iDempleado) {
        this.iDempleado = iDempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDdotacion != null ? iDdotacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dotacion)) {
            return false;
        }
        Dotacion other = (Dotacion) object;
        if ((this.iDdotacion == null && other.iDdotacion != null) || (this.iDdotacion != null && !this.iDdotacion.equals(other.iDdotacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Dotacion[ iDdotacion=" + iDdotacion + " ]";
    }
    
}
