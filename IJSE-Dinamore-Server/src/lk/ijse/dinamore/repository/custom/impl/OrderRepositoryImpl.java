/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import lk.ijse.dinamore.dto.OrderDTO;
import lk.ijse.dinamore.entity.ChefSummeryReport;
import lk.ijse.dinamore.entity.Order;
import lk.ijse.dinamore.repository.custom.OrderRepository;

/**
 *
 * @author User
 */
public class OrderRepositoryImpl implements OrderRepository{
    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(Order t) throws Exception {
        String SQL="Insert into Orders values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, t.getOrderID());
        stm.setObject(2, t.getOrderDate());
        stm.setObject(3, t.getProcessingTime());
        stm.setObject(4, t.getItemCode());
        stm.setObject(5, t.getOrderQty());
        stm.setObject(6, t.getOrderAmmount());
        stm.setObject(7, t.getCustomerName());
        stm.setObject(8, t.getCustomerTele());
        stm.setObject(9, t.getCustomerAddress());
        stm.setObject(10, t.getTeleoperateID());
        stm.setObject(11, t.getChefID());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Order t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order findByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
