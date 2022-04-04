/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sacacaalexander.invertircadena;

import java.util.Scanner;

/**
 *
 * @author Alex Lion
 */
public class App {

    public static void main(String[] args) {
        String cadena  ="holaquetal";
        String CadenaInvertida="";
        System.out.print("Introducir la cadena : ");
        Scanner cad = new Scanner(System.in);
        
        cadena = cad.next();
        
        for (int i = cadena.length() -1 ; i >=0; i--) {
            CadenaInvertida=CadenaInvertida + cadena.charAt(i);
        }
        System.out.println(CadenaInvertida);
    }
}
