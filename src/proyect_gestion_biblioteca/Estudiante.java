/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;
/**
 * @KERLY SALAS
 */
public class Estudiante extends Usuario {
    private String carrera, semestre;

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
    
    public Estudiante(String carrera, String semestre, String id, String nombre, String direccionDomicilio, int cedula, int edad) {
        super(id, nombre, direccionDomicilio, cedula, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    public void mostrarEstudiante (){
        System.out.println("===== DATOS ESTUDIANTE =====");
        System.out.println("Id: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion de Domicilio: " + getDireccionDomicilio());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
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

    @Override
    protected void prestamo() {
    }
}
