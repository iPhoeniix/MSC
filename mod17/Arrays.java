/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod17;

/**
 *
 * @author Haguar Soft-5
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        int[] enteros = new int [5];
        String [] nom = {"Frank", "Bob", "Jim"};
        
        for (int i = 0; i < 5; i++) {
            enteros[i] = i + 10;
        }
        
        System.out.println("Array de enteros:");
        for (int entero : enteros) {
            System.out.println("\t" + entero);
        }
        
        System.out.println("Arrays de String");
        for (int i = 0; i < nom.length; i++) {
            System.out.println("\t"+ nom[i]);
        }
        
        nom[2]="Mike";
        System.out.println("\n ultimo elemento:"+ nom[2]);
    }
}
