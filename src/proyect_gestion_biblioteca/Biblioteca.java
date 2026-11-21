package proyect_gestion_biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<MaterialBiblioteca> listaMateriales;
    private ArrayList<Prestamo> listaPrestamos;

    public Biblioteca() {
        this.listaUsuarios = new ArrayList<>();
        this.listaMateriales = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void agregarMaterial(MaterialBiblioteca material) {
        listaMateriales.add(material);
    }

    public void registrarPrestamo(Prestamo prestamo) {
        prestamo.prestar();
        listaPrestamos.add(prestamo);
    }

    public void devolverMaterial(Prestamo prestamo) {
        if (listaPrestamos.contains(prestamo)) {
            prestamo.devolver();
            listaPrestamos.remove(prestamo);
        } else {
            System.out.println("El prestamo no se encuentra registrado.");
        }
    }

    public void mostrarUsuarios() {
        for (Usuario u : listaUsuarios) {
            System.out.println(u.toString());
        }
    }

    public void mostrarMateriales() {
        for (MaterialBiblioteca m : listaMateriales) {
            System.out.println(m.toString());
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo p : listaPrestamos) {
            System.out.println(p.toString());
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<MaterialBiblioteca> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<MaterialBiblioteca> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}