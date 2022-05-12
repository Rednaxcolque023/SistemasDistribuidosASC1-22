package segip;


import java.rmi.*;

public interface InterfazOperaciones extends Remote {
     
    Boolean Verificar(int Ci,String Nombres,String Apellidos)throws RemoteException;
    
}


