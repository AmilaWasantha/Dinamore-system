/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom.impl;

import java.sql.Connection;
import lk.ijse.dinamore.business.custom.AdminBO;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.entity.Chef;
import lk.ijse.dinamore.entity.TelephoneOperator;
import lk.ijse.dinamore.repository.RepositoryFactory;
import lk.ijse.dinamore.repository.custom.ChefRepository;
import lk.ijse.dinamore.repository.custom.TelephoneOperatorRepository;
import lk.ijse.dinamore.resources.DBConnection;

/**
 *
 * @author USer
 */
public class AdminBOImpl implements AdminBO {
    
    private TelephoneOperatorRepository telephoneOperatorRepository;
    private ChefRepository chefRepository;
    
    public AdminBOImpl(){
        telephoneOperatorRepository=(TelephoneOperatorRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.TELEPHONEOPERATOR);
        chefRepository=(ChefRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CHEF);
    }

    @Override
    public boolean registerNewTelephoneOperator(TelephoneOperatorDTO operatorDTO) throws Exception {
        
        Connection connection=DBConnection.getConnection();
        telephoneOperatorRepository.setConnection(connection);
        TelephoneOperator tp=new TelephoneOperator(operatorDTO.getTeleOperatorID(),operatorDTO.getName());
        return telephoneOperatorRepository.add(tp);
    }

    @Override
    public boolean registerNewChef(ChefDTO chefDTO) throws Exception {
        Connection connection=DBConnection.getConnection();
        chefRepository.setConnection(connection);
        Chef chef=new Chef(chefDTO.getChefID(), chefDTO.getChefName());
        return chefRepository.add(chef);
    }
    
}
