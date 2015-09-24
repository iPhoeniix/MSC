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
public class Rectangle {
    
    private int ancho;
    private int alto;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public float getArea(){
        
        return ancho * alto;
    }
    
    public float getPerimetro(){
        
        return (float)((2 * ancho)+ (2 * alto));
    }
    
    public void draw (){
        for (int i = 0; i < alto; i++) {
            System.out.println("");
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            
        }
    }
      
    
}
