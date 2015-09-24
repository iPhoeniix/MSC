/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Haguar Soft-5
 */
public class DayOfWeek {
    public static void main(String[] args)throws IOException {
        
        int dia=0;
        
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa dia de la semana [numerico]:");
        dia = Integer.parseInt(leer.readLine());
        
        displayDay(dia);
    }
    
    private static void displayDay(int dia){
       
        
        if (dia == 1) 
            System.out.println("Lunes");
        else if(dia == 2)
            System.out.println("Martes");
        else if(dia == 3)
            System.out.println("Miercoles");
        else if(dia == 4)
            System.out.println("Jueves");
        else if(dia == 5)
            System.out.println("Viernes");
        else if(dia == 6)
            System.out.println("Sabado");
        else if(dia == 7)
            System.out.println("Domingo");
        else
            System.out.println("Dia Incorrecto!");
        
       
    }
}
