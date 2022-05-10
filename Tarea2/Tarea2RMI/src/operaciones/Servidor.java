/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
/**
 *
 * @author Alexander Sacaca
 */
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Servidor {
    public static void main(String[] args) {
        try {
            Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("operaciones",new RMI());
            JOptionPane.showMessageDialog(null,"Conectando el Servidor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No conectado servidor"+e);
        }
    }
}
