/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmisionRetenciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.*;

import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.rmi.registry.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Lion
 */
public class ServidorASFI extends UnicastRemoteObject implements IASFI {

    ArrayList<String> datosDevuelta = new ArrayList<String>();
    IMercantil BancoMercantil;
    boolean respSegip;

    public ServidorASFI() throws RemoteException {
        super();
    }
    
    @Override
    public ArrayList<Cuenta> consultarCuentas(int Ci, String Nombres, String Apellidos) throws RemoteException {
        try {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            
            BancoMercantil=(IMercantil)Naming.lookup("rmi://localhost/BancoMercantil");
            
            respBanco=BancoMercantil.Verificar(Ci, Nombres, Apellidos);
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorASFI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorASFI.class.getName()).log(Level.SEVERE, null, ex);
        }
            datosDevuelta.add(String.valueOf(Ci));
            datosDevuelta.add(Nombres);
            datosDevuelta.add(Apellidos);
            if(respBanco){
                datosDevuelta.add("Los datos son Correctos");
            }else{
                datosDevuelta.add("Los Datos Son Incorrectos");
            }
            return datosDevuelta;
    }
    
   public static void main(String args[]){
       //generando servidor para Cliente 
       try {
	    ServidorASFI serASFI;
	    LocateRegistry.createRegistry(1100); // registrar el servidor e rmi register
	    serASFI=new ServidorASFI(); 
	    Naming.bind("ServidorUniversidad", serASFI); 
            System.out.println("El servidor UNIVERSIDAD esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
       	
    }
}