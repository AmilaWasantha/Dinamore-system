/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.startup;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.impl.ServiceFactoryImpl;

/**
 *
 * @author User
 */
public class StartServer {
    
    public static void main(String[] args) {
        try {
            Registry dinamoreRegistry=LocateRegistry.createRegistry(5050);
            dinamoreRegistry.rebind("Dinamore",ServiceFactoryImpl.getInstance());
            System.out.println("Server Start..");
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
