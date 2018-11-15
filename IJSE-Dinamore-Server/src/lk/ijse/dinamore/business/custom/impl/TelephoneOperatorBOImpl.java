/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import lk.ijse.dinamore.business.custom.TelephoneOperatorBO;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.entity.Item;
import lk.ijse.dinamore.repository.RepositoryFactory;
import lk.ijse.dinamore.repository.custom.ItemRepository;
import lk.ijse.dinamore.resources.DBConnection;

/**
 *
 * @author User
 */
public class TelephoneOperatorBOImpl implements TelephoneOperatorBO{
    
    public static Queue<OrderDTO> orderQueue=new PriorityQueue<>();
    
    public static ArrayList<OrderDTO> processingList=new ArrayList<>();
            
    private ItemRepository itemRepository;
    
    public TelephoneOperatorBOImpl(){
        this.itemRepository=(ItemRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ITEM);
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws Exception {
        Connection connection=DBConnection.getConnection();
        itemRepository.setConnection(connection);
        ArrayList<ItemDTO> itemList=new ArrayList<>();
        List<Item> allItem=itemRepository.getAll();
        for (Item item : allItem) {
            ItemDTO item1=new ItemDTO(item.getItemCode(), item.getDescription(), item.getUnitPrice());
            itemList.add(item1);
        }
        return itemList;
        
    }

    @Override
    public ItemDTO findItemByID(String id) throws Exception {
        Connection connection=DBConnection.getConnection();
        itemRepository.setConnection(connection);
        Item itemEntity=itemRepository.findByID(id);
        ItemDTO itemDTO=new ItemDTO(itemEntity.getItemCode(),itemEntity.getDescription(),itemEntity.getUnitPrice());
        return itemDTO;
    }

    @Override
    public boolean addOrderToQueue(OrderDTO orderDTO) throws Exception {
        return orderQueue.add(orderDTO);
    }

    @Override
    public OrderDTO getOrderFromQueue() throws Exception {
        OrderDTO orderDTO=null;
        if(!orderQueue.isEmpty()){
            orderDTO=orderQueue.poll();
            processingList.add(orderDTO);
        }
        return orderDTO;
    }

    @Override
    public String checkOrderStatus(String orderID) throws Exception {
        for (OrderDTO orderDTO : orderQueue) {
            if(orderDTO.getOrderID().equals(orderID)){
                return "Order is pending to process..!";
            }
        }
        for (OrderDTO orderDTO : processingList) {
            if(orderDTO.getOrderID().equals(orderID)){
                return "Order is processing..!";
            }
        }
        return "Order is ready to Delivery..!";
    }
    @Override
    public void removeProcessing(String orderID) throws Exception{
        for (OrderDTO orderDTO : processingList) {
            if(orderDTO.getOrderID().equals(orderID)){
                processingList.remove(this);
                
            }
        }
    }
    
}
