/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;

/**
 *
 * @author jairo
 */
public abstract class MaterialBiblioteca {
    //atributos protegidos por la clase abstrac
    protected int codigo, anioPublicacion;
    protected String titulo, autor, disponibilidad;
    //Constructor con excepcion en el año de publicacion
    public MaterialBiblioteca(int codigo, int anioPublicacion, String titulo, String autor) {
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = "Disponible";
    }
    //getters y setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    //metodos abstractos
    public abstract void calcularMulta(int diasRetraso);
    public abstract void mostrarInformacion();
}
