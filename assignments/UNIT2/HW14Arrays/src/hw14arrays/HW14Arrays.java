/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] fuelCapacities;
        String[] carBrands = {"Mercedes", "Fiat", "Audi", "BMW", "Alfa Romeo"};
        float[] gallonsOfFuel = {5.74F, 6.2F, 5.22F, 5.91F, 6.83F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the total of the cars -> ");
        n = input.nextInt();

        fuelCapacities = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of car " + (i + 1) + " -> ");
            fuelCapacities[i] = input.nextInt();
        }
        System.out.println("--------------------------------- ");

        for (int Capacities : fuelCapacities) {
            System.out.println("the capacity of the car is -> " + Capacities);
        }
        System.out.println("--------------------------------- ");
        

        for (int i = 0; i < n; i++) {
            System.out.println("capacity of the car " + (i + 1) + " -> " + fuelCapacities[i]);
        }
        System.out.println("--------------------------------- ");
        

        for (String carBrand : carBrands) {
            System.out.println("brand of the car -> " + carBrand);
        }
        System.out.println("--------------------------------- ");
        

        for (int i = 0; i < gallonsOfFuel.length; i++) {
            System.out.println("gallons of fuel used by the car per 100 kilometers " + (i + 1) + " -> " + gallonsOfFuel[i]);
        }
        

        
    }
}
