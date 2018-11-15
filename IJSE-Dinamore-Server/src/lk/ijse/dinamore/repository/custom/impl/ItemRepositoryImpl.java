/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.dinamore.entity.Item;
import lk.ijse.dinamore.repository.custom.ItemRepository;

/**
 *
 * @author User
 */
public class ItemRepositoryImpl implements ItemRepository {
    
    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(Item t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Item t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item findByID(String id) throws Exception {
        String SQL="Select * from Item where description='"+id+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            Item item=new Item(rst.getString("itemCode"),rst.getString("description"),rst.getDouble("unitPrice"));
            return item;
        }
        return null;
    }

    @Override
    public List<Item> getAll() throws Exception {
        String SQL="Select * from Item";
        Statement stm=connection.createStatement();
        ArrayList<Item> itemList=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while (rst.next()) {            
            Item item=new Item(rst.getString("itemCode"),rst.getString("description"),rst.getDouble("unitPrice"));
            itemList.add(item);
        }
        return itemList;
    }
    
}
