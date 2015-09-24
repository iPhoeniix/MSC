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
public class Methodcall {
    
    public static void main(String[] args) {

        new Methodcall().start(); // students: ignore this
        new Methodcall().sayHello();
        
    }

    public void start() { // a test harness for two methods

        System.out.println(new Methodcall().addTwo(2));
        System.out.println(new Methodcall().addTwo(19));

    }

    public void sayHello(){
        System.out.println("Hola");
    }

    public int addTwo(int x){
    
        return x+2;
    }

    
}
