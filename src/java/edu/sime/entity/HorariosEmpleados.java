/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sime.entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PAVILON
 */
@Entity
@Table(name = "horarios_empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HorariosEmpleados.findAll", query = "SELECT h FROM HorariosEmpleados h")})
public class HorariosEmpleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_horario")
    private Integer iDhorario;
    @Column(name = "inicio_jornada")
    @Temporal(TemporalType.DATE)
    private Date inicioJornada;
    @Column(name = "finalizacion_jornada")
    @Temporal(TemporalType.DATE)
    private Date finalizacionJornada;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "ID_empleado", referencedColumnName = "ID_empleado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empleados iDempleado;

    public HorariosEmpleados() {
    }

    public HorariosEmpleados(Integer iDhorario) {
        this.iDhorario = iDhorario;
    }

    public Integer getIDhorario() {
        return iDhorario;
    }

    public void setIDhorario(Integer iDhorario) {
        this.iDhorario = iDhorario;
    }

    public Date getInicioJornada() {
        return inicioJornada;
    }

    public void setInicioJornada(Date inicioJornada) {
        this.inicioJornada = inicioJornada;
    }

    public Date getFinalizacionJornada() {
        return finalizacionJornada;
    }

    public void setFinalizacionJornada(Date finalizacionJornada) {
        this.finalizacionJornada = finalizacionJornada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (iDhorario != null ? iDhorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorariosEmpleados)) {
            return false;
        }
        HorariosEmpleados other = (HorariosEmpleados) object;
        if ((this.iDhorario == null && other.iDhorario != null) || (this.iDhorario != null && !this.iDhorario.equals(other.iDhorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sime.entity.HorariosEmpleados[ iDhorario=" + iDhorario + " ]";
    }
    
}
