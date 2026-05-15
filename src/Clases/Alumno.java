/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hansa
 */
@Entity
@Table(name = "alumno")
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByIdAlum", query = "SELECT a FROM Alumno a WHERE a.idAlum = :idAlum"),
    @NamedQuery(name = "Alumno.findByCedula", query = "SELECT a FROM Alumno a WHERE a.cedula = :cedula"),
    @NamedQuery(name = "Alumno.findByNombre", query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAlum")
    private Integer idAlum;
    @Column(name = "Cedula")
    private String cedula;
    @Column(name = "Nombre")
    private String nombre;

    public Alumno() {
    }

    public Alumno(Integer idAlum) {
        this.idAlum = idAlum;
    }

    public Integer getIdAlum() {
        return idAlum;
    }

    public void setIdAlum(Integer idAlum) {
        this.idAlum = idAlum;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlum != null ? idAlum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.idAlum == null && other.idAlum != null) || (this.idAlum != null && !this.idAlum.equals(other.idAlum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clases.Alumno[ idAlum=" + idAlum + " ]";
    }
    
}
