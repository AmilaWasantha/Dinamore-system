/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import lk.ijse.dinamore.entity.User;
import lk.ijse.dinamore.repository.custom.UserRepository;

/**
 *
 * @author User
 */
public class UserRepositoryImpl implements UserRepository {
    
    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(User t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findByID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(User user) throws Exception {
        String SQL="Select * from User where username=? AND password= ? AND type=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, user.getUserName());
        stm.setObject(2, user.getPassword());
        stm.setObject(3, user.getType());
        ResultSet rst=stm.executeQuery();
        return rst.next();
        
    }
    
}
