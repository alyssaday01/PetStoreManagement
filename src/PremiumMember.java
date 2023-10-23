/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petstoremanagement;
import java.util.ArrayList;
/**
 *
 * @author alyssaday
 */
public class PremiumMember extends Member {
    
    private boolean duesPaid;
    private double monthlyFee = 10.99;
    private String paymentMethod;
    private double amountSpent = 0;
    private ArrayList<Dog> dogsOwned = new ArrayList();
    private ArrayList<Cat> catsOwned = new ArrayList();
    private ArrayList<ExoticPet> exoticPetsOwned = new ArrayList();
    
    public PremiumMember(String name, int memberID, boolean newsletterSubscribed, boolean duesPaid) {
        super(name, memberID, newsletterSubscribed);
        this.duesPaid = duesPaid;
     
    }

    public boolean isDuesPaid() {
        return duesPaid;
    }

    public void setDuesPaid(boolean duesPaid) {
        this.duesPaid = duesPaid;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }

    public ArrayList<Dog> getDogsOwned() {
        return dogsOwned;
    }

    public ArrayList<Cat> getCatsOwned() {
        return catsOwned;
    }

    public ArrayList<ExoticPet> getExoticPetsOwned() {
        return exoticPetsOwned;
    }
    
    public void addDog(Dog dog) {
        dogsOwned.add(dog);
    }
    
    public void addCat(Cat cat) {
        catsOwned.add(cat);
    }
    
    public void addExoticPet(ExoticPet exoticPet) {
        exoticPetsOwned.add(exoticPet);
    }
    
    
    
    
    
}
