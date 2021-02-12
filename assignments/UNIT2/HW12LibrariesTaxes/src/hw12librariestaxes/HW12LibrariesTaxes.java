/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12librariestaxes;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW12LibrariesTaxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float price;
        float iva;
        float total;
        float tax;
        float option = 0.0F;

        iva = 1.12F;
        total = 0.0F;
        tax = 0.0F;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the product -> ");
        price = scanner.nextInt();
        scanner.nextLine();

        total = computeIva(price, iva);

        System.out.println("the total price include IVA is -> " + total);

        System.out.print("Enter the fractional base -> ");
        price = scanner.nextInt();
        scanner.nextLine();
        total = computeIncomeTax(price, tax);
        System.out.println("the total include the income tax is -> " + total);

        System.out.print("Enter the amount -> ");
        price = scanner.nextInt();
        total = computeForeingExchangeOutflow(price, tax, option);
        System.out.println("the total include Exchange tax -> " + total);

    }

    public static float computeIva(float price, float iva) {
        float total;
        {

            total = price * iva;
            return total;
        }
    }

    public static float computeIncomeTax(float price, float tax) {
        float total = 0.0F;
        if (price > 0 && price < 11212) {
            tax = 1.00F;
            total = price * tax;
            return total;
        } else if (price >= 11212 && price < 14285) {
            tax = 1.05F;
            total = price * tax;
            return total;
        } else if (price >= 14285 && price < 17854) {
            tax = 1.10F;
            total = price * tax;
            return total;
        } else if (price >= 17854 && price < 21442) {
            tax = 1.12F;
            total = price * tax;
            return total;
        } else if (price >= 21442 && price < 42874) {
            tax = 1.15F;
            total = price * tax;
            return total;
        } else if (price >= 42874 && price < 64297) {
            tax = 1.2F;
            total = price * tax;
            return total;
        } else if (price >= 64297 && price < 85729) {
            tax = 1.25F;
            total = price * tax;
            return total;
        } else if (price >= 85729 && price < 114288) {
            tax = 1.3F;
            total = price * tax;
            return total;
        } else if (price >= 114288) {
            tax = 1.35F;
            total = price * tax;
            return total;
        }
        return total;

    }

    public static float computeForeingExchangeOutflow(float price, float tax, float option) {
        float total = 0.0F;
        System.out.print("Enter the kind of pay (1) for credit or debit card pays -> /n (2) for online pays--> ");
        Scanner scanner = new Scanner(System.in);
        option = (float) scanner.nextInt();
        scanner.nextLine();
        {

            if (option <= 1 && price >= 5000) {
                tax = 1.05F;
                total = price * tax;
                return total;
            } else if (option <= 1 && price < 5000){
                tax = 1.00F;
            total = price * tax;
            return total;}

            else if (option >= 2 && price >= 100) {
                tax = 1.05F;
                total = price * tax;
                return total;
            }else
                tax=1.00F;
            total = price * tax;
                return total;

        }

    }

}
