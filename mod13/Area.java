/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod13;

/**
 *
 * @author Posgrado2
 */
public class Area {
    
    
    
    public void area(double radio){
        
        System.out.println("Area of circle = 3.14 * radius * radius");
    }
    
    public  void area(double base, double height){
        
        System.out.println("Area of triangle = 0.5 * base * height");
    }
    
    public  void area(float length, double breadth){
        
        System.out.println("Area of rectangle = length * breadth");
    }
    
    public  void area(double ... z){
        System.out.println("Area of cylinder = 3.14 * radius * radius * heightLab");
    }
}
