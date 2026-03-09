package com.sena.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.app.Entity.Module;
import com.sena.app.IRepository.IModuleRepository;

@Service
public class ModuleService {
    @Autowired
    private final IModuleRepository repository;

    public ModuleService(IModuleRepository repository){
        this.repository = repository;
    }
        public Module save(Module module){
        return repository.save(module);
    }
    
    public List<Module> findAll(){
        return repository.findAll();
    }
}
