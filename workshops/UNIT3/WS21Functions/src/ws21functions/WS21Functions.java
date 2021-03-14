/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cookingPower;
        float waterMass;
        float waterSpecificHeat;
        float waterChangeTemperature;
        float temperature;
        float heatExchange;
        float solarConnectorArea;
        float dissipatedEnergy;
        float time;

        System.out.println("---ALESSIO VILLALBA--- \n---RANGE OPERATIONS--- ");

        System.out.println("---COOKING POWER CALCULATION---");

        Scanner data = new Scanner(System.in);
        System.out.print("Enter the water mass -> ");
        waterMass = data.nextFloat();
        data.nextLine();

        System.out.print("Enter the water specific heat -> ");
        waterSpecificHeat = data.nextFloat();
        data.nextLine();

        System.out.print("Enter the change of themperature of the water -> ");
        waterChangeTemperature = data.nextFloat();
        data.nextLine();;

        System.out.print("Enter the temperature -> ");
        temperature = data.nextFloat();
        data.nextLine();

        cookingPower = computeCookingPower(waterMass, waterSpecificHeat, waterChangeTemperature, temperature);
        System.out.println("The cooking power of the range is ->" + cookingPower);

        System.out.println("---HEAT EXCHANGE CALCULATION---");

        System.out.print("Enter the water mass -> ");
        waterMass = data.nextFloat();
        data.nextLine();

        System.out.print("Enter the water specific heat -> ");
        waterSpecificHeat = data.nextFloat();
        data.nextLine();

        System.out.print("Enter the solar connector area -> ");
        solarConnectorArea = data.nextFloat();
        data.nextLine();

        System.out.print("Enter the energy dissipated per unit area -> ");
        dissipatedEnergy = data.nextFloat();
        data.nextLine();

        System.out.print("Enter the time -> ");
        time = data.nextFloat();
        data.nextLine();

        heatExchange = computeHeatExchange(waterMass, waterSpecificHeat, dissipatedEnergy, solarConnectorArea, time);
        System.out.println("The heat exchange of the range between the cooking pot and the fluid is -> " + heatExchange);
        
        System.out.println("Goodbye");

    }

    public static float computeHeatExchange(float waterMass, float waterSpecificHeat, float dissipatedEnergy, float solarConnectorArea, float time) {
        float heatExchange;
        heatExchange = (waterMass * waterSpecificHeat) / (dissipatedEnergy * solarConnectorArea * time);
        return heatExchange;
    }

    public static float computeCookingPower(float waterMass, float waterSpecificHeat, float waterChangeTemperature, float temperature) {
        float cookingPower;
        cookingPower = waterMass * waterSpecificHeat * (waterChangeTemperature / temperature);
        return cookingPower;
    }

}
