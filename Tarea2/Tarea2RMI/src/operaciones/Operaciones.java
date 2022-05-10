/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package operaciones;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Alexander Sacaca
 */
interface Operaciones extends Remote{
    public int sumatoria(int n) throws RemoteException;
    public int factorial(int n) throws RemoteException;
    public String invertir(String cadena) throws RemoteException;
}
