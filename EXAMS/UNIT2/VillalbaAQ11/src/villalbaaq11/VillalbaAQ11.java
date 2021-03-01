/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villalbaaq11;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class VillalbaAQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------Alessio Villalba----------");

        System.out.println("-----Exercise 1----- \nAdd the elements of an array of 5 integers: ");

        Scanner scanner = new Scanner(System.in);
        int addOfFiveIntegers[] = new int[5];
        int sum = 0;
        float averageOfThreeNumbers[] = new float[3];
        float average = 0;

        System.out.println("Enter every entegers of the array ->");

        sum = addFiveIntegers(addOfFiveIntegers, scanner, sum);

        System.out.println("the sum of the array is -> " + sum);

        System.out.println("-----Exercise 2----- \nCompute the average of three elements of an array of floats: ");
        System.out.println("Enter the numbers of the array -> ");

        average = computeTheAverage(averageOfThreeNumbers, scanner, average);

        System.out.println("the average of the array is -> " + average);

    }

    public static int addFiveIntegers(int[] addOfFiveIntegers, Scanner scanner, int sum) {
        for (int i = 0; i < 5; i++) {
            addOfFiveIntegers[i] = scanner.nextInt();
        }
        for (int num : addOfFiveIntegers) {
            sum = sum + num;
        }
        return sum;
    }

    public static float computeTheAverage(float[] averageOfThreeNumbers, Scanner scanner, float average) {
        for (int i = 0; i < 3; i++) {
            averageOfThreeNumbers[i] = scanner.nextFloat();
        }
        for (float num : averageOfThreeNumbers) {
            average =((average + num) / 3);
        }
        return average;

    }
}
