/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortingintegers.controller;

/**
 *
 * @author Alessio
 */
public class Sorting {

    public int[] sortByBubbleSort(int[] integers) {
        int n = integers.length;

        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
                System.out.print("sorting --> ");
            }
            System.out.println("");
        }
        return integers;
    }
}
