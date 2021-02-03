/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW05FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int factorial;

        factorial = 1;

        do {
            System.out.println("-------------WELCOME-------------");
            System.out.println("numer");
            System.out.println("Enter a not specified number to exit -->");

            Scanner input = new Scanner(System.in);
            number = input.nextInt();

            if (number <= 15 && number >= 0) {
                System.out.println("The factorial of -->" + number);
                for (int i = number; i > 0; i--) {
                    factorial = factorial * i;

                }
                System.out.println("The factorial is --> " + factorial);
            }

        } while (number <= 15 && number >= 0);

        System.out.println("Good bye");

    }
}
