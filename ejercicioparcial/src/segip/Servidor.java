package segip;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


public class Servidor 
    extends UnicastRemoteObject
    implements InterfazOperaciones{
    
    public int CI =1140506;
    public String NombresD="Walter Jhamil";
    public String ApellidosD="Segovia Arellano";
    Servidor() throws java.rmi.RemoteException{
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
	    Servidor Segip;
	    LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
	    Segip=new Servidor(); 
	    Naming.bind("Segip", Segip); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    } 

    


  
}


