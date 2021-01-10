/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericprimitivefloat;

/**
 *
 * @author Alessio
 */
public class NumericPrimitiveFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float car1;
        float car2;
        float car3;
        float car4;
        float car5;
        float totalcars;
        float average;
        
        car1 = (float) 358.56;
        car2 = (float) 379.59;
        car3 = (float) 396.94;
        car4 = (float) 371.63;
        car5 = (float) 326.55;
        totalcars = (float) 5.00;
        
        
        average = ((car1 + car2 + car3 + car4 + car5) / totalcars);
        
        System.out.println("The average of " + " (" + (car1 + " + " + car2 + " + " + car3 + " + " + car4 + " + " + car5 + ")" + " / " + totalcars) +
                " Is equal to --> " + average);
        
        
        
    }
    
}
