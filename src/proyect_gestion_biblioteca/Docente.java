/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 * @KERLY SALAS
 */
public class Docente extends Usuario {
    private String departamento, especialidad;

    public Docente(String departamento, String especialidad, String id, String nombre, String direccionDomicillio, int cedula, int edad) {
        super(id, nombre, direccionDomicillio, cedula, edad);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    public void mostarDocente (){
        System.out.println("==DOCENTE==");
        super.consultarMateriales();
        super.prestamo();
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidad: " + especialidad);
    }
}
