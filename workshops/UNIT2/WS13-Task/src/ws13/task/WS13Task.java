/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float radius;
        float pi;
        float area;
        float side;
        float apothem;
        float majorDiagonal;
        float minorDiagonal;
        float mruv;
        float kineticEnergy;
        float speed;
        float angularSpeed;
        float curvatureRadius;
        float time;
        float distance1;
        float distance2;
        float speed1;
        float acceleration;
        float mass;

        pi = 3.1416F;

        Scanner scanner = new Scanner(System.in);

        System.out.print("--------Circle's Area-------- \n");
        System.out.print("Enter the radius of the circle -> ");
        radius = scanner.nextInt();
        scanner.nextLine();
        area = computeCircleArea(radius, pi);
        System.out.println("The Area of the circle is -->" + area);

        System.out.println("--------Regular penthgon Area-------- \n");
        System.out.print("Enter the side's lenght of the pentagon -> ");
        side = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the apothem's lenght of the pentagon -> ");
        apothem = scanner.nextInt();
        scanner.nextLine();
        area = computeRegularPentagonArea(side, apothem);
        System.out.println("The Area of the regular pentagon is -->" + area);

        System.out.print("--------Diamond's Area-------- \n");
        System.out.print("Enter the major diagonal's lenght of the pentagon -> ");
        majorDiagonal = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the minor diagonal's lenght of the pentagon -> ");
        minorDiagonal = scanner.nextInt();
        scanner.nextLine();
        area = computeDiamondArea(majorDiagonal, minorDiagonal);
        System.out.println("The Area of the diamond is -->" + area);

        System.out.print("--------Uniform Circular Motion-------- \n");
        System.out.print("Enter the angular speed -> ");
        angularSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the radius of path curvature -> ");
        curvatureRadius = scanner.nextInt();
        scanner.nextLine();
        speed = computeUniformCirularMotion(angularSpeed, curvatureRadius);
        System.out.println("The total uniform cirular motion is -->" + speed);

        System.out.print("--------Uniformly Varied Rectilinear Motion-------- \n");
        System.out.print("Enter the initial speed -> ");
        speed1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the initial distance -> ");
        distance1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the final distance -> ");
        distance2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the time -> ");
        time = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the acceleration -> ");
        acceleration = scanner.nextInt();
        scanner.nextLine();
        speed = computeUniformlyVariedRectilineMotion(speed1, distance1, distance2, time, acceleration);
        System.out.println("The total uniformly varied rectilinear motion is -->" + speed);

        System.out.print("--------Kinetic Energy-------- \n");
        System.out.print("Enter the  speed -> ");
        speed1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the mass -> ");
        mass = scanner.nextInt();
        kineticEnergy = computeKineticEnergy(mass, speed1);
        System.out.println("The total kinetic energy is -->" + kineticEnergy);

    }

    public static float computeKineticEnergy(float mass, float speed1) {
        float kineticEnergy;
        kineticEnergy = (1 / 2) * mass * (speed1 * speed1);
        return kineticEnergy;
    }

    public static float computeUniformlyVariedRectilineMotion(float speed1, float distance1, float distance2, float time, float acceleration) {
        float speed;
        speed = distance1 + speed1 * time + ((1 / 2) * acceleration * (time * time));
        return speed;

    }

    public static float computeUniformCirularMotion(float angularSpeed, float curvatureRadius) {
        float speed;
        speed = angularSpeed * curvatureRadius;
        return speed;
    }

    public static float computeCircleArea(float radius, float pi) {
        float area;
        area = pi * (radius * radius);
        return area;
    }

    public static float computeRegularPentagonArea(float side, float apothem) {
        float area;
        area = ((5 * side) * apothem) / 2;
        return area;
    }

    public static float computeDiamondArea(float majorDiagonal, float minorDiagonal) {
        float area;
        area = (majorDiagonal * minorDiagonal) / 2;
        return area;
    }

}
