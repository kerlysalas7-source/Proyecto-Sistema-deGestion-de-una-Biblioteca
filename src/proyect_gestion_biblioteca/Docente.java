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
    protected void consultarMateriales(int buscarcodigo) {
    }

    @Override
    protected void prestamo() {
    }
}
