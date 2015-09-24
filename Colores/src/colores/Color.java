/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

/**
 *
 * @author iphoeniix
 */
public class Color 
{
    private String colorName;
    final void setColor(String color)
    {
        colorName = color;
        
    }        
    
    String getCOlor()
    {
        return colorName;
    }
    
    public Color(String q)
    {
        colorName = q;
    }
    
    public Color()
    {
        
    }
}
