package proyect_gestion_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    //Atributos
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<MaterialBiblioteca> listaMateriales;
    private ArrayList<Prestamo> listaPrestamos;
    //Constructor
    public Biblioteca() {
        this.listaUsuarios = new ArrayList<>();
        this.listaMateriales = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
    }
    //Getters y Setters
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
    //metodos con las excepciones con Throw y Throws
    public void devolverMaterial(Prestamo prestamo) {
        prestamo.getMaterial().disponibilidad = "Disponible";
        listaPrestamos.remove(prestamo);
    }

    public void mostrarUsuarios() {
        if (listaUsuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (Usuario u : listaUsuarios) {
                System.out.println(u.toString());
            }
        }
    }

    public void mostrarMateriales() {
        if (listaMateriales.isEmpty()) {
            System.out.println("No hay materiales registrados.");
        } else {
            for (MaterialBiblioteca m : listaMateriales) {
                m.mostrarInformacion();
            }
        }
    }

    public void mostrarPrestamos() {
        if (listaPrestamos.isEmpty()) {
            System.out.println("No hay prestamos registrados.");
        } else {
            for (Prestamo p : listaPrestamos) {
                p.informacionPrestamo();
            }
        }
    }
    //Getters y setters
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