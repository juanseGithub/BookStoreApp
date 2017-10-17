package com.bsapp.bookcommons;

/**
 *
 * @author jromero
 */
public class Usuario {
    
    public int id_user;
    public String nombre;
    public String apellido;
    public String edad;
    public String nro_Celular;
    public String telefono;
    public String residencia;
    public String email;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNro_celular() {
        return nro_Celular;
    }

    public void setNro_celular(String nro_celular) {
        this.nro_Celular = nro_celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
