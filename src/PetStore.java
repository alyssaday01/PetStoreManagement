/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petstoremanagement;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author alyssaday
 */
public class PetStore implements PetStoreSpecification {
    
    private String storeName;
    private double balance;
    
    private ArrayList<Pet> pets = new ArrayList();
    private ArrayList<Dog> availableDogs = new ArrayList();
    private ArrayList<Cat> availableCats = new ArrayList();
    private ArrayList<ExoticPet> availableExoticPets = new ArrayList();
    private ArrayList<Member> memberList = new ArrayList();
    private ArrayList<PremiumMember> premiumMemberList = new ArrayList();
    private ArrayList<Pet> cart = new ArrayList();
    private static int nextPetID = 1;
    private static int nextMemberID = 1;
    
        Dog dog1 = new Dog("Lily", "Beagle", "Female", 4, 30.0, getNextPetID(), 400.00);
        Dog dog2 = new Dog("Koda", "Border Collie", "Male", 2, 65.0, getNextPetID(), 600.00);
        Cat cat1 = new Cat("Carl", "Orange", "Male", 3, 16.0, getNextPetID(), 350.00);
        Cat cat2 = new Cat("Waffles", "Black", "Female", 6, 14.0, getNextPetID(), 275.00);
        ExoticPet ep1 = new ExoticPet("Koi", "Crested Gecko", "Male", 2, 1.0, getNextPetID(), 80.00);
        ExoticPet ep2 = new ExoticPet("Willow", "Chinchilla", "Female", 2, 7.0, getNextPetID(), 350.00);
    
    public PetStore(String storeName) {
        
        balance = 0.0;
        this.storeName = storeName;
            availableDogs.add(dog1);
            availableDogs.add(dog2);
            availableCats.add(cat1);
            availableCats.add(cat2);
            availableExoticPets.add(ep1);
            availableExoticPets.add(ep2);
        
        Member member1 = new Member("Angela", 1, false);
        member1.addDog(new Dog("Toby", "German Shepherd", "Male", 5,
                29.0, 0, 0));
        
        PremiumMember member2 = new PremiumMember("Jacob", 2, true, true);
        member2.addCat(new Cat("Chelsea", "Maine Coon","Female", 3, 25.0, 0, 0));
        
            pets.add(dog1);
            pets.add(dog2);
            pets.add(cat1);
            pets.add(cat2);
            pets.add(ep1);
            pets.add(ep2);
        
    }
    
    
    public static int getNextPetID() {
        nextPetID++;
        return nextPetID-1;
    }
    
    public static int getNextMemberID() {
        nextMemberID++;
        return nextMemberID-1;
    }
    
    public String getStoreName() {
        return storeName;
    }
    
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Dog> getAvailableDogs() {
        return availableDogs;
    }

    public void setAvailableDogs(ArrayList<Dog> availableDogs) {
        this.availableDogs = availableDogs;
    }

    public ArrayList<Cat> getAvailableCats() {
        return availableCats;
    }

    public void setAvailableCats(ArrayList<Cat> availableCats) {
        this.availableCats = availableCats;
    }

    public ArrayList<ExoticPet> getAvailableExoticPets() {
        return availableExoticPets;
    }

    public void setAvailableExoticPets(ArrayList<ExoticPet> availableExoticPets) {
        this.availableExoticPets = availableExoticPets;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }

    public ArrayList<PremiumMember> getPremiumMemberList() {
        return premiumMemberList;
    }

