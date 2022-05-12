/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmisionRetenciones;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Alex Lion
 */
public class Juez {
    public static void main(String[] args) {
        ArrayList<String> Respuesta = new ArrayList<String>();
        IASFI servidorASFI;
        try {
            servidorASFI = (IASFI) Naming.lookup("rmi://localhost/ServidorASFI");
            Respuesta = servidorASFI.consultarCuentas(11021654,"Juan Perez", "Segovia");
            if (Respuesta.contains("Los Datos Son Incorrectos")) {
                int tamanio = Respuesta.size();
                System.out.println(Respuesta.get(tamanio - 1));
            } else {
                Iterator<String> nombreIterator = Respuesta.iterator();
                while (nombreIterator.hasNext()) {
                    String elemento = nombreIterator.next();
                    System.out.println(elemento);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
