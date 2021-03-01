/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunction;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class HW16MatrixFunction {

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
        a = readMatrixA(m, n, a, scanner);
        
        System.out.println("\nAnd Matrix B -> ");
        readMatrixB(m, n, b, scanner);
        
        System.out.println("\nequals to -> ");
        multiplicateTheMatrices(m, n, c, a, b);
        System.out.println();
    }

    public static void multiplicateTheMatrices(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print("\t " + c[i][j]);
            }
        }
    }

    public static int [][] readMatrixB(int m, int n, int[][] b, Scanner scanner) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
                System.out.print("\t " + b[i][j]);
            }
        }
        return b;
    }

    public static int [][] readMatrixA(int m, int n, int[][] a, Scanner scanner) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                System.out.print("\t " + a[i][j]);
                
            }
        }
        return a;
    }
    
}
