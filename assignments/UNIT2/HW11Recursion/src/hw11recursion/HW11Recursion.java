/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers you want in the sequence --> ");
        int stop = input.nextInt();
        int number = 0;
        
        printFibonacciSequence(number);
        for (int i = 0; i < stop; i++) {
            System.out.print(printFibonacciSequence(i) + ", ");
        }
    }

    public static int printFibonacciSequence(int number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return printFibonacciSequence(number - 1) + printFibonacciSequence(number - 2);
        }
    }

}
