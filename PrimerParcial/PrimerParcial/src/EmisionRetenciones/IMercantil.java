/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EmisionRetenciones;

import java.rmi.RemoteException;

/**
 *
 * @author Alex Lion
 */
public interface IMercantil {
    Boolean Verificar(int Ci,String Nombres,String Apellidos)throws RemoteException;
}
