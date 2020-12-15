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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "nuevo_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NuevoProducto.findAll", query = "SELECT n FROM NuevoProducto n")})
public class NuevoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_nuevo_producto")
    private Integer iDnuevoproducto;
    @JoinColumn(name = "ID_produccion", referencedColumnName = "ID_produccion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Produccion iDproduccion;
    @JoinColumn(name = "ID_materia_prima", referencedColumnName = "ID_materia_prima")
    @ManyToOne(fetch = FetchType.LAZY)
    private MateriaPrima iDmateriaprima;

    public NuevoProducto() {
    }

    public NuevoProducto(Integer iDnuevoproducto) {
        this.iDnuevoproducto = iDnuevoproducto;
    }

    public Integer getIDnuevoproducto() {
        return iDnuevoproducto;
    }

    public void setIDnuevoproducto(Integer iDnuevoproducto) {
        this.iDnuevoproducto = iDnuevoproducto;
    }

    public Produccion getIDproduccion() {
        return iDproduccion;
    }

    public void setIDproduccion(Produccion iDproduccion) {
        this.iDproduccion = iDproduccion;
    }

    public MateriaPrima getIDmateriaprima() {
        return iDmateriaprima;
    }

    public void setIDmateriaprima(MateriaPrima iDmateriaprima) {
        this.iDmateriaprima = iDmateriaprima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDnuevoproducto != null ? iDnuevoproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NuevoProducto)) {
            return false;
        }
        NuevoProducto other = (NuevoProducto) object;
        if ((this.iDnuevoproducto == null && other.iDnuevoproducto != null) || (this.iDnuevoproducto != null && !this.iDnuevoproducto.equals(other.iDnuevoproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.NuevoProducto[ iDnuevoproducto=" + iDnuevoproducto + " ]";
    }
    
}
