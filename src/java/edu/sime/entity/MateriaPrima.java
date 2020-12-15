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
@Table(name = "materia_prima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriaPrima.findAll", query = "SELECT m FROM MateriaPrima m")})
public class MateriaPrima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_materia_prima")
    private Integer iDmateriaprima;
    @Size(max = 30)
    @Column(name = "tipo_materia_prima")
    private String tipoMateriaPrima;
    @Column(name = "cantidad_materia_prima")
    private Integer cantidadMateriaPrima;
    @Column(name = "fecha_entrada")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @JoinColumn(name = "ID_proveedor", referencedColumnName = "ID_proveedor")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores iDproveedor;
    @OneToMany(mappedBy = "iDmateriaprima", fetch = FetchType.LAZY)
    private Collection<NuevoProducto> nuevoProductoCollection;

    public MateriaPrima() {
    }

    public MateriaPrima(Integer iDmateriaprima) {
        this.iDmateriaprima = iDmateriaprima;
    }

    public Integer getIDmateriaprima() {
        return iDmateriaprima;
    }

    public void setIDmateriaprima(Integer iDmateriaprima) {
        this.iDmateriaprima = iDmateriaprima;
    }

    public String getTipoMateriaPrima() {
        return tipoMateriaPrima;
    }

    public void setTipoMateriaPrima(String tipoMateriaPrima) {
        this.tipoMateriaPrima = tipoMateriaPrima;
    }

    public Integer getCantidadMateriaPrima() {
        return cantidadMateriaPrima;
    }

    public void setCantidadMateriaPrima(Integer cantidadMateriaPrima) {
        this.cantidadMateriaPrima = cantidadMateriaPrima;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Proveedores getIDproveedor() {
        return iDproveedor;
    }

    public void setIDproveedor(Proveedores iDproveedor) {
        this.iDproveedor = iDproveedor;
    }

    @XmlTransient
    public Collection<NuevoProducto> getNuevoProductoCollection() {
        return nuevoProductoCollection;
    }

    public void setNuevoProductoCollection(Collection<NuevoProducto> nuevoProductoCollection) {
        this.nuevoProductoCollection = nuevoProductoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDmateriaprima != null ? iDmateriaprima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaPrima)) {
            return false;
        }
        MateriaPrima other = (MateriaPrima) object;
        if ((this.iDmateriaprima == null && other.iDmateriaprima != null) || (this.iDmateriaprima != null && !this.iDmateriaprima.equals(other.iDmateriaprima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.MateriaPrima[ iDmateriaprima=" + iDmateriaprima + " ]";
    }
    
}
