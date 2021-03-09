/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws19arraysinspection;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class YaguanaKQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //main........../10 points (it must be clean)
        //execution..../5 points (it must run and allows the user to enter the data)
        //addition......./5 points (function must do only the operation and return the sum)
        //average......./5 points (function must do only the operation and return the average)
        //find............../5 points (function must return true or false, if found)
        //execution addition/2     average/2  find/1
        Scanner input = new Scanner(System.in);

        int add = 0;
        int[] arreglo = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the " + i + " num:");
            arreglo[i] = ent.nextInt();
            add += arreglo[i];

        }
        for (int i = 0; i < 5; i++) {

            System.out.println("In the position " + (i + 1) + " it was saved: " + arreglo[i]);
            System.out.println("The sum total is: " + add);
            Scanner sc = new Scanner(System.in);
        }

        int i;
        float s = 0, p = 3;
        int[] a = new int[3];

        for (i = 0; i < 3; i++) {
            System.out.println("Enter the integer in position : " + (i + 1));

            a[i] = input.nextInt();//input.nextFloat();
        }
        for (i = 0; i < a.length; i++) {
            s = s + a[i];

            p = s / a.length;
        }
        System.out.println("the average is: " + p);
    }

}
