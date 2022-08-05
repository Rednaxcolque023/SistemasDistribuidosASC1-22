/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eamenfinal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander S
 */
public class ServidorRMI {
    public static void main(String[] args) {
        try {
            Registry r=java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("itransaccion",new ClienteRMI());
            JOptionPane.showMessageDialog(null,"Conectando el Servidor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No conectado servidor"+e);
        }
    }
}

