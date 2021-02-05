/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class WS11Refactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int dividend;
        int divisor;
        float quotient;
        int base;
        int Square;
        int number;
        int result;
        int multiplicand;
        int multiplier = 12;
        int product;

        System.out.println("-------Welcome-------");
        System.out.println("PROGRAMMED BY: ");
        System.out.println("Alessio Villalba ");

        //Call to DivideTwoNumbers() function
        Scanner input = new Scanner(System.in);
        System.out.println("enter dividend -> ");
        dividend = input.nextInt();

        System.out.println("enter divisor -> ");
        divisor = input.nextInt();

        quotient = DivideTwoNumbers(dividend, divisor);
        System.out.println("Quotient of " + dividend + " and " + divisor + " is -->" + quotient);

        System.out.println("enter the base -> ");
        base = input.nextInt();

        Square = ComputeSquare(base);
        System.out.println("The square of " + base + " is --> " + Square);

        System.out.println("enter a number -> ");
        number = input.nextInt();

        result = ComputeParabola(number);
        System.out.println("The result of " + number + " * " + number + " + 2 * " + number + " + 1 is --> " + result);

        System.out.println("enter multpiplicand -> ");
        multiplicand = input.nextInt();

        product = PrintMultiplicationTable(multiplicand, multiplier);
        System.out.println("Multiplication Table of " + multiplicand);
        for (int i = 1; i <= multiplier; i++) {
            product = multiplicand * i;
            System.out.println(multiplicand + " * " + i + " = " + product);
        }

    }

    //function definition
    //ReturnDataType         name        parameter1    parameter2
    public static float DivideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        quotient = (float) dividend / (float) divisor;

        return quotient;

    }

    public static int ComputeSquare(int base) {
        int Square = 0;

        Square = base * base;

        return Square;
    }

    public static int ComputeParabola(int number) {
        int result = 0;

        result = number * number + 2 * number + 1;

        return result;
    }

    public static int PrintMultiplicationTable(int multiplicand, int multiplier) {
        int product = 0;

        for (int i = 1; i <= multiplier; i++) {

            product = multiplicand * i;

        }
        return product;

    }

}
