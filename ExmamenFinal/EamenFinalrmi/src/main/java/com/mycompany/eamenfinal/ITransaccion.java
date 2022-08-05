/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.eamenfinal;

import java.rmi.RemoteException;

/**
 *
 * @author Alexander S
 */
public interface ITransaccion {
    boolean RelizarTransaccion(int idCliente,int idCVendedor, double monto)throws RemoteException;
}
