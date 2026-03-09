/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.app.Service;

import com.sena.app.Entity.Person;
import com.sena.app.IRepository.IPersonRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author rikyf
 */
@Service
public class PersonService {
    private final IPersonRepository repository;
    
    public PersonService(IPersonRepository repository){
        this.repository = repository;
    }
    
    public Person save(Person person){
        return repository.save(person);
    }
    
    public List<Person> findAll(){
        return repository.findAll();
    }
}
