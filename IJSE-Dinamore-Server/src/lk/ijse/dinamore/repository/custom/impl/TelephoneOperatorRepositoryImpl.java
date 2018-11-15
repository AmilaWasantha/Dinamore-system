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
import lk.ijse.dinamore.entity.TelephoneOperator;
import lk.ijse.dinamore.repository.custom.TelephoneOperatorRepository;

/**
 *
 * @author User
 */
public class TelephoneOperatorRepositoryImpl implements TelephoneOperatorRepository{
    
    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection=connection;
    }

    @Override
    public boolean add(TelephoneOperator t) throws Exception {
        String SQL="Insert into telephoneoperator values(?,?)";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, t.getTeleOperatorID());
        stm.setObject(2, t.getName());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TelephoneOperator t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TelephoneOperator findByID(String id) throws Exception {
        String SQL="Select * from telephoneoperator where teleName='"+id+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            TelephoneOperator operator=new TelephoneOperator(rst.getString("teleOperatorID"), rst.getString("teleName"));
            return operator;
        }
        return null;
    }

    @Override
    public List<TelephoneOperator> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
