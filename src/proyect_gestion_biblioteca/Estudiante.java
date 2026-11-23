/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

import java.time.LocalDate;
import java.util.Date;

/**
 * @KERLY SALAS
 */
public class Estudiante extends Usuario {
    //atributos
    private String carrera, semestre;
    //Constructor
    public Estudiante(String carrera, String semestre, String id, String nombre, String direccionDomicilio, int cedula, int edad) {
        super(id, nombre, direccionDomicilio, cedula, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    //Getters y Setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    //Metodos
    public void mostrarEstudiante() {
        System.out.println("===== DATOS ESTUDIANTE =====");
        System.out.println("Id: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion de Domicilio: " + getDireccionDomicilio());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
    //Metodos heredados y excepciones thr y thrs
    @Override
    protected void consultarMateriales(int buscarcodigo, Biblioteca biblioteca) {
        boolean encontrar = false;
        for (MaterialBiblioteca mat : biblioteca.getListaMateriales()) {
            if (buscarcodigo == mat.getCodigo()) {
                mat.mostrarInformacion();
                encontrar = true;
            }
        }
        if (!encontrar) {
            System.out.println("No se encontro el codigo del material " + buscarcodigo);
        }
    }

    @Override
    protected void solicitarPrestamo(MaterialBiblioteca mat, Biblioteca biblioteca, Date fechaPrestamo) {
        int prestamosActivos = 0;
        for (Prestamo p : biblioteca.getListaPrestamos()) {
            if (p.getUsuario().getId().equals(this.getId())) {
                prestamosActivos++;
            }
        }
        if (prestamosActivos >= 3) {
            throw new IllegalStateException("El estudiante ya alcanzo el limite de 3 prestamos.");
        }
        Prestamo prestamoactualizado = new Prestamo(this, mat, fechaPrestamo, null);
        prestamoactualizado.prestar();
        biblioteca.getListaPrestamos().add(prestamoactualizado);
        prestamoactualizado.informacionPrestamo();
    }
}