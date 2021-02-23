/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (m) of the matrix ->");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns (n) of the matrix ->");
        int n = scanner.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        
        System.out.println("The multiplication of matrix A -> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                System.out.print("\t " + a[i][j]);

            }
        }
        System.out.println("\nAnd Matrix B -> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
                System.out.print("\t " + b[i][j]);
            }
        }
        System.out.println("\nequals to -> ");
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print("\t " + c[i][j]);
            }
        }
        System.out.println();
            
    }
}
