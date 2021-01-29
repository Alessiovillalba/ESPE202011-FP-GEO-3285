/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit1;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class ExamUnit1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("1. -> MULTIPLICATION TABLE ");
            System.out.println("2. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int x;
                    int multiplicator;
                    int product;
                    int i = 0;

                    multiplicator = 12;

                    System.out.println("Enter a Number ->");
                    x = input.nextInt();

                    for (int o = 1; o <= multiplicator; o++) {
                        product = x * o;
                        System.out.println(x + "*" + o + " = " + product);
                        break;

                    
            
            case 2:
                    
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                    }
            }while (option != 2);

        }
