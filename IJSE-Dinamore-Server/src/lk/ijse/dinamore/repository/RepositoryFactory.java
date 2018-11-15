/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository;

import lk.ijse.dinamore.repository.custom.impl.ChefRepositoryImpl;
import lk.ijse.dinamore.repository.custom.impl.ItemRepositoryImpl;
import lk.ijse.dinamore.repository.custom.impl.OrderRepositoryImpl;
import lk.ijse.dinamore.repository.custom.impl.TelephoneOperatorRepositoryImpl;
import lk.ijse.dinamore.repository.custom.impl.UserRepositoryImpl;

/**
 *
 * @author User
 */
public class RepositoryFactory {
    
    public enum RepositoryTypes{
        CHEF,ITEM,ORDER,TELEPHONEOPERATOR, USER
    }
    public static RepositoryFactory repositoryFactory;
    
    private RepositoryFactory(){
        
    }
    
    public static RepositoryFactory getInstance(){
        if(repositoryFactory==null){
            repositoryFactory=new RepositoryFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(RepositoryTypes repositoryTypes){
        switch(repositoryTypes){
            case CHEF:
                return new ChefRepositoryImpl();
            case ITEM:
                return new ItemRepositoryImpl();
            case ORDER:
                return new OrderRepositoryImpl();
            case TELEPHONEOPERATOR:
                return new TelephoneOperatorRepositoryImpl();
            case USER:
                return new UserRepositoryImpl();
            default:
                return null;
        }
    }
}
