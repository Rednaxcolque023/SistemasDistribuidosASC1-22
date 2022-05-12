/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmisionRetenciones;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Alex Lion
 */
public class BancoMercantil extends UnicastRemoteObject implements IMercantil{
    
    public int CI =11021654;
    public String NombresD="Juan Perez";
    public String ApellidosD="Segovia";
    BancoMercantil() throws java.rmi.RemoteException{
	super();
    }

@Override
    public Boolean Verificar(int Ci, String Nombres, String Apellidos) throws RemoteException {
        
        if (Ci==CI) {
            if(NombresD.equals(Nombres)){
                if(ApellidosD.equals(Apellidos)){
                    return true;
                }else{
                    System.out.println("El apellido esta mal escrito");
                    return false;
                }
                
            }else{
                System.out.println("El Nombre esta mal escrito");
                return false;
            }
        } else {
            System.out.println("El CI esta mal escrito");
            return false;
        }
        
    }
    
    
    public static void main(String args[]) { 
	try {
	    BancoMercantil banco;
	    LocateRegistry.createRegistry(1099);
	    banco=new BancoMercantil(); 
	    Naming.bind("Banco Mercantil", banco); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }
}