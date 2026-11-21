/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect_gestion_biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @JAIRO MASABANDA, KERLY SALAS, ANDRES VILLACRES
 */
public class Proyect_Gestion_Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int op;
        
        do {
            System.out.println("===MENU GESTION DE LA BIBLIOTECA===");
            System.out.println("1. Agregar Material");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Consultar materiales");
            System.out.println("4. Mostrar Usuarios");
            System.out.println("5. Solicitar prestamo");
            System.out.println("6. Devolver material");
            System.out.println("7. Mostrar prestamo");
            System.out.println("8. Salir");
            System.out.print("Escoja una opciion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1:
                    int m, n;
                    System.out.println("==Agregar Material==");
                    System.out.println("1. Libro");
                    System.out.println("2. Revista");
                    System.out.println("3. Tesis");
                    System.out.print("Escoja una opcion: ");
                    m = sc.nextInt();
                    sc.nextLine();
                    if (m < 0 || m > 3){
                    System.out.println("Opcion no existente");
                    }else{
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
                            
                            if(m==1){
                                System.out.print("Genero: ");
                                String genero = sc.nextLine();
                                System.out.print("Numero de paginas: ");
                                int paginas = sc.nextInt();
                                sc.nextLine();
                            }else if(m==2){
                                System.out.print("Numero de edicion: ");
                                int edicion = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Categoria: ");
                                String categoria = sc.nextLine();
                            }else {
                                System.out.print("Tema: ");
                                String tema = sc.nextLine();
                                System.out.print("Departamento: ");
                                String departamento = sc.nextLine();
                             }
                        }
                    }
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    System.out.println("Saliendo....");
                    break;
                    
                default:
                    System.out.println("Escoja una opcion valida o existente");
                    break;
            }
            
        } while (op!=8);
    }
    
}
