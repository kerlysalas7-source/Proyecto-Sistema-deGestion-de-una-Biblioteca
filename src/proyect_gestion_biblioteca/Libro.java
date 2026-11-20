/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 *
 * @author jairo
 */
public class Libro extends MaterialBiblioteca implements IPrestamo {
    //atributos libro
    private String genero,disponibilidad;
    private int numeroPaginas;
    //constructor 
    public Libro(String genero, int numeroPaginas, int codigo, int anioPublicacion, String titulo, String autor) {
        super(codigo, anioPublicacion, titulo, autor);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidad = "disponible";
    }
    //metodos heredados
    @Override
    protected void calcularMulta(int diasRetraso) {
        
        
    }
    @Override
    protected void mostrarInformacion() {
        System.out.println("====== DATOS LIBRO =====");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Anio publicacion: "+anioPublicacion);
        System.out.println("Genero: "+genero);
        System.out.println("Paginas: "+numeroPaginas);
        System.out.println("Disponiblidad: "+ disponibilidad);
        System.out.println("CODIGO: "+codigo);
    }

    @Override
    public void Prestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
