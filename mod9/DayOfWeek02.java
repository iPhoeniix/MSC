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
public class DayOfWeek02 {
    
    public static void main(String[] args) throws IOException {
        
        int dia;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingresa dia de la semana [numerico]:");
        dia = Integer.parseInt(leer.readLine());
        
        displayDay(dia);
    }
    
    private static void displayDay (int dia){
        
        switch (dia) {
            case 1: System.out.println("Lunes");
                
                break;
            case 2:System.out.println("Martes");
                
                break;
            case 3:System.out.println("Miercoles");
                
                break;
                
            case 4:System.out.println("Jueves");
                
                break;
             case 5:System.out.println("Viernes");
                
                break;
            case 6:System.out.println("Sabado");
                
                break;
            case 7:System.out.println("Domingo");
                
                break;
            default: System.out.println("Dia Incorrecto!");
                
        }
    }
}
