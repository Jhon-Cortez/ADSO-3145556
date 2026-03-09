package com.sena.app.Service;

import com.sena.app.Entity.User;
import com.sena.app.IRepository.IUserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rikyf
 */
@Service
public class UserService {
    @Autowired
    private IUserRepository repository;  
    public UserService(IUserRepository repository){
        this.repository = repository;
    }
    public User save(User user){
        return repository.save(user);
    }
    public List<User> findAll(){
        return repository.findAll();
    }
    
}
