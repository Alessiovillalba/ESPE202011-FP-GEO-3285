/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Alessio
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int substrahend;
        int difference;
        
        int multiplicand;
        int multiplicator;
        int product;
        
        int dividend;
        int divisor;
        int quotient;
        
        int remainder;
        
        dividend = 75;
        divisor = 5;
               
        multiplicand = 4;
        multiplicator = 7;
        
        minuend = -23;
        substrahend = -6;
        
        //initialization
        addend1 = 5;
        addend2 = 18;
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The  addition of " + addend1 + "+" + addend2 +
                " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to--> " + sum);
        
        sum++;
        System.out.println("sum is equal to--> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum " + ((++sum)));
        
        System.out.println("the substraction of " + minuend + "-" + substrahend + 
                " is equal to --> "  + (minuend - substrahend));
        
        System.out.println("the multiplication of " + multiplicand + "*" + multiplicator +  
                " is equal to --> " + (multiplicand * multiplicator));
        
        System.out.println("the division of " + dividend + "/" + divisor +
                " is equal to --> " + (dividend / divisor));
        
        System.out.println("the modulus of " + dividend + "%" + divisor + 
                " is equal to --> " + (dividend % divisor));
        
                
    }
    
}
