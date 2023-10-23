/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petstoremanagement;

/**
 *
 * @author alyssaday
 */
public class ExoticPet extends Pet {
    
    private String species;
    
    public ExoticPet(String name, String species, String sex, int age, double weight, int petID, double price) {
        super(name, sex, age, weight, petID, price);
        this.species = species;      
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    

}
