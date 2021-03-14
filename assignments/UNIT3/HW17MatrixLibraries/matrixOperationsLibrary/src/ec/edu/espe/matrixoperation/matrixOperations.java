/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrixoperation;

/**
 *
 * @author Alessio
 */
public class matrixOperations {
    
    public static int[][] addTheMatrices(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print("\t " + c[i][j]);
            }
        }
        return c;
    }

    public static int[][] substractTheMatrices(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print("\t " + c[i][j]);
            }
        }
        return c;
    }
    
    public static int[][] multiplicateTheMatrices(int m, int n, int[][] c, int[][] a, int[][] b) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print("\t " + c[i][j]);
            }
        }
        return c;
    }
}
    
