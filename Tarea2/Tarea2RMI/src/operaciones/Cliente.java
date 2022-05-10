/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;
/**
 *
 * @author Alexander Sacaca
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            Registry miRegistro=LocateRegistry.getRegistry("localhost",1099);
            Operaciones o=(Operaciones)Naming.lookup("//localhost/operaciones");
            while(true){
                String menu =JOptionPane.showInputDialog("OPERACIONES RMI\nSelecione la Opcion: \n"
                        +"Ingrese(1)..SUMATORIA\n"
                        +"Ingrese(2)..FACTORIAL\n"
                        +"Ingrese(3)..INVERTIR CADENA\n"
                        +"Clic Boton Cancelar para salir");
                switch(menu){
                    case "1":{
                        int x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n: "));                        
                        JOptionPane.showMessageDialog(null, "La sumatoria es: "+o.sumatoria(x));
                        break;
                    }
                    case "2":{
                        int x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n: "));                        
                        JOptionPane.showMessageDialog(null, "El factorial es: "+o.factorial(x));
                        break;
                    }
                    case "3":{
                        String cadena= JOptionPane.showInputDialog("Ingrese la cadena: ");                        
                        JOptionPane.showMessageDialog(null, "La cadena invertida es: "+o.invertir(cadena));
                        
                        break;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Servidor no conectado"+e);
        }
    }
}
