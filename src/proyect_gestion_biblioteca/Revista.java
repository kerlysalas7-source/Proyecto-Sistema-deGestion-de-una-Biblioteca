/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 *
 * @author jairo
 */
public class Revista extends MaterialBiblioteca implements IPrestamo{
    //atributos revista
    private int numeroEdicion;
    private String categoria,disponibilidad;
    //constructor
    public Revista(int numeroEdicion, String categoria, String disponibilidad, int codigo, int anioPublicacion, String titulo, String autor) {
        super(codigo, anioPublicacion, titulo, autor);
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
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
        System.out.println("Edicion: "+numeroEdicion);
        System.out.println("Categoria: "+categoria);
        System.out.println("Disponiblidad: "+ disponibilidad);
        System.out.println("CODIGO: "+codigo);
    }

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
