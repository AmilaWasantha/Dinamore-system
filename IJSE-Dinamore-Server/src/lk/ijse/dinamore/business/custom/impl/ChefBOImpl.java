/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom.impl;

import java.sql.Connection;
import lk.ijse.dinamore.business.BOFactory;
import lk.ijse.dinamore.business.custom.ChefBO;
import lk.ijse.dinamore.business.custom.TelephoneOperatorBO;
import lk.ijse.dinamore.dto.ChefSummeryReportDTO;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.entity.ChefSummeryReport;
import lk.ijse.dinamore.entity.Order;
import lk.ijse.dinamore.repository.RepositoryFactory;
import lk.ijse.dinamore.repository.custom.ChefRepository;
import lk.ijse.dinamore.repository.custom.OrderRepository;
import lk.ijse.dinamore.resources.DBConnection;

/**
 *
 * @author User
 */
public class ChefBOImpl implements ChefBO {
    
    private ChefRepository chefRepository;
    private TelephoneOperatorBO telephoneOperatorBO;
    private OrderRepository orderRepository;
    
    public ChefBOImpl(){
        chefRepository=(ChefRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CHEF);
        telephoneOperatorBO=(TelephoneOperatorBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.TELEPHONEOPERATOR);
        orderRepository=(OrderRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ORDER);
    }

    @Override
    public OrderDTO getOrderFromQueue() throws Exception {
        return telephoneOperatorBO.getOrderFromQueue();
        
    }

    @Override
    public boolean addNewOrder(OrderDTO orderDTO) throws Exception {
        Connection connection=DBConnection.getConnection();
        orderRepository.setConnection(connection);
        Order orderEntity=new Order();
        orderEntity.setOrderID(orderDTO.getOrderID());
        orderEntity.setOrderDate(orderDTO.getOrderDate());
        orderEntity.setProcessingTime(orderDTO.getProcessingTime());
        orderEntity.setItemCode(orderDTO.getItemCode());
        orderEntity.setOrderQty(orderDTO.getOrderQty());
        orderEntity.setOrderAmmount(orderDTO.getOrderAmmount());
        orderEntity.setCustomerName(orderDTO.getCustomerName());
        orderEntity.setCustomerTele(orderDTO.getCustomerTele());
        orderEntity.setCustomerAddress(orderDTO.getCustomerAddress());
        orderEntity.setTeleoperateID(orderDTO.getTeleoperateID());
        orderEntity.setChefID(orderDTO.getChefID());
        return orderRepository.add(orderEntity);
    }

    @Override
    public void removeProcessing(String orderID) throws Exception {
        telephoneOperatorBO.removeProcessing(orderID);
    }

    @Override
    public ChefSummeryReportDTO getChefSummery(OrderDTO orderDTO) throws Exception{
        Connection connection=DBConnection.getConnection();
        chefRepository.setConnection(connection);
        Order order=new Order();
        order.setChefID(orderDTO.getChefID());
        order.setOrderDate(orderDTO.getOrderDate());
        ChefSummeryReport chefSummary = chefRepository.chefSummary(order);
        return new ChefSummeryReportDTO(chefSummary.getName(),chefSummary.getOrderCount(),chefSummary.getOrderQTY(),chefSummary.getProcessingTime());
    }
    
}
