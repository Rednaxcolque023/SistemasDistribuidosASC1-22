/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sacacaalexander.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Alex Lion
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Introduzca un numero : ");
        int n= sn.nextInt();
        operador o=new operador(n);
        System.out.println(o.calcularFibonaci());
    }
}
