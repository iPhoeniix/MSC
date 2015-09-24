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
public class Edad {
 
    public static void main(String[] args) {
        int may=0, men=1000, sum=0;
        double prom = 0;
        int edad [] = { 21,35,18,12,40,27,17,30,24,31};
        
        for (int i = 0; i < 10; i++) {
            
            if(edad [i] >= may)
                may = edad[i];
            
            if(edad[i] <= men) 
                men = edad[i];
            
            
             sum += edad[i];   
        }
        prom = sum / 10;
        System.out.println("Edad mayor:" + may);
        System.out.println("Edad menor:" + men);
        System.out.println("Edad media:" + prom );
        
    }
}
