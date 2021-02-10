/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qgis.project;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class QGISProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Coordinatex1;
        double Coordinatex2;
        double Coordinatey1;
        double Coordinatey2;
        double dist;

        double Sx1;
        double Sx2;
        double Sy1;
        double Sy2;
        double disites;

        int Currentvariable = 0;
        int Oldvariable = 0;
        final int valor = 100;
        float y = 0;
        y = calculateThePopulationPercent(Currentvariable, Oldvariable, valor);

        int mainRivers;
        int wildlifeReserve;
        int riversAndReserves;

        Scanner input = new Scanner(System.in);
        System.out.println(" <-- Insert a coordinatex1 -->");
        Coordinatex1 = input.nextInt();

        System.out.println(" <-- Insert a coordinatex2 -->");
        Coordinatex2 = input.nextInt();

        System.out.println(" <-- Insert a coordinatey1 -->");
        Coordinatey1 = input.nextInt();

        System.out.println(" <-- Insert a coordinatey2 -->");
        Coordinatey2 = input.nextInt();

        dist = ShowTheDistanceBetweenTwoEcuatoriansVolcanos(Coordinatex1, Coordinatex2, Coordinatey1, Coordinatey2);
        System.out.println(" <- dist is -> " + dist);

        System.out.println(" <-- Insert a Sx1 -->");
        Sx1 = input.nextInt();

        System.out.println(" <-- Insert a Sx2 -->");
        Sx2 = input.nextInt();

        System.out.println(" <-- Insert a Sy1 -->");
        Sy1 = input.nextInt();

        System.out.println(" <-- Insert a Sy2 -->");
        Sy2 = input.nextInt();

        disites = performTheDistanceBetweenTwoPlaces(Sx1, Sx2, Sy1, Sy2);
        System.out.println(" <- disites is -> " + disites);

        System.out.println("The percentage is");
        System.out.println("enter Currentvariable -> ");
        Currentvariable = input.nextInt();
        System.out.println("enter Oldvariable -> ");
        Oldvariable = input.nextInt();
        y = ((Currentvariable - Oldvariable) / Oldvariable) * valor;

        y = calculateThePopulationPercent(Currentvariable, Oldvariable, valor);
        System.out.println(" percentage of" + y + "is equal to ->" + y);

        System.out.println("Enter the amount of rivers -> ");
        mainRivers = input.nextInt();

        System.out.println("Enter the amount ofwildlifeReserves -> ");
        wildlifeReserve = input.nextInt();

        ShowTheNumberOfRiversAndReservesOfEcuador(mainRivers, wildlifeReserve);

    }

    public static double ShowTheDistanceBetweenTwoEcuatoriansVolcanos(double Coordinatex1, double Coordinatex2, double Coordinatey1, double Coordinatey2) {
        double dist;
        double first;
        double second;
        first = Math.pow(Coordinatex2 - Coordinatex1, 2);
        second = Math.pow(Coordinatey2 - Coordinatey1, 2);

        dist = (double) Math.sqrt(first + second);

        return (double) dist;

    }

    public static double performTheDistanceBetweenTwoPlaces(double Sx1, double Sx2, double Sy1, double Sy2) {
        double disites;
        double place1;
        double place2;
        place1 = Math.pow(Sx2 - Sx1, 2);
        place2 = Math.pow(Sy2 - Sy1, 2);

        disites = (double) Math.sqrt(place1 + place2);

        return (double) disites;
    }

    public static float calculateThePopulationPercent(int Currentvariable, int Oldvariable, int valor) {
        float y = 0.0F;

        y = (((float) Currentvariable - (float) Oldvariable) / (float) Oldvariable) * valor;

        return y;
    }

    public static int ShowTheNumberOfRiversAndReservesOfEcuador(int mainRivers, int wildlifeReserves) {

        int riversAndReserves;
        riversAndReserves = mainRivers + wildlifeReserves;
        System.out.println("the total number of wildlife reserves and main rives of the Ecuador is --> " + riversAndReserves);
        return riversAndReserves;
    }
}