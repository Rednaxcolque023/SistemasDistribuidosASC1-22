/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Alexander Sacaca
 */
class AdministrarLibrosImplement extends UnicastRemoteObject implements IOperaciones{
    ArrayList<Libro> libros=new ArrayList();
    int top=0;

    public AdministrarLibrosImplement() throws RemoteException{
        super();
    }
    
    @Override
    public String crear(String titulo, String autor, String editorial, int anio) throws RemoteException {
        top++;
        Libro aux=new Libro(top,titulo,autor,editorial,anio);
        libros.add(aux);
        return "si";
    }

    @Override
    public Libro editar(int id, String titulo, String autor, String editorial, int anio) throws RemoteException {
        if (id>0&&id<=top) {
            libros.get(id-1).setTitulo(titulo);
            libros.get(id-1).setAutor(autor);
            libros.get(id-1).setEditorial(editorial);
            libros.get(id-1).setAnio(anio);
            return libros.get(id);
        }
        return null;
    }

    @Override
    public String eliminar(int id) throws RemoteException {
        if(id>0&&id<=top){
            libros.remove(libros.get(id-1));
            top--;
            return "si";
        }
        return "no";
    }

    @Override
    public ArrayList<Libro> mostrar() throws RemoteException {
        return libros;
    }
}
