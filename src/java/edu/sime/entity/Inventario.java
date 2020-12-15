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
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_producto")
    private Integer iDproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fecha_entrada_producto")
    private String fechaEntradaProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fecha_salida_producto")
    private String fechaSalidaProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cantidad_producto")
    private String cantidadProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "valor_unitario_producto")
    private String valorUnitarioProducto;

    public Inventario() {
    }

    public Inventario(Integer iDproducto) {
        this.iDproducto = iDproducto;
    }

    public Inventario(Integer iDproducto, String nombreProducto, String fechaEntradaProducto, String fechaSalidaProducto, String cantidadProducto, String valorUnitarioProducto) {
        this.iDproducto = iDproducto;
        this.nombreProducto = nombreProducto;
        this.fechaEntradaProducto = fechaEntradaProducto;
        this.fechaSalidaProducto = fechaSalidaProducto;
        this.cantidadProducto = cantidadProducto;
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    public Integer getIDproducto() {
        return iDproducto;
    }

    public void setIDproducto(Integer iDproducto) {
        this.iDproducto = iDproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFechaEntradaProducto() {
        return fechaEntradaProducto;
    }

    public void setFechaEntradaProducto(String fechaEntradaProducto) {
        this.fechaEntradaProducto = fechaEntradaProducto;
    }

    public String getFechaSalidaProducto() {
        return fechaSalidaProducto;
    }

    public void setFechaSalidaProducto(String fechaSalidaProducto) {
        this.fechaSalidaProducto = fechaSalidaProducto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getValorUnitarioProducto() {
        return valorUnitarioProducto;
    }

    public void setValorUnitarioProducto(String valorUnitarioProducto) {
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDproducto != null ? iDproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.iDproducto == null && other.iDproducto != null) || (this.iDproducto != null && !this.iDproducto.equals(other.iDproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Inventario[ iDproducto=" + iDproducto + " ]";
    }
    
}
