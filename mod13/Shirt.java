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
public class Shirt {
    
    private int id;
    private double precio;
    private String tipo;

    public Shirt(int id, double precio, String tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
}
