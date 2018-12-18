/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Calendar;

/**
 *
 * @author Urueta
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private Calendar fechaNac;
    private String numCel;
    private String correo;
    private String usuario;
    private String contrasena;
    
    

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, Calendar fechaNac, String numCel, String correo, String contrasena, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
        this.numCel = numCel;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNumCel() {
        return numCel;
    }

    public void setNumCel(String numCel) {
        this.numCel = numCel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNac=" + fechaNac + ", numCel=" + numCel + ", correo=" + correo + '}';
    }
    
    
    
}
