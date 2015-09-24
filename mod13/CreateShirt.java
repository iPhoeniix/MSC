/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod13;

/**
 *
 * @author Haguar Soft-5
 */
public class CreateShirt {
    
    public static void main(String[] args) {
        
        Shirt obj;
        
        obj = new Shirt(1, 100, "polo");
        System.out.println("ID:" + obj.getId());
        System.out.println("Precio:"+ obj.getPrecio());
        System.out.println("Tipo:" + obj.getTipo());
    }
}
