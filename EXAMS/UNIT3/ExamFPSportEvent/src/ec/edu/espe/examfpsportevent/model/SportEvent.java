/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.examfpsportevent.model;

/**
 *
 * @author Alessio
 */
public class SportEvent {
    
    private String event;
    private String sport;
    private String stage;
    private int spectators;
    private int foundationYear;
    
    public SportEvent(String event, String sport, String stage, int spectators, int foundationYear) {
        
        this.event = event;
        this.sport = sport;
        this.stage = stage;
        this.spectators = spectators;
        this.foundationYear = foundationYear;
    }
    /**
     * @return the event
     */
    public String getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return the sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport (String sport) {
        this.sport = sport;
    }

    /**
     * @return the stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * @return the stage
     */
    public int getSpectators() {
        return spectators;
    }

    /**
     * @param spectators the topSpeed to set
     */
    public void setSpectators(int spectators) {
        this.spectators = spectators;
    }

    /**
     * @return the onSale
     */
    public int getFoundationYear() {
        return foundationYear;
    }

    /**
     * @param foundationYear the onSale to set
     */
    public int setFoundationYear(int foundationYear) {
        return foundationYear;
    }

}

    

