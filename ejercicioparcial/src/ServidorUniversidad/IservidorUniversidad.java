package ServidorUniversidad;


import segip.*;
import java.rmi.*;
import java.util.ArrayList;

public interface IservidorUniversidad extends Remote {
     
    ArrayList<String> EmitirDiploma(int Ci,String Nombres,String Apellidos_1,String Apellido_2,String FechaNac,String Carrera)throws RemoteException;
    
}


