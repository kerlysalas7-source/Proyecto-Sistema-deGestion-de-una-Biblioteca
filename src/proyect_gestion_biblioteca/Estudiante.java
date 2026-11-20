/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 *
 * @author PC
 */
public class Estudiante extends Usuario {
    private String carrera, semestre;

    public Estudiante(String carrera, String semestre, String id, String nombre, String direccionDomicillio, int cedula, int edad) {
        super(id, nombre, direccionDomicillio, cedula, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public void mostrarEstudiante (){
        System.out.println("===ESTUDIANTE===");
        super.consultarMateriales();
        super.prestamo();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
