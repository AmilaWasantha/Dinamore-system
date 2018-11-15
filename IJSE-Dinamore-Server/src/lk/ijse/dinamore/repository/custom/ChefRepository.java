/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.repository.custom;

import lk.ijse.dinamore.entity.Chef;
import lk.ijse.dinamore.entity.ChefSummeryReport;
import lk.ijse.dinamore.entity.Order;
import lk.ijse.dinamore.repository.SuperRepository;

/**
 *
 * @author User
 */
public interface ChefRepository extends SuperRepository<Chef ,String> {
    public ChefSummeryReport chefSummary(Order order)throws Exception;
}
