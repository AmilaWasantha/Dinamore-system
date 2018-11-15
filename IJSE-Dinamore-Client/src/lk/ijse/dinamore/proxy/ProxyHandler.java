/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.SuperService;
import lk.ijse.dinamore.service.custom.ChefService;
import lk.ijse.dinamore.service.custom.TelephoneOperatorService;

/**
 *
 * @author User
 */
public class ProxyHandler implements ServiceFactory  {
    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private TelephoneOperatorService telphoneService;
    private ChefService chefService;
    
    private ProxyHandler(){
        try {
            serviceFactory=(ServiceFactory) Naming.lookup("rmi://localhost:5050/Dinamore");
            telphoneService=(TelephoneOperatorService) serviceFactory.getService(ServiceTypes.TELEOPERATOR);
            chefService=(ChefService) serviceFactory.getService(ServiceTypes.CHEF);
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstance(){
        if(proxyHandler==null){
            proxyHandler=new ProxyHandler();
        }
        return proxyHandler;
    }
    @Override
    public SuperService getService(ServiceTypes serviceTypes) throws Exception {
        return serviceFactory.getService(serviceTypes);
    }
    
}
