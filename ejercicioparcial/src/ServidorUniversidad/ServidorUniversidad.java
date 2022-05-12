package ServidorUniversidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import segip.*;
import java.rmi.*;

import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.rmi.registry.*;
import java.util.ArrayList;

public class ServidorUniversidad extends UnicastRemoteObject
    implements IservidorUniversidad{
    //variables Globales
    InterfazOperaciones servidorSegip;
    boolean respSegip;
    ArrayList<String> datosDevuelta = new ArrayList<String>();
    ServidorUniversidad() throws java.rmi.RemoteException{
	super();
    }

   
  
    
    
     @Override
    public ArrayList<String> EmitirDiploma(int Ci, String Nombres, String Apellidos_1, String Apellido_2, String FechaNac, String Carrera) throws RemoteException {
        //Conexxion TCP SEDUCA
	
     int port = 5001; // puerto de comunicacion
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            String cadena = Nombres+","+Apellidos_1+","+Apellido_2+","+FechaNac;
            
            Socket client = new Socket("localhost", port); //conectarse al socket
            
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            toServer.println(cadena);  //mandar alservidor 
            String result = fromServer.readLine();  // devolver del servidor
            System.out.println("El factorial es: "+result);
            
           

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        //Conexion Segip
        try {
                           
                
            
	    servidorSegip=(InterfazOperaciones)Naming.lookup("rmi://localhost/Segip");
            respSegip=servidorSegip.Verificar(Ci, Nombres, Apellidos_1+" "+Apellido_2);

	}
	catch (Exception e){
	    e.printStackTrace();
	} 
        datosDevuelta.add(String.valueOf(Ci));
        datosDevuelta.add(Nombres);
        datosDevuelta.add(Apellidos_1);
        datosDevuelta.add(Apellido_2);
        datosDevuelta.add(FechaNac);
        datosDevuelta.add(Carrera);
        if(respSegip){
            datosDevuelta.add("Los datos son Correctos");
        }else{
            datosDevuelta.add("Los Datos Son Incorrectos");
        }
        return datosDevuelta;
    }   
    
    
    
    
    
   public static void main(String args[]){
       //generando servidor para Cliente Universidad
       try {
	    ServidorUniversidad serUniversidad;
	    LocateRegistry.createRegistry(1100); // registrar el servidor e rmi register
	    serUniversidad=new ServidorUniversidad(); 
	    Naming.bind("ServidorUniversidad", serUniversidad); 
            System.out.println("El servidor UNIVERSIDAD esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
       
      
  
	
    }


   
}

