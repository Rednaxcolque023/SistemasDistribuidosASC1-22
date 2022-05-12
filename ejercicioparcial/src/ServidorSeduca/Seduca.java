package ServidorSeduca;
import java.io.*;
import java.net.*;

public class Seduca {
    String datovalido="WaSeAr11-02-1996";
   
    public static void main(String[] args) throws InterruptedException{
        int port =5001; // puerto en el que escuchara el socket
        
        try {
            ServerSocket server = new ServerSocket(port); //instanciamos un servidor socket
            Socket client;      
            BufferedReader fromClient;  // buffer de lectura
            PrintStream toClient;       // stream para escritura
            while(true){   // ciclo al infinito para elfuncionamiento del server1
                client = server.accept(); // el servidorse queda esperando establecer conexion 
                toClient = new PrintStream(client.getOutputStream());
                fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                String cadena;
                cadena = fromClient.readLine();//cadena obtenida desde el lector
                String [] Estudiantes=cadena.split(",");
                char[] car1;
                char[] car2;
                for(int i=0;i<4;i++){
                    //car1=Estudiantes.toCharArray();
                    //Estudiantes[0].substring(i)
                }
                
                
                
                 //prepara el objetopara devolver
                System.out.println("Calculando el fatorial de "+cadena+" desde la pc: "+client.getInetAddress());
                //imprime cadena recibida desde el cliente
                //Thread.sleep(3000);
                 //for (int i=0;i<=10000000;i++);
                toClient.flush(); // 
                toClient.println(cadena);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
