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
    private String departamento, especialidad;

    public Docente(String departamento, String especialidad, String id, String nombre, String direccionDomicilio, int cedula, int edad) {
        super(id, nombre, direccionDomicilio, cedula, edad);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    public void mostarDocente (){
        System.out.println("===== DATOS DOCENTE =====");
        System.out.println("Id: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion de Domicilio: " + getDireccionDomicilio());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidad: " + especialidad);
    }

    @Override
    protected void solicitarPrestamo(MaterialBiblioteca mat, Biblioteca biblioteca, Date fechaPrestamo) {
        int prestamosActivos = 0;
        for (Prestamo p : biblioteca.getListaPrestamos()){
            if (p.getUsuario().getId().equals(this.getId())){
                prestamosActivos++;
            }
        }
        if (prestamosActivos >= 5){
            System.out.println("El docente ya alcanzo el limite de 5 prestamos.");
        }else{
            mat.disponibilidad = "no disponible";
            Prestamo prestamoactualizado = new Prestamo(this, mat, fechaPrestamo, null);
            biblioteca.getListaPrestamos().add(prestamoactualizado);
            prestamoactualizado.prestar();
            prestamoactualizado.informacionPrestamo();
        }
    }

    @Override
    protected void consultarMateriales(int buscarcodigo, Biblioteca biblioteca) {
        boolean encontrar = false;
        
        for (MaterialBiblioteca mat : biblioteca.getListaMateriales()) {
            if(buscarcodigo == mat.codigo){
                mat.mostrarInformacion();
                encontrar = true;
            }
        }
        if(!encontrar){
            System.out.println("No se encontro el codigo del material" + buscarcodigo);
        }
    }
}
