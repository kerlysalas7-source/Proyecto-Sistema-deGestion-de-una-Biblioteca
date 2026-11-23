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
    //Atributos
    private String genero;
    private int numeroPaginas;
    //Constructor
    public Libro(String genero, int numeroPaginas, int codigo, int anioPublicacion, String titulo, String autor) {
        super(codigo, anioPublicacion, titulo, autor);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }
    //Metodos heredados
    @Override
    public void calcularMulta(int diasRetraso) {
        double multa = diasRetraso * 0.50;
        System.out.println("Multa por retraso del libro: $" + multa);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====== DATOS LIBRO =====");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Anio publicacion: " + getAnioPublicacion());
        System.out.println("Genero: " + genero);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println("Disponibilidad: " + getDisponibilidad());
        System.out.println("CODIGO: " + getCodigo());
    }
    //Metodo con excepcion verificando el estado del material con el equalsIgnoreCase lee lo que tiene la vaiable Disponiblidad
    @Override
    public void prestar() {
        if (!getDisponibilidad().equalsIgnoreCase("Disponible")) {
            throw new IllegalStateException("El libro no esta disponible para prestamo.");
        }
        setDisponibilidad("Prestado");
    }

    @Override
    public void devolver() {
        setDisponibilidad("Disponible");
    }
    //Getters y setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
