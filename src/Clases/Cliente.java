
package Clases;

import java.util.ArrayList;

/**
 *
 * @author hansa
 */
public class Cliente{
    private int idClie;
    private String Cedula;
    private String Nombre;
    private String Mail;
    private ArrayList<Direcciones> direcciones;

    public Cliente() {
    }

    public Cliente(int idClie, String Cedula, String Nombre, String Mail, ArrayList<Direcciones> direcciones) {
        this.idClie = idClie;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Mail = Mail;
        this.direcciones = direcciones;
    }

    

    public int getIdClie() {
        return idClie;
    }

    public String getMail() {
        return Mail;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Direcciones> getDirecciones() {
        return direcciones;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setDirecciones(ArrayList<Direcciones> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idClie=" + idClie + ", Cedula=" + Cedula + ", Nombre=" + Nombre + ", Mail=" + Mail + ", direcciones=" + direcciones + '}';
    }



   
}
