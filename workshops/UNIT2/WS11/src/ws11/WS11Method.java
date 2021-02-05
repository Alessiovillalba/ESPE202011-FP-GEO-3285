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
public class WS11Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("||||||||| Embedded Structures||||||||  ");
        System.out.println(" programmers:\n Ochoa Erick\n"
                + " Portero Carla\n"
                + " Pilataxi Kyara\n"
                + " Villalba Alessio\n"
                + " Yaguana Kevin\n\n ");
        Scanner scanner = new Scanner(System.in);
        float operand1;
        float operand2;
        float product;
        float division;
        float addition;
        float modulus;
        char option;

        do {
            System.out.print("Enter operand1 --> ");
            operand1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter operand2 -->  ");
            operand2 = scanner.nextInt();
            scanner.nextLine();

            if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                ShowMultiplication(operand1, operand2);
            } else if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                ShowAddition(operand1, operand2);
            } else if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                ShowModulus(operand1, operand2);
            } else if (operand1 % 11 == 0 && operand2 % 11 == 0) {
                ShowMultiplicationTable(operand1, operand2);
            } else if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                ShowDivision(operand1, operand2);
            } else {
                System.out.println("The operation is not recognized");
                System.out.println("The operation not exist");
            }

            System.out.println();
            System.out.println();
            System.out.println("Do you want retry again? [y/n]");
            option = scanner.nextLine().charAt(0);
        } while (option != 'n');
    }

    public static void ShowDivision(float operand1, float operand2) {
        float division;
        division = (operand1 / operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + division);
    }

    public static void ShowModulus(float operand1, float operand2) {
        float modulus;
        modulus = operand1 % operand2;
        System.out.println(operand1 + " % " + operand2 + " = " + modulus);
    }

    public static void ShowAddition(float operand1, float operand2) {
        float addition;
        addition = operand1 + operand2;
        System.out.println(operand1 + " + " + operand2 + " = " + addition);
    }

    public static void ShowMultiplication(float operand1, float operand2) {
        float product;
        product = operand1 * operand2;
        System.out.println(operand1 + " x " + operand2 + " = " + product);
    }

    public static void ShowMultiplicationTable(float paramOperand1, float paramOperan2) {
        int result;
        for (int i = 1; i <= 12; i++) {
            System.out.println(paramOperand1 + " x " + i + " = " + (1 * i));
        }

        if (paramOperand1 != paramOperan2) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(paramOperan2 + " x " + i + " = " + (paramOperan2 * i));
            }
        }
    }
}