/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EmisionRetenciones;
//import java.lang.Boolean;
import java.rmi.*;
import java.util.ArrayList;
/**
 *
 * @author Alex Lion
 */
public interface IASFI extends Remote{
    ArrayList<Cuenta> consultarCuentas(int Ci,String Nombres,String Apellidos) throws RemoteException;
}
