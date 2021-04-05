/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concessionairesystemhomework.controller;

import ec.edu.espe.concessionairesystemhomework.model.Cars;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author Alessio
 */
public class CarControllerHW {

    public void save(Cars car) {
     public void save(Cars car) {   Cars[] cars = new Cars[FileManager.countLines("cars")];
        String[] rows = new String[FileManager.countLines("cars")];
        read(rows, cars);
        if (find(cars, car.getCompany()) != -1) {
            JOptionPane.showMessageDialog(null, "car -> " + car.getCompany() + " <- already exists", "USE OTHER NAME", JOptionPane.CANCEL_OPTION);
            return;
        } else {
            String data = car.getCompany() + "," + car.getModel() + "," + car.getMotorPower() + "," + car.getTopSpeed() + "," + car.isOnSale();
            FileManager.save(data, "cars");
        }
    }

    public void read(String[] data, Cars[] cars) {

        FileManager.readLines("cars", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForCar = data[i].split(",");

            //building an object with the splitted data
            String company = dataForCar[0];
            String model = dataForCar[1];
            int motorPower = Integer.parseInt(dataForCar[2]);
            int topSpeed = Integer.parseInt(dataForCar[3]);
            boolean isOnSale = Boolean.parseBoolean(dataForCar[4]);

            cars[i] = new Cars(company, model, motorPower, topSpeed, isOnSale);

        }
    }

    public int find(Cars[] cars, String name) {
        for (int i = 0; i < cars.length; i++) {
            if (name.equals(cars[i].getCompany())) {
                return i;
            }
        }
        return -1;
    }

    public void populateChickensTable(JTable jTable, Cars[] cars) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[cars.length];
        for (int i = 0; i < cars.length; i++) {
            rowData[0] = cars[i].getCompany();
            rowData[1] = cars[i].getModel();
            rowData[2] = cars[i].getMotorPower();
            rowData[3] = cars[i].getTopSpeed();
            rowData[4] = cars[i].isOnSale();
            model.addRow(rowData);
        }

    }

}
