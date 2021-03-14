/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibraries;

import ec.edu.espe.matrixoperation.matrixOperations;
import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows (m) of the matrix ->");
        m = input.nextInt();
        System.out.println("Enter the number of columns (n) of the matrix ->");
        n = input.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        System.out.println("Enter the numbers of the Matrix A:");
        a = readMatrixA(m, n, a, input);

        System.out.println("");

        System.out.println("Enter the numbers of the matrix B");
        b = readMatrixB(m, n, b, input);

        System.out.println("");

        System.out.println("the sum of matrix A and Matrix B is ->");
        c = matrixOperations.addTheMatrices(m, n, c, a, b);
        System.out.println("");

        System.out.println("the substraction of matrix A and Matrix B is ->");
        c = matrixOperations.substractTheMatrices(m, n, c, a, b);
        System.out.println("");

        System.out.println("the multiplication of matrix A and Matrix B is ->");
        c = matrixOperations.multiplicateTheMatrices(m, n, c, a, b);
        System.out.println("");

    }

    public static int[][] readMatrixA(int m, int n, int[][] a, Scanner input) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
                System.out.print("\t " + a[i][j]);
            }
        }
        return a;
    }

    public static int[][] readMatrixB(int m, int n, int[][] b, Scanner input) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
                System.out.print("\t " + b[i][j]);
            }
        }
        return b;

    }

}
