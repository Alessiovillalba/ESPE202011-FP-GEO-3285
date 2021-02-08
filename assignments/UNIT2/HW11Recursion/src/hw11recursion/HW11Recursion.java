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
        int mainRivers;
        int wildlifeReserve;
        int riversAndReserves;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of rivers -> ");
        mainRivers = input.nextInt();

        System.out.println("Enter the amount ofwildlifeReserves -> ");
        wildlifeReserve = input.nextInt();

        ShowTheNumberOfRiversAndReservesOfEcuador(mainRivers, wildlifeReserve);
    
        System.out.println("Enter how many numbers you want in the sequence --> ");
        int stop = input.nextInt();
 
          for(int i = 0; i<stop; i++){
               System.out.print(printFibonacciSequence(i) + ", ");
          }
     }

    public static void ShowTheNumberOfRiversAndReservesOfEcuador(int mainRivers, int wildlifeReserves) {
        int riversAndReserves;
        riversAndReserves = mainRivers + wildlifeReserves;
        System.out.println("the total number of wildlife reserves and main rives of the Ecuador is --> " + riversAndReserves);
    }
 
     public static int printFibonacciSequence(int number){
          if(number == 0 || number == 1)
               return number;
          else
               return printFibonacciSequence(number-1) + printFibonacciSequence(number-2);
     }
 
}
