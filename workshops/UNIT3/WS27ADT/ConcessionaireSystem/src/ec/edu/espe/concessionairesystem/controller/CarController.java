/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concessionairesystem.controller;

import ec.edu.espe.concessionairesystem.model.Car;
import utils.FileManager;

/**
 *
 * @author Alessio
 */
public class CarController {
    
    public void save(Car car){
        String data = car.getCompany() + " , " + car.getModel()+ "," + car.getMotorPower()+ "," + car.getTopSpeed()+ "," + car.isOnSale();
        FileManager.save(data, "car");
        
    }
    
}
