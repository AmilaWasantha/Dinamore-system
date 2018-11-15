/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author User
 */
public interface SuperRepository<T, ID> {

    public void setConnection(Connection connection);

    public boolean add(T t) throws Exception;

    public boolean delete(ID id) throws Exception;

    public boolean update(T t) throws Exception;

    public T findByID(ID id) throws Exception;

    public List<T> getAll() throws Exception;

}
