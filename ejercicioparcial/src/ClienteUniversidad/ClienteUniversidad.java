package ClienteUniversidad;

import ServidorUniversidad.*;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Iterator;


public class ClienteUniversidad{
   
    public static void main(String args[]){
        ArrayList<String> Respuesta = new ArrayList<String>();
	IservidorUniversidad servidorUniversidad;
     
      
      
	try {
                           
                
            
	    servidorUniversidad=(IservidorUniversidad)Naming.lookup("rmi://localhost/ServidorUniversidad");
           Respuesta=servidorUniversidad.EmitirDiploma(1140506,"Walter Jhamil", "Segovia", "Arellano", "11-02-1996", "ing en Ciencias de la Computacion");
           
           if(Respuesta.contains("Los Datos Son Incorrectos")){
               int tamanio=Respuesta.size();
               System.out.println(Respuesta.get(tamanio-1));
           }else{
                Iterator<String> nombreIterator = Respuesta.iterator();
                while(nombreIterator.hasNext()){
                String elemento = nombreIterator.next();
                System.out.println(elemento);
                }
           }
           
           
        
	
        }catch (Exception e){
	    e.printStackTrace();
	}
    }
  
}

