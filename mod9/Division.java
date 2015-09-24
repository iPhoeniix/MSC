/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9;

import java.io.*;

/**
 *
 * @author Haguar Soft-5
 */
public class Division {
    
    public static void main(String[] args)throws IOException {
        
        double num1,num2,num3;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa num1:");
        num1 = Double.parseDouble(leer.readLine());
        System.out.println("Ingresa num2:");
        num2 = Double.parseDouble(leer.readLine());
        System.out.println("Ingresa num3:");
        num3 = Double.parseDouble(leer.readLine());
        
        if (num1 == 0 || num2 == 0) 
            System.out.println("Error division por cero");
        else{
            System.out.println(num3 + "/" + num1 + "=" + (num3 / num1) );
            System.out.println(num3 + "/" + num2 + "=" + (num3 / num2) );
                }
           
      
    } 
}