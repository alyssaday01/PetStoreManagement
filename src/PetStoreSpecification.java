/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package petstoremanagement;
import java.util.ArrayList;
/**
 *
 * @author alyssaday
 */
public interface PetStoreSpecification {
    
    /**
     * update inventory by adding the given pets and their prices
     * 
     * 
     * @param pets
     * @param price
     * @return
     */
    public void adoptionDrive(ArrayList<Pet> pets);
    
    /**
     * calculate and return dollar amount for current inventory of pets
     * that are in stock
     * 
     * @return total in stock value
     */   
    public double inventoryValue();
}
