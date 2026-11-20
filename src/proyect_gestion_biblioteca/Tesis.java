/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 *
 * @author jairo
 */
public class Tesis extends MaterialBiblioteca {
    //atributos tesis
    private String tema,departamento,disponibilidad;
    //constructor
    public Tesis(String tema, String departamento, String disponibilidad, int codigo, int anioPublicacion, String titulo, String autor) {
        super(codigo, anioPublicacion, titulo, autor);
        this.tema = tema;
        this.departamento = departamento;
        this.disponibilidad = "disponible";
    }
    //metodos heredados
    @Override
    protected void calcularMulta(int diasRetraso) {
        
    }
    @Override
    protected void mostrarInformacion() {
        System.out.println("====== DATOS REVISTA =====");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Anio publicacion: "+anioPublicacion);
        System.out.println("Tema: "+tema);
        System.out.println("Departamento: "+departamento);
        System.out.println("Disponiblidad: "+ disponibilidad);
        System.out.println("CODIGO: "+codigo);
    }
}
