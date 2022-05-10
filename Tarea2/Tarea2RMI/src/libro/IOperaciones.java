/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package libro;
import java.rmi.Remote;
import java.util.ArrayList;
import java.rmi.RemoteException;
/**
 *
 * @author Alexander Sacaca
 */
public interface IOperaciones extends Remote{
    public String crear(String titulo,String autor,String editorial,int anio) throws RemoteException;
    public Libro editar(int id,String titulo,String autor,String editorial,int anio) throws RemoteException;
    public String eliminar(int id) throws RemoteException;
    public ArrayList<Libro> mostrar() throws RemoteException;
}
