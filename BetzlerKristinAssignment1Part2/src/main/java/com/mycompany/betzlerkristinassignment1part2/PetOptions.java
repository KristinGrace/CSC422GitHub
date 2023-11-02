/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betzlerkristinassignment1part2;

/**
 *
 * @author Kristin
 */

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class PetOptions 
{
    
    Scanner reader = new Scanner(System.in);
    // Create an ArrayList object
    ArrayList<Pet> pets = new ArrayList<>();
    
    // Menu
    public void Menu()
    {
       
       
        // Print the options
        System.out.println(" ");
        System.out.println("Menu");
        System.out.println("---------------------------------");
        System.out.println("1 : Show all pets");
        System.out.println("2 : Add more pets");
        System.out.println("3 : Update an existing pet");
        System.out.println("4 : Remove an existing pet");
        System.out.println("5 : Search for a pet by name");
        System.out.println("6 : Search for a pet by age");
        System.out.println("7 : exit program");
        System.out.println("---------------------------------");
        
         // Ask the user to type the num that corresponds to the desired action.
         
         // Ask the user to enter their choice
        System.out.println("Enter a choice: ");
        int choice = reader.nextInt();
         

        // Use a switch statement to call the appropriate method based on the user's choice
        switch (choice) 
        {
            case 1 -> 
           {
               // if the user chooses option 1 call the ShowPets method
               ShowPets();
           }
            case 2 -> 
           {
               // if the user chooses option 2 call the AddPets method
               AddPets();
           }
            case 3 ->
           {
               // if the user chooses option 3 call the UpdatePet method
               UpdatePet();
           }
            case 4 -> 
           {
               // if the user chooses option 4 call the RemovePet method
               RemovePet();
           }
            case 5 -> 
           {
               // if the user chooses option 5 call the SearchPetByName method
               SearchPetByName();
           }
            case 6 -> 
           {
               // if the user chooses option 6 call the SearchByAge methodd
               SearchPetByAge();
           }
            case 7 ->
           {
               // if the user chooses option 7 call exit.
               Exit();
           }
           // if they enter a invalid option ask them to try again.
            default -> System.out.println("Invalid entry. Please enter a valid option.");
        }
    }
    //ShowPets
    public void ShowPets()
    {
        
        while(!pets.isEmpty())
        {
            // Print the top design of the table.
            System.out.println("+-------------------------+");
            System.out.println("| ID | NAME         | AGE |");
            System.out.println("+-------------------------+");
            // for loop that starts at the begining of the array and continues until 
            // the array length is reached.
            // Loop through the "pets" array and print each pet's information.
            for (int i = 0; i < pets.size(); i++)
            {
                // Get the current pet from the "pets" list.
                Pet pet = pets.get(i);

                // Print the pet's information in a formatted way.
                System.out.printf("| %2d | %-12s | %3d |\n", i, pet.getName(), pet.getAge());
            }

            // Print the bottom design of the table.
            System.out.println("+-------------------------+");
        
            System.out.println(" ");
        
            // menu
            Menu();
        }
        
        System.out.println("Sorry there are not pets right now, try adding one!");
        System.out.println(" ");
        
        // Call Menu
        Menu();
        
    }
    
    // AddPets
    public void AddPets()
    {
        // Ask the user how many pets they want to create
        System.out.println("How many Pets would you like to add? ");
        int numPets = reader.nextInt();
        
        // Consume the newline character
        reader.nextLine();
    
        // while not at that num 
        while(pets.size() < numPets)
        {
            System.out.println(" ");
            // Ask the user for the pet's name and age together.
            System.out.println("Please enter the pet's name and age (e.g., Name Age): ");
            String input = reader.nextLine();

            // Split the input into name and age.
            String[] parts = input.split(" ");
            if (parts.length == 2) 
            {
                String newName = parts[0];
                int newAge = Integer.parseInt(parts[1]);

                // Create the pet.
                Pet newPet = new Pet(newName, newAge);

                // Put the pet into the array.
             pets.add(newPet);
            }
            else
            {
            System.out.println("Invalid input. Please enter the name and age separated by a space.");
            }
        }
        
        // menu
        Menu();
    }
    
    // UpdatePet
    public void UpdatePet()
    {
        // Call the show pets to print the current pets
        // Ask the user to enter the ID of the pet they want to change.
        // Ask the user to enter a new name and age for the pet at the id requested.
        // print the change.
        // menu
    }
    
    // RemovePet
    public void RemovePet()
    {
        // Call the show pets to print the current pets
        // Ask the user to enter the ID of the pet they want to remove.
        // remove the pet from the array.
        // print the change.
        // menu.
    }
    
    // Helper method for the searchPetByName and SearchPetByAge, to only show one pet.
    public void ShowSinglePet(Pet pet, int index) 
    {
        // Print the top design of the table.
        System.out.println("+-------------------------+");
        System.out.println("| ID | NAME         | AGE |");
        System.out.println("+-------------------------+");

        // Print the pet's information in the same format as in ShowPets.
        System.out.printf("| %2d | %-12s | %3d |\n", index, pet.getName(), pet.getAge());

        // Print the bottom design of the table.
        System.out.println("+-------------------------+");
        System.out.println(" ");
    }
    
    // SearchPetByName
    public void SearchPetByName()
    {
        // Ask the user for the name of the pet they want to search for
        System.out.println("Enter the name of the pet you want to search for: ");
        String name = reader.next();
        
         ArrayList<Pet> searchedForPets = new ArrayList<>();
        
        
        // Iterate through the list of pets to find pet with the specified name
        for (int i = 0; i < pets.size(); i++) 
        {
            // get the pet at the current index.
            Pet pet = pets.get(i);
            
            /// Check if the pet's name matches the searchName (case-insensitive)
            if (pet.getName().equalsIgnoreCase(name)) 
            {
                searchedForPets.add(pet); // Collect matching pets in a list
            }
        }

        if (!searchedForPets.isEmpty()) 
        {
            // Display the details of all the matching pets
            System.out.println("Found matching pets:");
            for (int i = 0; i < searchedForPets.size(); i++) 
            {
                ShowSinglePet(searchedForPets.get(i), i);
            }
        }   
        else 
        {
            System.out.println("No pets with the name '" + name + "' found in the database.");
        }
    
        // menu.
        Menu();
    }
    
    // SearchPetsByAge
    public void SearchPetByAge()
    {
        // Ask the user for the name of the pet they want to search for
        System.out.println("Enter the Age of the pet you want to search for: ");
        int age = reader.nextInt();
        
         ArrayList<Pet> searchedForPets = new ArrayList<>();
        
        
        // Iterate through the list of pets to find pet with the specified name
        for (int i = 0; i < pets.size(); i++) 
        {
            // get the pet at the current index.
            Pet pet = pets.get(i);
            
            /// Check if the pet's name matches the searchName (case-insensitive)
            if (pet.getAge()== age) 
            {
                // Collect matching pets in a list
                searchedForPets.add(pet); // Collect matching pets in a list
            }
        }

        if (!searchedForPets.isEmpty()) 
        {
            // Display the details of all the matching pets
            System.out.println("Found matching pets:");
            for (int i = 0; i < searchedForPets.size(); i++) 
            {
                ShowSinglePet(searchedForPets.get(i), i);
            }
        }   
        else 
        {
            System.out.println("No pets with the Age '" + age + "' found in the database.");
        }
    
        // menu.
        Menu();
    }
    
    // Exit
    public void Exit()
    {
        // print "Thank you for using our database... goodbye :)"
    }
    
    
}
