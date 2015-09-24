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
public class TestRectangle {
    
    public static void main(String[] args) {
        
        Rectangle obj = new Rectangle();
        
        obj.setAlto(5);
        obj.setAncho(10);
        System.out.println("Altura="+ obj.getAlto());
        System.out.println("Ancho="+ obj.getAncho());
        System.out.println("Area="+ obj.getArea());
        System.out.println("Perimetro="+ obj.getPerimetro());
        obj.draw();
    }
}
