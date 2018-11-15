/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business;

import lk.ijse.dinamore.business.custom.TelephoneOperatorBO;
import lk.ijse.dinamore.business.custom.impl.AdminBOImpl;
import lk.ijse.dinamore.business.custom.impl.ChefBOImpl;
import lk.ijse.dinamore.business.custom.impl.TelephoneOperatorBOImpl;
import lk.ijse.dinamore.business.custom.impl.UserBOImpl;

/**
 *
 * @author User
 */
public class BOFactory {
    
    public enum BOTypes{
        CHEF,TELEPHONEOPERATOR,USER,ADMIN
    }
    
    private static BOFactory bOFactory;
    
    private BOFactory(){
        
    }
    public static BOFactory getInstance(){
        if(bOFactory==null){
            bOFactory=new BOFactory();
        }
        return bOFactory;
    }
    public SuperBO getBO(BOTypes bOTypes){
        switch(bOTypes){
            case CHEF:
                return new ChefBOImpl();
            case TELEPHONEOPERATOR:
                return new TelephoneOperatorBOImpl();
            case USER:
                return new UserBOImpl();
            case ADMIN:
                return new AdminBOImpl();
            default:
                return null;
        }
    }
    
}
