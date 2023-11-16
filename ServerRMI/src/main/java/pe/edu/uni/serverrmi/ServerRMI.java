/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.uni.serverrmi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.uni.interfacermi.Interface;

/**
 *
 * @author Hector Bobbio <hbobbioh@uni.pe>
 */
public class ServerRMI extends UnicastRemoteObject implements Interface{
    
    private final int port;
    private final String tag;
    
    public ServerRMI() throws RemoteException{
        super();
        port = 3232;
        tag = "operation";
    }
    
    public static void main(String[] args) {
        System.out.println("ServerRMI!");
    }
    
    private void initServer(){
        try {
            String ipAddress = InetAddress.getLocalHost().toString();
            System.out.println("Listening at: " + ipAddress + ":" + port);
            Registry registry = LocateRegistry.createRegistry(port);
            registry.bind(tag, (Interface)this);
        } catch (UnknownHostException | RemoteException | AlreadyBoundException ex) {
            Logger.getLogger(ServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public int sum(int a, int b) throws RemoteException {
        return new Operation().sum(a,b);
    }

    @Override
    public int rest(int a, int b) throws RemoteException {
        return new Operation().rest(a,b);
    }

    @Override
    public int prod(int a, int b) throws RemoteException {
        return new Operation().prod(a,b);
    }

    @Override
    public int div(int a, int b) throws RemoteException {
        return new Operation().div(a,b);
    }
}
