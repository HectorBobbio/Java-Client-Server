/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.uni.clientrmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hecto
 */
public class ClientRMI {

    public static void main(String[] args) throws RemoteException {
        System.out.println("Client!!!");
        int a = 10;
        int b = 2;
        /*
        Operation o = new Operation();
        System.out.println("suma: " + o.sum(a,b));
        System.out.println("resta: " + o.rest(a,b));
        System.out.println("suma: " + o.prod(a,b));
        System.out.println("suma: " + o.div(a,b));
        */
        // RMI
        String ipAddress = "10.10.0.126";
        int serverPort = 3232;
        String tag = "operation";
        pe.edu.uni.interfacermi.Interface serverInterface = null;
        Registry registry = LocateRegistry.getRegistry(ipAddress,serverPort);
        try {
            serverInterface = (pe.edu.uni.interfacermi.Interface) registry.lookup(tag);
            System.out.println("Connected!");
            
        } catch (NotBoundException | AccessException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Suma: " + serverInterface.sum(a,b));
        System.out.println("Resta: " + serverInterface.rest(a,b));
        System.out.println("Producto: " + serverInterface.prod(a,b));
        System.out.println("Divicion: " + serverInterface.div(a,b));
    }
}
