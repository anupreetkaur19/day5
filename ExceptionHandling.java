/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author DS BOBBY
 */
public class ExceptionHandling {
    public static void main(String args[]){
        try{
        int n = Integer.parseInt("123a");
        n = n / (n - n);
        System.out.println("n :" + n);
        
        if(n<150){
            throw new NumberFormatException();
        }
  
        int numbers[] = {10,20,30};
        }catch(ArithmeticException e){
        System.err.println(e);
        //e.printStackTrace();
        }
        catch(ArrayIndexOutofBoundsException e)
        {
            System.err.println(e);
        }finally{
            System.err.println(e);
                
    }
    
    }}
