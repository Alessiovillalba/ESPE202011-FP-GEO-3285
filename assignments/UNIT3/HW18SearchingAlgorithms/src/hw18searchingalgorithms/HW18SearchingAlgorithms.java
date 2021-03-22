/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searchingalgorithms;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW18SearchingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] firstTenPrimeNumbers = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23};
        int[] multipliesOfNine = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        int result;
        int x;
        int left = 0;
        int right = 0;

        System.out.println("Searching by linear search a prime numbers from 1 to 23");
        System.out.println("{1, 2, 3, 5, 7, 11, 13, 17, 19, 23}");

        x = printTheNumberToSearch();

        result = executeLinearSearch(firstTenPrimeNumbers, x);
        System.out.println("the number is in the position -> " + result);

        System.out.println("Searching by binary search multiplies of 9: ");
        System.out.println("{9, 18, 27, 36, 45, 54, 63, 72, 81, 90}");

        x = printTheNumberToSearch();

        result = executeBinarySearch(multipliesOfNine, left, right, x);
        System.out.println("the number is in the position -> " + result);

    }

    public static int printTheNumberToSearch() {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to search in the array ->");
        x = input.nextInt();
        return x;
    }

    public static int executeLinearSearch(int firstTenPrimeNumbers[], int x) {
        int n = firstTenPrimeNumbers.length;
        for (int i = 0; i < n; i++) {
            if (firstTenPrimeNumbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int executeBinarySearch(int elements[], int left, int right, int x) {
        if (right >= left){
            int mid = left + (right - left) / 2;

            if (elements[mid] == x) 
                return mid;
            
            if (elements[mid] > x) 
                return executeBinarySearch(elements,left,mid-1,x);
            

            return executeBinarySearch(elements, mid + 1, right, x);
        }
        return -1;
    }
}
