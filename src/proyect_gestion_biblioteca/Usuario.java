/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

import java.util.Date;

/**
 * @KERLY SALAS
 */
public abstract class Usuario {
    //Atributos protegidos por la calse abstract
    MaterialBiblioteca material ;
    protected String id, nombre, direccionDomicilio;
    protected int cedula, edad;
    //Getters y setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }
    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Constructor 
    public Usuario(String id, String nombre, String direccionDomicilio, int cedula, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.direccionDomicilio = direccionDomicilio;
        this.cedula = cedula;
        this.edad = edad;
    }
    //Metodos para las clases hijas 
    protected abstract void consultarMateriales (int buscarcodigo, Biblioteca biblioteca);
    protected abstract void solicitarPrestamo (MaterialBiblioteca mat, Biblioteca biblioteca, Date fechaPrestamo);
}
