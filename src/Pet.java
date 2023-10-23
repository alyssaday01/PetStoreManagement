package petstoremanagement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyssaday
 */
public abstract class Pet implements Comparable<Pet> {
    
    private String name;
    private String sex;
    private int age;
    private double weight;
    private int petID;
    private double price;

    
    public Pet(String name, String sex, int age, double weight, int petID, double price) {
        this.name = name;
        this.price = price;
        this.petID = petID;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
               
    }

    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
       
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Pet other) {
        return Double.compare(price, other.price);
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
   
}
