/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplogui.app.ejemplogui_app.modelo;

import java.util.List;

/**
 *
 * @author juanguillenalbarracin
 */
public class Libro implements Prestable{
    
    private int codigo;
    private String titulo;
    private String autor;
    private int año;
    private boolean disponible;


    public Libro(){
    }

    public Libro(int codigo, String titulo, String autor, int año, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.disponible = true;
    }
    

    public Libro(int codigo) {
	this.codigo = codigo;
    }


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

   
    
    // Getters y setters de los atributos
    
    
    
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

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

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
