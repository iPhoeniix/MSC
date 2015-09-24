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
public class Prims 
{
    void activadePrims(Color c)
    {
        
        if (c.getCOlor().equals("White"))
        {
            Violeta v = new Violeta("Violeta");
            Indigo  i = new Indigo("Indigo");
            Blue    b = new Blue("Blue");
            Green   g = new Green("Green");
            Yellow  y = new Yellow("Yellow");
            Orange  o = new Orange("Orange");
            Red     r = new Red("Red");
            
            System.out.println(v.getCOlor());
            System.out.println(i.getCOlor());
            System.out.println(b.getCOlor());
            System.out.println(g.getCOlor());
            System.out.println(y.getCOlor());
            System.out.println(o.getCOlor());
            System.out.println(r.getCOlor());
        }
        
    }
    
    
}
