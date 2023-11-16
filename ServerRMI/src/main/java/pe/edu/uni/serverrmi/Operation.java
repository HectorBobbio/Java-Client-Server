/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.serverrmi;
import java.rmi.RemoteException;

/**
 *
 * @author hecto
 */
public class Operation implements pe.edu.uni.interfacermi.Interface{
    @Override
    public int sum(int a, int b) throws RemoteException{
        System.out.println("Sumando!");
        return a+b;
    }
    
    @Override
    public int rest(int a, int b) throws RemoteException{
        System.out.println("Restando!");
        return a-b;
    }
    
    @Override
    public int prod(int a, int b) throws RemoteException{
        System.out.println("Multiplicando");
        return a*b;
    }
    
    @Override
    public int div(int a, int b) throws RemoteException{
        System.out.println("Dividiendo!");
        if (b!=0){
            return a/b;
        }
        else{
            return 0;
        }
    }
    
    
}
