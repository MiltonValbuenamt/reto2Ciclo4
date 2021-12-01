/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Cleaningproduct;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Milton V
 */
public interface InterfaceCleaningproduct extends MongoRepository<Cleaningproduct, String> {

    public Optional<Cleaningproduct> findById(Integer id);
    
}
