/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod5;

/**
 *
 * @author Haguar Soft-5
 */
public class Temperature {

    public Temperature() {
    }
    

    public double calculateCelsius( double grados){
        
        return ((grados - 32)* 5) / 9;
    }
    
}
