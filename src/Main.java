/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petstoremanagement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alyssaday
 */
public class Main {  
    Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PetStore store = new PetStore("Alyssa's PetStore!");
        Scanner input = new Scanner(System.in);
        System.out.println("**** Welcome to " + store.getStoreName() + "****");
        boolean exit = false;
        while(!exit) {
            System.out.println("Select from the following menu.");
            System.out.println("1. Buy a New Pet!");
            System.out.println("2. Register New Member!");
            System.out.println("3. Start Adoption Drive (Add New Pets)");
            System.out.println("4. View Inventory");
            System.out.println("5. View Inventory Value");
            System.out.println("6. Compare Prices of Pets!");
            System.out.println("7. Exit");
            
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                //Calls the completePurchase() method
                store.completePurchase();
                    break;
                case 2:
                //Adds member to PetStore
                store.addNewMember();                    
                    break;
                case 3:                                   
                //Runs adoption drive for new pets
                ArrayList<Pet> adoptedPets = new ArrayList();
                System.out.println("How many animals will you be donating today?");
                int donatedPets = input.nextInt();               
        
                for (int i = 0; i < donatedPets; i++) {
                    System.out.println("Enter the type of pet you are donating!");
                    String type = input.next();
                    
                    System.out.println("Enter the pet's name!");
                    String petName = input.next();
                    
                    System.out.println("Enter the color/breed/species of pet!");
                    String petQuality = input.next();
           
                    System.out.println("Enter the pet's sex!(Male/Female)");
                    String petSex = input.next();
           
                    System.out.println("Enter the pet's age!");
                    int petAge = input.nextInt();
           
                    System.out.println("Enter the pet's weight!");
                    int petWeight = input.nextInt();
           
                    System.out.println("Enter the pet's ID!(any number)");
                    int petId = input.nextInt();
           
                    System.out.println("Enter the price of the pet!(0.0 if donating)");
                    double petPrice = input.nextDouble();                  
                    
                    if (type == "Dog") {
                        adoptedPets.add(new Dog(petName, petQuality, petSex, petAge, petWeight, petId, petPrice));
                    } else if (type == "Cat") {
                        adoptedPets.add(new Cat(petName, petQuality, petSex, petAge, petWeight, petId, petPrice));
                    } else {
                        adoptedPets.add(new ExoticPet(petName, petQuality, petSex, petAge, petWeight, petId, petPrice));
                    }
                    System.out.println("Pet added! Thanks for your donation!");
                }
                store.adoptionDrive(adoptedPets); 
                    break;
                case 4:
                    //Displays inventory
                    store.display();
                    
                    break;
                case 5:
                    //Shows the total price value of inventory
                    System.out.println("$" + store.inventoryValue());
                    break;
                case 6: 
                    System.out.println("Which pet would you like to compare?");
                    for (int i = 1; i <= store.getPets().size(); i++) {
                        System.out.println(i + "." + store.getPets().get(i - 1));
                    }
                    int pet1 = input.nextInt();
                    int pet2 = input.nextInt();
                    store.comparePrice(store.getPets().get(pet1 - 1), store.getPets().get(pet2 - 1));
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("invalid choice. Please enter a number on the menu.");
                
            }
         input.nextLine();
                 
        }
    }

} 
    
 
