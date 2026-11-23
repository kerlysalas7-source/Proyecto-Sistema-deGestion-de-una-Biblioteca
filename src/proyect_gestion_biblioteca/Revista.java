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
    //Atributos
    private int numeroEdicion;
    private String categoria;
    //Constructor
    public Revista(int numeroEdicion, String categoria, int codigo, int anioPublicacion, String titulo, String autor) {
        super(codigo, anioPublicacion, titulo, autor);
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
    }
    //Polimorfismo para la multa
    @Override
    public void calcularMulta(int diasRetraso) {
        double multa = diasRetraso * 1.0;
        System.out.println("Multa por retraso de la revista: $" + multa);
    }
    //Metodos con excepciones para no trabajar en el main que sale largo mejor en los metodos
    @Override
    public void mostrarInformacion() {
        System.out.println("====== DATOS REVISTA =====");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Anio publicacion: " + getAnioPublicacion());
        System.out.println("Edicion: " + numeroEdicion);
        System.out.println("Categoria: " + categoria);
        System.out.println("Disponibilidad: " + getDisponibilidad());
        System.out.println("CODIGO: " + getCodigo());
    }

    @Override
    public void prestar() {
        if (!getDisponibilidad().equalsIgnoreCase("Disponible")) {
            throw new IllegalStateException("La revista no esta disponible para prestamo.");
        }
        setDisponibilidad("Prestado");
    }

    @Override
    public void devolver() {
        setDisponibilidad("Disponible");
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
