/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

import java.util.Date;

/**
 * @KERLY SALAS
 */
public class Docente extends Usuario {
    //Atributos
    private String departamento, especialidad;
    //Constructor
    public Docente(String departamento, String especialidad, String id, String nombre, String direccionDomicilio, int cedula, int edad) {
        super(id, nombre, direccionDomicilio, cedula, edad);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    //Metodos
    public void mostarDocente() {
        System.out.println("===== DATOS DOCENTE =====");
        System.out.println("Id: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion de Domicilio: " + getDireccionDomicilio());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidad: " + especialidad);
    }
    //Metodos heredados con excepciones Throw y Throws
    @Override
    protected void solicitarPrestamo(MaterialBiblioteca mat, Biblioteca biblioteca, Date fechaPrestamo) {
        int prestamosActivos = 0;
        for (Prestamo p : biblioteca.getListaPrestamos()) {
            if (p.getUsuario().getId().equals(this.getId())) {
                prestamosActivos++;
            }
        }
        if (prestamosActivos >= 5) {
            throw new IllegalStateException("El docente ya alcanzo el limite de 5 prestamos.");
        }
        Prestamo prestamoactualizado = new Prestamo(this, mat, fechaPrestamo, null);
        prestamoactualizado.prestar();
        biblioteca.getListaPrestamos().add(prestamoactualizado);
        prestamoactualizado.informacionPrestamo();
    }

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
    //Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    //Compañeros Esto sirver para convertir un objeto en texto String a una solo linea para guardar datos direcatmente ayuda de la ia
    @Override
    public String toString() {
        return "[DOCENTE] ID: " + getId() + " | Nombre: " + getNombre() + " | Departamento: " + departamento + " | Especialidad: " + especialidad;
    }
}
