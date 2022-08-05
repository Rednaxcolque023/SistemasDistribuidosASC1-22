/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eamenfinal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Alexander S
 */
public class ClienteRMI extends UnicastRemoteObject implements ITransaccion{
    
    public ClienteRMI() throws RemoteException{
        int ncuenta;
        int n;
    }
    
    public int calcularcomision(int n) throws RemoteException{
        double iNumero=n;
        double calcular=0;
        calcular=iNumero*(0.02);
        
        return calcular;
    }
    @Override
    public boolean RelizarTransaccion(int idCliente, int idCVendedor, double monto) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
