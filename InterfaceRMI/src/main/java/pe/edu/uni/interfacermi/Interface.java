/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.uni.interfacermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Hector Bobbio <hbobbioh@uni.pe>
 */
public interface Interface extends Remote{
    public int sum(int a, int b) throws RemoteException;
    public int rest(int a, int b) throws RemoteException;
    public int prod(int a, int b) throws RemoteException;
    public int div(int a, int b) throws RemoteException;
}
