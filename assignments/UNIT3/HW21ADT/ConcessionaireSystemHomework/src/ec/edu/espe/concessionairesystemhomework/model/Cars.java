/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concessionairesystemhomework.model;

/**
 *
 * @author Alessio
 */
public class Cars {

    private String company;
    private String model;
    private int motorPower;
    private int topSpeed;
    private boolean onSale;

    public Cars(String company, String model, int motorPower, int topSpeed, boolean onSale) {
        this.company = company;
        this.model = model;
        this.motorPower = motorPower;
        this.topSpeed = topSpeed;
        this.onSale = onSale;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the motorPower
     */
    public int getMotorPower() {
        return motorPower;
    }

    /**
     * @param motorPower the motorPower to set
     */
    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    /**
     * @return the topSpeed
     */
    public int getTopSpeed() {
        return topSpeed;
    }

    /**
     * @param topSpeed the topSpeed to set
     */
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * @return the onSale
     */
    public boolean isOnSale() {
        return onSale;
    }

    /**
     * @param onSale the onSale to set
     */
    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

}
