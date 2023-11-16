/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.uni.clientrmi;

import java.rmi.RemoteException;

/**
 *
 * @author hecto
 */
public class ClientRMI {

    public static void main(String[] args) throws RemoteException {
        System.out.println("Client!!!");
        int a = 10;
        int b = 2;
        Operation o = new Operation();
        System.out.println("suma: " + o.sum(a,b));
        System.out.println("resta: " + o.rest(a,b));
        System.out.println("suma: " + o.prod(a,b));
        System.out.println("suma: " + o.div(a,b));
        
    }
}
