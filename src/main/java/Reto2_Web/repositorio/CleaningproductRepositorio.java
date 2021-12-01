/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Cleaningproduct;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCleaningproduct;

/**
 *
 * @author Johan
 */
@Repository
public class CleaningproductRepositorio {
    @Autowired
    private InterfaceCleaningproduct repository;

    public List<Cleaningproduct> getAll() {
        return repository.findAll();
    }

    public Optional<Cleaningproduct> getClothe(Integer id) {
        return repository.findById(id);
    }
    public Cleaningproduct create(Cleaningproduct clothe) {
        return repository.save(clothe);
    }

    public void update(Cleaningproduct clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cleaningproduct clothe) {
        repository.delete(clothe);
    }
}
