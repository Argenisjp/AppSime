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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_venta")
    private Integer iDventa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tipo_venta")
    private String tipoVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "catidad_venta")
    private int catidadVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "valor_venta")
    private String valorVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fecha_venta")
    private String fechaVenta;
    @JoinColumn(name = "ID_empleado", referencedColumnName = "ID_empleado")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empleados iDempleado;
    @JoinColumn(name = "ID_producto", referencedColumnName = "ID_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Inventario iDproducto;

    public Ventas() {
    }

    public Ventas(Integer iDventa) {
        this.iDventa = iDventa;
    }

    public Ventas(Integer iDventa, String tipoVenta, int catidadVenta, String valorVenta, String fechaVenta) {
        this.iDventa = iDventa;
        this.tipoVenta = tipoVenta;
        this.catidadVenta = catidadVenta;
        this.valorVenta = valorVenta;
        this.fechaVenta = fechaVenta;
    }

    public Integer getIDventa() {
        return iDventa;
    }

    public void setIDventa(Integer iDventa) {
        this.iDventa = iDventa;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public int getCatidadVenta() {
        return catidadVenta;
    }

    public void setCatidadVenta(int catidadVenta) {
        this.catidadVenta = catidadVenta;
    }

    public String getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(String valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Empleados getIDempleado() {
        return iDempleado;
    }

    public void setIDempleado(Empleados iDempleado) {
        this.iDempleado = iDempleado;
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
        hash += (iDventa != null ? iDventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.iDventa == null && other.iDventa != null) || (this.iDventa != null && !this.iDventa.equals(other.iDventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Ventas[ iDventa=" + iDventa + " ]";
    }
    
}
