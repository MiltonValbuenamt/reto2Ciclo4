/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.servicio;

import Reto2_Web.modelo.Cleaningproduct;
import Reto2_Web.repositorio.CleaningproductRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Milton V
 *  */
@Service
public class CleaningproductServicio {
     @Autowired
    private CleaningproductRepositorio clotheRepository;

    public List<Cleaningproduct> getAll() {
        return clotheRepository.getAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Optional<Cleaningproduct> getClothe(Integer id) {
        return clotheRepository.getClothe(id);
    }

    public Cleaningproduct create(Cleaningproduct accesory) {
        if (accesory.getId() == null) {
            return accesory;
        } else {
            return clotheRepository.create(accesory);
        }
    }

    public Cleaningproduct update(Cleaningproduct accesory) {

        if (accesory.getId() != null) {
            Optional<Cleaningproduct> accesoryDb = clotheRepository.getClothe(accesory.getId());
            if (!accesoryDb.isEmpty()) {
                
                if (accesory.getBrand()!= null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }
                
                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }
                
                if (accesory.getName() != null) {
                    accesoryDb.get().setDescription(accesory.getName());
                }
                
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());                
                }
                
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                
                if (accesory.getPhotography() != null) {
                        accesoryDb.get().setPhotography(accesory.getPhotography()); 
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                clotheRepository.update(accesoryDb.get());
                return accesoryDb.get();
                }
            }
        return accesory;                
   } 
    
    
        

    public boolean delete(Integer id) {
        Boolean aBoolean = getClothe(id).map(accesory -> {
        clotheRepository.delete(accesory);
        return true;
        }).orElse(false);
        return aBoolean;
     }

            
}
