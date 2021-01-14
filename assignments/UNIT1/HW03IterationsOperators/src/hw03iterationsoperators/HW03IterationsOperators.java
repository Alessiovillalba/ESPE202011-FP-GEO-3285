/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterationsoperators;

/**
 *
 * @author Alessio
 */
public class HW03IterationsOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Multiplication Tables : 7");
        int top = 48;
        int product;
        int table = 7;
        int i;
        i = 0;
        
        while (i <= top){
            product = table * i;
            System.out.println(" 7 * " + i + " = " + product);
            i++;
        }
        
        System.out.println("-----------------------------------------------");
            
        System.out.println("Multiplication Tables : 51");
        int top1 = 12;
        int product1;
        int table1 = 48;
        for (int o = 1; o <= top1 ; o++){
            product1 = table1 * o;
            System.out.println("48 * " + o + " = " + product1);
          
        }
        System.out.println("-----------------------------------------------");
        
        System.out.println("Countdown");
        
        for(int l = 50; l > 0; l--)
            System.out.println(l);

       
        
        
    
    }
}