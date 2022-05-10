/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Alexander Sacaca
 */
public class RMI extends UnicastRemoteObject implements Operaciones{
    
    public RMI() throws RemoteException{
        int n;
        String cadena="";
    }
    public int sumatoria(int n) throws RemoteException{
        int iNumero=n;
        int sumatoria=0;
        int contador=iNumero;
        while(contador!=0){
            sumatoria+=contador;
            contador--;
        }
        return sumatoria;
    }
    public int factorial(int n) throws RemoteException{
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i; 
        }
        return fact;
    }
    public String invertir(String cadena) throws RemoteException{
        String invertida="";
        for (int indice = cadena.length()-1; indice >=0; indice--) {
            invertida += cadena.charAt(indice);
        }
        return invertida;
    }
}
