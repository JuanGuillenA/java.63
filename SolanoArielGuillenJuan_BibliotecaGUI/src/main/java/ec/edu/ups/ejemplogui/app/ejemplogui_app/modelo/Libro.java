/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int MAX_LENGTH = 10;
    private int codigo;
    private String titulo;
    private String autor;
    private String año;
    private boolean disponible;


    public Libro(){
    }

    public Libro(int codigo, String titulo, String autor, String año) {
        this.codigo = codigo;
        setTitulo(titulo);
        setAutor(autor);
        setAño(año);    
    }
    

    public Libro(int codigo, String titulo, String autor, String año, boolean disponible) {
        this.codigo = codigo;
        setTitulo(titulo);
        setAutor(autor);
        setAño(año);    
        this.disponible = true;
    }
    

    public Libro(int codigo) {
	this.codigo = codigo;
    }


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    
    
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = ajustarLongitud(titulo);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = ajustarLongitud(autor);
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = ajustarLongitud(año);    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    
    public int getCodigo() {
	return codigo;
    }


    public void setCodigo(int id) {
	this.codigo = codigo;
    }


    @Override
    public String toString() {
	return "Libro [titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", disponible=" + disponible + "]";
    }
    
    private String ajustarLongitud(String input) {
    if (input == null) {
        input = "";
    }
    if (input.length() > MAX_LENGTH) {
        return input.substring(0, MAX_LENGTH);
    }
    return String.format("%1$-" + MAX_LENGTH + "s", input);
}
    
}
