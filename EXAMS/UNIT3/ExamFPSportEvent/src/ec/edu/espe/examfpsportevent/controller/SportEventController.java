/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.examfpsportevent.controller;

import ec.edu.espe.examfpsportevent.model.SportEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author Alessio
 */
public class SportEventController {

    public void save(SportEvent sportEvent) {
        SportEvent[] sportEvents = new SportEvent[FileManager.countLines("sport events")];
        String[] rows = new String[FileManager.countLines("sport events")];
        read(rows, sportEvents);
        if (find(sportEvents, sportEvent.getEvent()) != -1) {
            JOptionPane.showMessageDialog(null, "car -> " + sportEvent.getEvent() + " <- already exists", "USE OTHER NAME", JOptionPane.CANCEL_OPTION);
            return;
        } else {
            String data = sportEvent.getEvent() + "," + sportEvent.getSport() + "," + sportEvent.getStage() + "," + sportEvent.getFoundationYear() + "," + sportEvent.getSpectators();
            FileManager.save(data, "cars");
        }
    }

    public void read(String[] data, SportEvent[] sportEvent) {

        FileManager.readLines("cars", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForEvent = data[i].split(",");

            //building an object with the splitted data
            String event = dataForEvent[0];
            String sport = dataForEvent[1];
            String stage = dataForEvent[2];
            int spectators = Integer.parseInt(dataForEvent[3]);
            int foundationYear = Integer.parseInt(dataForEvent[4]);

            sportEvent[i] = new SportEvent(event, sport, stage, spectators, foundationYear);

        }
    }

    public int find(SportEvent[] sportEvent, String name) {
        for (int i = 0; i < sportEvent.length; i++) {
            if (name.equals(sportEvent[i].getEvent())) {
                return i;
            }
        }
        return -1;
    }


}
