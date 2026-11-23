/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect_gestion_biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @JAIRO MASABANDA, KERLY SALAS, ANDRES VILLACRES
 */
public class Proyect_Gestion_Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int op = 0;

        do {
            try {
                System.out.println("===MENU GESTION DE LA BIBLIOTECA===");
                System.out.println("1. Agregar Material");
                System.out.println("2. Agregar Usuario");
                System.out.println("3. Consultar materiales");
                System.out.println("4. Mostrar Usuarios");
                System.out.println("5. Solicitar prestamo");
                System.out.println("6. Devolver material");
                System.out.println("7. Mostrar prestamo");
                System.out.println("8. Salir");
                System.out.print("Escoja una opcion: ");
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        int m, n;
                        System.out.println("==Agregar Material==");
                        System.out.println("1. Libro");
                        System.out.println("2. Revista");
                        System.out.println("3. Tesis");
                        System.out.print("Escoja una opcion: ");
                        m = sc.nextInt();
                        sc.nextLine();
                        if (m < 1 || m > 3) {
                            System.out.println("Opcion no existente");
                        } else {
                            System.out.print("Cuantas veces desea agregar el material: ");
                            n = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < n; i++) {
                                System.out.println("\nRegistro #" + (i + 1));
                                System.out.print("Codigo: ");
                                int codigo = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Titulo: ");
                                String titulo = sc.nextLine();
                                System.out.print("Autor: ");
                                String autor = sc.nextLine();
                                System.out.print("Anio de publicacion: ");
                                int anio = sc.nextInt();
                                sc.nextLine();

                                if (m == 1) {
                                    System.out.print("Genero: ");
                                    String genero = sc.nextLine();
                                    System.out.print("Numero de paginas: ");
                                    int paginas = sc.nextInt();
                                    sc.nextLine();
                                    biblioteca.agregarMaterial(new Libro(genero, paginas, codigo, anio, titulo, autor));
                                } else if (m == 2) {
                                    System.out.print("Numero de edicion: ");
                                    int edicion = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Categoria: ");
                                    String categoria = sc.nextLine();
                                    biblioteca.agregarMaterial(new Revista(edicion, categoria, codigo, anio, titulo, autor));
                                } else {
                                    System.out.print("Tema: ");
                                    String tema = sc.nextLine();
                                    System.out.print("Departamento: ");
                                    String departamento = sc.nextLine();
                                    biblioteca.agregarMaterial(new Tesis(tema, departamento, codigo, anio, titulo, autor));
                                }
                            }
                            guardarArchivo(biblioteca);
                            leerArchivo();
                        }
                        break;

                    case 2:
                        int u, c;
                        System.out.println("==Agregar Usuario==");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Docente");
                        System.out.print("Escoja una opcion: ");
                        u = sc.nextInt();
                        sc.nextLine();

                        if (u < 1 || u > 2) {
                            System.out.println("Esa opcion no existe");
                        } else {
                            System.out.println("Cuantos desea agregar?");
                            c = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < c; i++) {
                                System.out.print("ID: ");
                                String id = sc.nextLine();
                                System.out.print("Nombre: ");
                                String nombre = sc.nextLine();
                                System.out.print("Direccion Domicilio: ");
                                String direccionDomicilio = sc.nextLine();
                                System.out.print("Cedula: ");
                                int cedula = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Edad: ");
                                int edad = sc.nextInt();
                                sc.nextLine();

                                if (u == 1) {
                                    System.out.print("Carrera: ");
                                    String carrera = sc.nextLine();
                                    System.out.print("Semestre: ");
                                    String semestre = sc.nextLine();
                                    biblioteca.agregarUsuario(new Estudiante(carrera, semestre, id, nombre, direccionDomicilio, cedula, edad));
                                } else {
                                    System.out.print("Departamento: ");
                                    String departamento = sc.nextLine();
                                    System.out.print("Especialidad: ");
                                    String especialidad = sc.nextLine();
                                    biblioteca.agregarUsuario(new Docente(departamento, especialidad, id, nombre, direccionDomicilio, cedula, edad));
                                }
                            }
                            guardarUsuarios(biblioteca);
                            leerUsuarios();
                        }
                        break;

                    case 3:
                        biblioteca.mostrarMateriales();
                        leerArchivo();
                        break;

                    case 4:
                        biblioteca.mostrarUsuarios();
                        leerUsuarios();
                        break;

                    case 5:
                        System.out.println("==SOLICITUD DE PRESTAMO==");
                        System.out.print("Ingrese el ID del usuario: ");
                        String idPrestamo = sc.nextLine();
                        System.out.print("Ingrese el codigo del material a prestar: ");
                        int codPrestamo = sc.nextInt();
                        sc.nextLine();

                        Usuario encontrado = null;
                        for (Usuario e : biblioteca.getListaUsuarios()) {
                            if (e.getId().equalsIgnoreCase(idPrestamo)) {
                                encontrado = e;
                            }
                        }
                        MaterialBiblioteca me = null;
                        for (MaterialBiblioteca mate : biblioteca.getListaMateriales()) {
                            if (mate.getCodigo() == codPrestamo) {
                                me = mate;
                            }
                        }

                        if (encontrado == null) {
                            throw new IllegalArgumentException("No hay usuario con ese id");
                        } else if (me == null) {
                            throw new IllegalArgumentException("El material no fue encontrado con ese codigo");
                        } else if (me instanceof Tesis) {
                            throw new IllegalStateException("Las tesis no estan disponibles para prestamo");
                        } else if (!me.getDisponibilidad().equalsIgnoreCase("Disponible")) {
                            throw new IllegalStateException("El material no esta disponible");
                        } else {
                            Date fechaPrestamo = new Date();
                            encontrado.solicitarPrestamo(me, biblioteca, fechaPrestamo);
                            guardarArchivo(biblioteca);
                        }
                        break;

                    case 6:
                        System.out.println("==DEVOLUCION DE MATERIAL==");
                        System.out.print("Ingrese el ID del usuario: ");
                        String idDev = sc.nextLine();
                        System.out.print("Ingrese el codigo del material a devolver: ");
                        int codDev = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese dias de retraso (0 si entrego a tiempo): ");
                        int diasRetraso = sc.nextInt();
                        sc.nextLine();

                        if (diasRetraso < 0) {
                            throw new IllegalArgumentException("Los dias de retraso no pueden ser negativos.");
                        }

                        Prestamo prestamoDevolver = null;
                        for (Prestamo p : biblioteca.getListaPrestamos()) {
                            if (p.getUsuario().getId().equalsIgnoreCase(idDev) && p.getMaterial().getCodigo() == codDev) {
                                prestamoDevolver = p;
                                break;
                            }
                        }

                        if (prestamoDevolver == null) {
                            throw new IllegalArgumentException("No existe un prestamo activo con ese usuario y codigo de material.");
                        }

                        if (diasRetraso > 0) {
                            prestamoDevolver.getMaterial().calcularMulta(diasRetraso);
                        }

                        biblioteca.devolverMaterial(prestamoDevolver);
                        guardarArchivo(biblioteca);
                        break;

                    case 7:
                        biblioteca.mostrarPrestamos();
                        break;

                    case 8:
                        System.out.println("Saliendo....");
                        break;

                    default:
                        System.out.println("Escoja una opcion valida o existente");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un dato numerico valido.");
                sc.nextLine();
                op = 0;
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }

        } while (op != 8);
    }

    public static void guardarArchivo(Biblioteca biblioteca) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("MaterialesBiblioteca.txt"));
            bw.write("=== DISPONIBILIDAD GENERAL ===");
            bw.newLine();
            for (MaterialBiblioteca mat : biblioteca.getListaMateriales()) {
                bw.write("Codigo: " + mat.getCodigo());
                bw.write(" | Titulo: " + mat.getTitulo());
                bw.write(" | Disponibilidad: " + mat.getDisponibilidad());
                bw.write(" | Autor: " + mat.getAutor());
                bw.write(" | Anio de Publicacion: " + mat.getAnioPublicacion());
                bw.newLine();
            }
            bw.newLine();
            bw.write("=== MATERIALES PRESTADOS A USUARIOS ===");
            bw.newLine();
            for (Prestamo p : biblioteca.getListaPrestamos()) {
                bw.write("Usuario: " + p.getUsuario().getNombre() + " (ID: " + p.getUsuario().getId() + ")");
                bw.write(" -> Material: " + p.getMaterial().getTitulo() + " (Codigo: " + p.getMaterial().getCodigo() + ")");
                bw.write(" | Estado: " + p.getMaterial().getDisponibilidad());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public static void leerArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("MaterialesBiblioteca.txt"));
            String linea;
            System.out.println("Datos leidos desde el archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public static void guardarUsuarios(Biblioteca biblioteca) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("UsuariosBiblioteca.txt"));
            bw.write("=== USUARIOS REGISTRADOS ===");
            bw.newLine();
            for (Usuario u : biblioteca.getListaUsuarios()) {
                bw.write(u.toString());
                bw.write(" | Cedula: " + u.getCedula());
                bw.write(" | Edad: " + u.getEdad());
                bw.write(" | Direccion: " + u.getDireccionDomicilio());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de usuarios");
        }
    }

    public static void leerUsuarios() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("UsuariosBiblioteca.txt"));
            String linea;
            System.out.println("Datos de usuarios leidos desde el archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios");
        }
    }
}