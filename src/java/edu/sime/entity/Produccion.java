/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "produccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produccion.findAll", query = "SELECT p FROM Produccion p")})
public class Produccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_produccion")
    private Integer iDproduccion;
    @Size(max = 30)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_finalizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacion;
    @Size(max = 10)
    @Column(name = "valoracion_produccion")
    private String valoracionProduccion;
    @OneToMany(mappedBy = "iDproduccion", fetch = FetchType.LAZY)
    private Collection<NuevoProducto> nuevoProductoCollection;
    @JoinColumn(name = "ID_producto", referencedColumnName = "ID_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Inventario iDproducto;

    public Produccion() {
    }

    public Produccion(Integer iDproduccion) {
        this.iDproduccion = iDproduccion;
    }

    public Integer getIDproduccion() {
        return iDproduccion;
    }

    public void setIDproduccion(Integer iDproduccion) {
        this.iDproduccion = iDproduccion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getValoracionProduccion() {
        return valoracionProduccion;
    }

    public void setValoracionProduccion(String valoracionProduccion) {
        this.valoracionProduccion = valoracionProduccion;
    }

    @XmlTransient
    public Collection<NuevoProducto> getNuevoProductoCollection() {
        return nuevoProductoCollection;
    }

    public void setNuevoProductoCollection(Collection<NuevoProducto> nuevoProductoCollection) {
        this.nuevoProductoCollection = nuevoProductoCollection;
    }

    public Inventario getIDproducto() {
        return iDproducto;
    }

    public void setIDproducto(Inventario iDproducto) {
        this.iDproducto = iDproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDproduccion != null ? iDproduccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produccion)) {
            return false;
        }
        Produccion other = (Produccion) object;
        if ((this.iDproduccion == null && other.iDproduccion != null) || (this.iDproduccion != null && !this.iDproduccion.equals(other.iDproduccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Produccion[ iDproduccion=" + iDproduccion + " ]";
    }
    
}
