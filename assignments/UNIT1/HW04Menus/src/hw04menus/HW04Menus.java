/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW04Menus{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Factorial");
            System.out.println("2. -> Square root");
            System.out.println("3. -> Power");
            System.out.println("4. -> Triangle Area");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int number;
                    int factorial;
                    
                    factorial = 1;
                                                                               
                    System.out.println("enter Number -> ");
                    number = input.nextInt();
                     for (int i = number; i > 0; i--){
                        factorial = factorial * i;}
                    
                    System.out.println("The factorial is --> " + factorial);
                    break;
                case 2:
                    int RealNumber;
                    double result;
                    
                    System.out.println("Enter a Real Number ->");
                    RealNumber = input.nextInt();
                    result = sqrt(RealNumber);
                    System.out.println("The square root is --> " + result);
                    break;
                case 3:
                    double base;
                    double exponent;
                    double Power;
                    
                    System.out.println("Enter the base of the power -> ");
                    base = input.nextInt();
                    System.out.println("Enter de exponent of the power -> ");
                    exponent = input.nextInt();
                    Power = Math.pow(base, exponent);
                    System.out.println("The power is --> " + Power);
                    break;
                case 4:
                    float Base;
                    float height;
                    float Area;
                    
                    System.out.println("Enter the Base of the triangle -> ");
                    Base = input.nextFloat();
                    System.out.println("Enter the height of the triangle -> ");
                    height = input.nextFloat();
                    
                    Area = (Base * height)/2;
                    System.out.println("The Area of the Triangle is -->" + Area);
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
    }
    
}
