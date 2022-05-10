/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.net.MalformedURLException;
import java.util.Scanner;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alexander Sacaca
 */
public class CLibros {
    public static void main(String[] args) {
        try {
            IOperaciones librosC;
            Scanner sc=new Scanner(System.in);
            boolean salir=true;
            int opcion;
            String titulo,autor,editorial,mensaje;
            int anio;
            librosC=(IOperaciones)Naming.lookup("rmi://localhost/Libros");
            while(salir){
                System.out.println("1: Crear Libro");
                System.out.println("2: Editar Libro");
                System.out.println("3: Eliminar Libro");
                System.out.println("4: Ver Libros Creados");
                System.out.println("5: Salir\n");
                opcion=sc.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el titulo : ");
                        titulo=sc.next();
                        System.out.println("Ingrese el autor : ");
                        autor=sc.next();
                        System.out.println("Ingrese el editorial : ");
                        editorial=sc.next();
                        System.out.println("Ingrese el anio : ");
                        anio=sc.nextInt();
                        mensaje=librosC.crear(titulo, autor, editorial, anio);
                        if (mensaje.equals("si")) {
                            System.out.println("Insertado correctamente");
                        }else{
                            System.out.println("Error al insertar");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el id del libro a editar: ");
                        int id=sc.nextInt();
                        System.out.println("Ingrese el titulo : ");
                        titulo=sc.next();
                        System.out.println("Ingrese el autor : ");
                        autor=sc.next();
                        System.out.println("Ingrese el editorial : ");
                        editorial=sc.next();
                        System.out.println("Ingrese el anio : ");
                        anio=sc.nextInt();
                        System.out.println("Libro: ");
                        Libro aux=librosC.editar(id, titulo, autor, editorial, anio);
                        System.out.println(aux);
                        break;
                    case 3:
                        System.out.println("Ingese el id del libro a eliminar: ");
                        String valor=sc.next();
                        break;
                    case 4:
                        ArrayList<Libro> aux1=librosC.mostrar();
                        for (Libro libro:aux1) {
                            System.out.println(libro);
                        }
                        break;
                    case 5:
                        salir=false;
                        break;
                    default:
                        System.out.println("Valor no valido");
                }
            }
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(CLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
