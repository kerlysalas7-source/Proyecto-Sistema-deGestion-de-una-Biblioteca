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
    private Usuario usuario;
    private MaterialBiblioteca material;
    private Date fechaPrestamo, fechaDevolucion;
    private double multa;

   
    public Prestamo(Usuario usuario, MaterialBiblioteca material, Date fechaPrestamo, Date fechaDevolucion) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = 0.0;
    }

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

    @Override
    public String toString() {
        return "Prestamo{" + "usuario=" + usuario + ", material=" + material + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", multa=" + multa + '}';
    }

    @Override
    public void Prestar() {
       System.out.println("Material prestado: " + material.toString() + " a " + usuario.toString()); 
    }

    @Override
    public void Devolver() {
       System.out.println("Material devuelto: " + material.toString()); 
    }
}
