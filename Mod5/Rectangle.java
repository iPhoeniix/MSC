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
public class Rectangle {
    
    int width = 2;
    int length = 10;
    
    public static void main(String... args) {
        
        Rectangle rectangle = new Rectangle();
        int area = rectangle.length * rectangle.width;

        System.out.println("Area : " + area);
    }
    
}
