/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom;

import java.util.ArrayList;
import lk.ijse.dinamore.business.SuperBO;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrderDTO;

/**
 *
 * @author User
 */
public interface TelephoneOperatorBO extends SuperBO {
    
    public ArrayList<ItemDTO> getAllItems() throws Exception;
    
    public ItemDTO findItemByID(String id) throws Exception;
    
    public boolean addOrderToQueue(OrderDTO orderDTO) throws Exception;
    
    public OrderDTO getOrderFromQueue() throws Exception;
    
    public String checkOrderStatus(String orderID) throws Exception;
    
    public void removeProcessing(String orderID) throws Exception;
    
}
