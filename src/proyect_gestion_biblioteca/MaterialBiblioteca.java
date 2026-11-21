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
    //Aributos
    protected int codigo,anioPublicacion;
    protected String titulo,autor, disponibilidad;
    //Metodos abtractos para sus clases hijas
    public MaterialBiblioteca(int codigo, int anioPublicacion, String titulo, String autor) {
        this.codigo = codigo;
        this.anioPublicacion = anioPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad = "Disponible";
    }
    protected abstract void calcularMulta(int diasRetraso);
    protected abstract void mostrarInformacion();
}
