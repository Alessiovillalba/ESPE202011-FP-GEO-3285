/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericprimitivesshort;

/**
 *
 * @author Alessio
 */
public class NumericPrimitivesShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short car1;
        short car2;
        short car3;
        short car4;
        short car5;
        short totalcars;
        short average;
        
        car1 = 245;
        car2 = 297;
        car3 = 254;
        car4 = 233;
        car5 = 276;
        totalcars = 5;
        
        
        average =(short) ((car1 + car2 + car3 + car4 + car5) / totalcars);
        
        System.out.println("The average of " + "(" + (car1 + " + " + car2 + " + " + car3 + " + " + car4 + " + " + car5 + ")" + " / " + totalcars) + 
                " is equal to--> " + average);
                    
    }
    
}
