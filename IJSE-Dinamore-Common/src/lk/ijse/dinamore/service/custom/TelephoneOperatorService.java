/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.service.custom;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.service.SuperService;

/**
 *
 * @author User
 */
public interface TelephoneOperatorService extends SuperService {
    
    public boolean addOrderToQueue(OrderDTO orderDTO) throws Exception;
    
    public ArrayList<ItemDTO> getAllItems() throws Exception;
    
    public ItemDTO findItemByID(String id) throws Exception;
    
    public String checkOrderStatus(String orderID) throws Exception;
    
}
