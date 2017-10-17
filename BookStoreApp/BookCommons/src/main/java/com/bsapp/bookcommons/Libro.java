package com.bsapp.bookcommons;

/**
 *
 * @author jromero
 */
public class Libro {
    
    public int id_Libro;
    public String nombre_Libro;
    public String autor;
    public String editorial;
    public String introduccion;
    public String categoria;
    public int precio;

    public int getId_Libro() {
        return id_Libro;
    }

    public void setId_Libro(int id_Libro) {
        this.id_Libro = id_Libro;
    }

    public String getNombre_Libro() {
        return nombre_Libro;
    }

    public void setNombre_Libro(String nombre_Libro) {
        this.nombre_Libro = nombre_Libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


      
   

}