    public void setPremiumMemberList(ArrayList<PremiumMember> premiumMemberList) {
        this.premiumMemberList = premiumMemberList;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
    
    
    public void addPet(Pet pet, double price) {
        pets.add(pet);
        balance += price;
    }
    
    public void completePurchase() {
      Scanner input = new Scanner(System.in);
      System.out.println("What pet would you like to buy today?(Choose number)");
        System.out.println("1. Beagle");
        System.out.println("2. Border Collie");
        System.out.println("3. Orange Cat");
        System.out.println("4. Black Cat");
        System.out.println("5. Crested Gecko");
        System.out.println("6. Chinchilla");
        System.out.println("7. Checkout");
        int petChoice = input.nextInt();
        if (petChoice == 1) {
            cart.add(dog1);
            System.out.println("Beagle added to cart!");
            completePurchase();                      
        }
        else if (petChoice == 2) {
            cart.add(dog2);
            System.out.println("Border Collie added to cart!");
            completePurchase();
        }
        else if (petChoice == 3) {
            cart.add(cat1);
            System.out.println("Orange Cat added to cart!");
            completePurchase();
        }
        else if (petChoice == 4) {
            cart.add(cat2);
            System.out.println("Black cat added to cart!");
            completePurchase();
        }
        else if (petChoice == 5) {
            cart.add(ep1);
            System.out.println("Crested Gecko added to cart!");
            completePurchase();
        }
        else if (petChoice == 6) {
            cart.add(ep2);
            System.out.println("Chinchilla added to cart!");
            completePurchase();
        }
        else if (petChoice == 7) {
            System.out.println("You have checked out the following items: ");
            double total = 0.0;
            for (Pet p : cart) {               
                System.out.println(" " + p);
                total += p.getPrice();
            }
            System.out.println("$" + total);            
        }
        else { 
            System.out.println("Please enter valid number option!");
            completePurchase();
        }
        
    }
       
    public void addNewMember() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the new member");
        String name = input.nextLine();
        System.out.println("Would you like a Regular or Premium($10.99) membership?");
        char type = input.nextLine().charAt(0);
        if(type == 'R'){
        System.out.println("Would you like to subscribe to our newsletter? (Y/N)");
        char news = input.nextLine().charAt(0);
            if(news == 'Y') {
                memberList.add(new Member(name, getNextMemberID(), true));   
            } else {
                memberList.add(new Member(name, getNextMemberID(), false));   
            }
            System.out.println("Thank you for signing up!");
        }
        else if(type == 'P') {
            double monthlyFee = 10.99;
            System.out.println("Would you like to subscribe to our newsletter? (Y/N)");
        char news = input.nextLine().charAt(0);
            if(news == 'Y') {
                memberList.add(new Member(name, getNextMemberID(), true));   
            } else {
                memberList.add(new Member(name, getNextMemberID(), false));   
            }
            System.out.println("Thank you for signing up! Monthly fee added to your balance!");
            balance += monthlyFee;
        }
        else {
            System.out.println("Invalid membership type. Try Again :)");
        }
    }
    //check to see what kind of pet they are
        //use instanceof .. to sort into arraylists
    @Override
    public void adoptionDrive(ArrayList<Pet> pets) {
        for (Pet p : pets) {
            this.pets.add(p);
        }
    }
        
       
    
    @Override
    public double inventoryValue() {
        double value = 0.0;
        for (Pet pet : pets) {
            value += pet.getPrice();        
        }
        return value;
    }
    
    
    public void display() {
        for (Object p : pets) {
            if (p instanceof Dog) {
                System.out.println("Name:" + ((Dog) p).getName() + " " + "Breed:" + ((Dog) p).getBreed() + " " + "Sex:" + ((Dog) p).getSex() + " " + "Age:" +
                        ((Dog) p).getAge() + " " + "Weight:" + ((Dog) p).getWeight() + " " + "PetID:" + ((Dog) p).getPetID() + " " + "Price: $" + ((Dog) p).getPrice());
            } 
            else if (p instanceof Cat) {
                System.out.println("Name:" + ((Cat) p).getName() + " " + "Color:" + ((Cat) p).getColor() + " " + "Sex:" + ((Cat) p).getSex() + " " + "Age:" + ((Cat) p).getAge() +
                        " " + "Weight:" + ((Cat) p).getWeight() + " "  + "PetID:" + ((Cat) p).getPetID() + " " + "Price: $" + ((Cat) p).getPrice());               
            } else if (p instanceof ExoticPet) {
                System.out.println("Name:" + ((ExoticPet) p).getName() + " " + "Species:" + ((ExoticPet) p).getSpecies() + " " + "Sex:" + ((ExoticPet) p).getSex() + " " + 
                        " Age:" + ((ExoticPet) p).getAge() + " " + "Weight:" + ((ExoticPet) p).getWeight() + " " + "PetID:" + ((ExoticPet) p).getPetID() + " " + "Price: $" +
                        ((ExoticPet) p).getPrice());
            }
            
        }
    }
    
    public void comparePrice(Pet pet1, Pet pet2) {
        if (pet1.compareTo(pet2) == 1) {
            System.out.println(pet1 + " is greater than " + pet2);
        } else if (pet1.compareTo(pet2) == -1) {
            System.out.println(pet1 + " is less than " + pet2);
        }
        else {
            System.out.println(pet1 + " is equal to " + pet2);
        }       
    }
}
