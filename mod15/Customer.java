/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod15;

/**
 *
 * @author Deivid
 */
public class Customer {
    
    public String name;
    public String firstName;
    public String lastName;
    public String direccion;

    public Customer(String name, String firstName, String lastName) {
        System.out.println("Ms. "+ name + " " + firstName + " "+ lastName);
    }

    public Customer(String direccion) {
        this.direccion = direccion;
    }

    public Customer() {
         this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
       
    }
    
    
    
}
