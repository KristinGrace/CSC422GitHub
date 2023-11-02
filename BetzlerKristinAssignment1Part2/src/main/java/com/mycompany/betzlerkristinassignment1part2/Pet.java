/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betzlerkristinassignment1part2;

/**
 *
 * @author Kristin
 */
public class Pet 
{
    // A pet has a name
    private String name = "";
    // A pet has an age
    private int age = 0;
    
    // The Pet has a name and an age
    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    // get the pets name
    public String getName()
    {
        return name;
    }
    
    // get the pets age
    public int getAge()
    {
        return age;
    }
    
    // set the pets name
    public void setName(String name) 
    {
        this.name = name;
    }

    // set the pets age
    public void setAge(int age) 
    {
        this.age = age;
    }
}
