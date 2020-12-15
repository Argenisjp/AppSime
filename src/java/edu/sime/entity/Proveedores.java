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
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_proveedor")
    private Integer iDproveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CC_proveedor")
    private int cCproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_proveedor")
    private String nombreProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellido_proveedor")
    private String apellidoProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email_proveedor")
    private String emailProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono_proveedor")
    private String telefonoProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "direccion_proveedor")
    private String direccionProveedor;
    @OneToMany(mappedBy = "iDproveedor", fetch = FetchType.LAZY)
    private Collection<MateriaPrima> materiaPrimaCollection;

    public Proveedores() {
    }

    public Proveedores(Integer iDproveedor) {
        this.iDproveedor = iDproveedor;
    }

    public Proveedores(Integer iDproveedor, int cCproveedor, String nombreProveedor, String apellidoProveedor, String emailProveedor, String telefonoProveedor, String direccionProveedor) {
        this.iDproveedor = iDproveedor;
        this.cCproveedor = cCproveedor;
        this.nombreProveedor = nombreProveedor;
        this.apellidoProveedor = apellidoProveedor;
        this.emailProveedor = emailProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.direccionProveedor = direccionProveedor;
    }

    public Integer getIDproveedor() {
        return iDproveedor;
    }

    public void setIDproveedor(Integer iDproveedor) {
        this.iDproveedor = iDproveedor;
    }

    public int getCCproveedor() {
        return cCproveedor;
    }

    public void setCCproveedor(int cCproveedor) {
        this.cCproveedor = cCproveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getApellidoProveedor() {
        return apellidoProveedor;
    }

    public void setApellidoProveedor(String apellidoProveedor) {
        this.apellidoProveedor = apellidoProveedor;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    @XmlTransient
    public Collection<MateriaPrima> getMateriaPrimaCollection() {
        return materiaPrimaCollection;
    }

    public void setMateriaPrimaCollection(Collection<MateriaPrima> materiaPrimaCollection) {
        this.materiaPrimaCollection = materiaPrimaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDproveedor != null ? iDproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.iDproveedor == null && other.iDproveedor != null) || (this.iDproveedor != null && !this.iDproveedor.equals(other.iDproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.Proveedores[ iDproveedor=" + iDproveedor + " ]";
    }
    
}
