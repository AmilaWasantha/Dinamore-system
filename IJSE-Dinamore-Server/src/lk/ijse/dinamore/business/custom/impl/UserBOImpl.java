/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.business.custom.impl;

import java.sql.Connection;
import lk.ijse.dinamore.business.custom.UserBO;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.TelephoneOperatorDTO;
import lk.ijse.dinamore.dto.UserDTO;
import lk.ijse.dinamore.entity.Chef;
import lk.ijse.dinamore.entity.TelephoneOperator;
import lk.ijse.dinamore.entity.User;
import lk.ijse.dinamore.repository.RepositoryFactory;
import lk.ijse.dinamore.repository.custom.ChefRepository;
import lk.ijse.dinamore.repository.custom.TelephoneOperatorRepository;
import lk.ijse.dinamore.repository.custom.UserRepository;
import lk.ijse.dinamore.resources.DBConnection;

/**
 *
 * @author User
 */
public class UserBOImpl implements UserBO {
    private UserRepository userRepository;
    private TelephoneOperatorRepository telephoneOperatorRepository;
    private ChefRepository chefRepository;
    
    public UserBOImpl(){
        userRepository=(UserRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.USER);
        telephoneOperatorRepository=(TelephoneOperatorRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.TELEPHONEOPERATOR);
        chefRepository=(ChefRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CHEF);
        
    }
    @Override
    public boolean login(UserDTO userDTO) throws Exception {
        Connection connection=DBConnection.getConnection();
        userRepository.setConnection(connection);
        User userEntity=new User(userDTO.getUserName(), userDTO.getPassword(), userDTO.getType());
        return userRepository.login(userEntity);
    }

    @Override
    public TelephoneOperatorDTO getTelephoneOperatorDetails(String name) throws Exception {
        Connection connection=DBConnection.getConnection();
        telephoneOperatorRepository.setConnection(connection);
        TelephoneOperator toEntity=telephoneOperatorRepository.findByID(name);
        TelephoneOperatorDTO todto=new TelephoneOperatorDTO(toEntity.getTeleOperatorID(),toEntity.getName());
        return todto;
    }

    @Override
    public ChefDTO getChefDetails(String name) throws Exception {
        Connection connection=DBConnection.getConnection();
        chefRepository.setConnection(connection);
        Chef chefEntity=chefRepository.findByID(name);
        ChefDTO chefDTO=new ChefDTO(chefEntity.getChefID(), chefEntity.getChefName());
        return chefDTO;
    }
    
}
