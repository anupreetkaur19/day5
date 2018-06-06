/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import static day5.A.number;

/**
 *
 * @author DS BOBBY
 */
public class TestA extends TestC implements A, B, C{
    
    public void display(){
         System.out.println(" number inside A : " + number);
    }
    
     public void show(){
         System.out.println("Show insde B");
     }
     public void output(){
         System.out.println("Output from C");
     
    
     }

    @Override
    public void dispaly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
