/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericprimitiveslong;

/**
 *
 * @author Alessio
 */
public class NumericPrimitivesLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long car1;
        long car2;
        long car3;
        long car4;
        long car5;
        long totalcars;
        long average;

        car1 = 539;
        car2 = 564;
        car3 = 551;
        car4 = 580;
        car5 = 576;
        totalcars = 5;

        average = ((car1 + car2 + car3 + car4 + car5) / totalcars);

        System.out.println("The average of " + " (" + (car1 + "+" + car2 + " + " + car3 + " + " + car4 + " + " + car5 + ")" + " / " + totalcars)
                + " Is equal to --> " + average);

    }

}
