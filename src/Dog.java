/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petstoremanagement;

/**
 *
 * @author alyssaday
 */
public class Dog extends Pet {
    
    private String breed;
    
    public Dog(String name, String breed, String sex, int age, double weight, int petID, double price) {
        super(name, sex, age, weight, petID, price);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
        
}
