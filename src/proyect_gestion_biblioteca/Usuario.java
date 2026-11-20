/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 * @KERLY SALAS
 */
public abstract class Usuario {

    private String id;
    private String nombre;
    private String direccionDomicillio;
    private int cedula, edad;

    public Usuario(String id, String nombre, String direccionDomicillio, int cedula, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.direccionDomicillio = direccionDomicillio;
        this.cedula = cedula;
        this.edad = edad;
    }
    
    public void consultarMateriales (){
        
    }
    public void prestamo (){
        
    }
}
