/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petstoremanagement;
/**
 *
 * @author alyssaday
 */
public class Cat extends Pet {
    
    private String color;
    
    public Cat(String name, String color, String sex, int age, double weight, int petID, double price) {
        super(name, sex, age, weight, petID, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     
}
