/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect_gestion_biblioteca;
import java.util.Date;
/**
 * @KERLY SALAS
 */
public class Prestamo implements IPrestamo{
    //Atributos :)
    private Usuario usuario;
    private MaterialBiblioteca material;
    private Date fechaPrestamo, fechaDevolucion;
    private double multa;
    //Constructor para para sacar la multa por retraso
    public Prestamo(Usuario usuario, MaterialBiblioteca material, Date fechaPrestamo, Date fechaDevolucion) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = 0.0;
    }
    //Getters y setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public MaterialBiblioteca getMaterial() {
        return material;
    }

    public void setMaterial(MaterialBiblioteca material) {
        this.material = material;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    //Metodo y la excepcion
    public void informacionPrestamo() {
        System.out.println("===DETALLE DEL PRESTAMO===");
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Material: " + material.getTitulo());
        System.out.println("Fecha del prestamo: " + fechaPrestamo);
        System.out.println("Fecha de devolucion: " + fechaDevolucion);
        System.out.println("Multa: $" + multa);
    }

    @Override
    public void prestar() {
        if (!(material instanceof IPrestamo)) {
            throw new IllegalStateException("Este tipo de material no se puede prestar.");
        }
        if (!material.getDisponibilidad().equalsIgnoreCase("Disponible")) {
            throw new IllegalStateException("El material no esta disponible.");
        }
        ((IPrestamo) material).prestar();
        System.out.println("Material prestado: " + material.getTitulo() + " a " + usuario.getNombre());
    }

    @Override
    public void devolver() {
        if (material instanceof IPrestamo) {
            ((IPrestamo) material).devolver();
        }
        this.fechaDevolucion = new Date();
        System.out.println("Material devuelto: " + material.getTitulo());
    }
}
