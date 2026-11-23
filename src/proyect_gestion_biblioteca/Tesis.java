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
    //Atributos
    private String tema, departamento;
    //Contructor
    public Tesis(String tema, String departamento, int codigo, int anioPublicacion, String titulo, String autor) {
        super(codigo, anioPublicacion, titulo, autor);
        this.tema = tema;
        this.departamento = departamento;
    }
    //Polimorfismo para la multa 
    @Override
    public void calcularMulta(int diasRetraso) {
        double multa = diasRetraso * 1.50;
        System.out.println("Multa por retraso de la tesis: $" + multa);
    }
    //Metodos 
    @Override
    public void mostrarInformacion() {
        System.out.println("====== DATOS TESIS =====");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Anio publicacion: " + getAnioPublicacion());
        System.out.println("Tema: " + tema);
        System.out.println("Departamento: " + departamento);
        System.out.println("Disponibilidad: " + getDisponibilidad());
        System.out.println("CODIGO: " + getCodigo());
    }
    //Getters y seters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
