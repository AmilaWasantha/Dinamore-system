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
import lk.ijse.dinamore.entity.Chef;
import lk.ijse.dinamore.entity.ChefSummeryReport;
import lk.ijse.dinamore.entity.Order;
import lk.ijse.dinamore.repository.custom.ChefRepository;

/**
 *
 * @author User
 */
public class ChefRepositoryImpl implements ChefRepository {

    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean add(Chef t) throws Exception {
        String SQL = "Insert into Chef values(?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, t.getChefID());
        stm.setObject(2, t.getChefName());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        String SQL = "Delete from Chef where chefID='" + id + "'";
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    @Override
    public boolean update(Chef t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Chef findByID(String id) throws Exception {
        String SQL = "Select * from Chef where chefName='" + id + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            Chef operator = new Chef(rst.getString("chefID"), rst.getString("chefName"));
            return operator;
        }
        return null;
    }

    @Override
    public List<Chef> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChefSummeryReport chefSummary(Order order) throws Exception {
        
        String sql = "select c.chefName,count(o.orderID),sum(orderQty),sum( processingTime)\n"
                + "from  orders o,chef c \n"
                + "where c.chefID=o.chefID && c.chefID='" + order.getChefID() + "' &&\n"
                + "o.orderDate='" + order.getOrderDate() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
             System.out.println(new ChefSummeryReport(rst.getString("chefName"), rst.getInt("count(o.orderID)"), rst.getInt("sum(orderQty)"), rst.getString("sum( processingTime)")));
            return  new ChefSummeryReport(rst.getString("chefName"), rst.getInt("count(o.orderID)"), rst.getInt("sum(orderQty)"), rst.getString("sum( processingTime)"));    
        } else {
            return null;
        }
    }

}
