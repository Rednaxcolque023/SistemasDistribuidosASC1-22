/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.rmi.registry.LocateRegistry;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alexander Sacaca
 */
public class SevidorLibroRMI {
    public static void main(String[] args) {
        System.out.println("Preparando el Servidor");
        try {    
            AdministrarLibrosImplement librosR= new AdministrarLibrosImplement();
            LocateRegistry.createRegistry(1099);
            Naming.bind("Libros",librosR);
            System.out.println("El servidor esta levantado");
        } catch (RemoteException ex) {
            Logger.getLogger(SevidorLibroRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(SevidorLibroRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SevidorLibroRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
