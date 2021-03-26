/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortingstrings.controller;

/**
 *
 * @author Alessio
 */
public class Searcher {
       public static int findTeam(String[] teams, String searchTeams) {
       for (int i = 0; i < 6; i++) {
            if (searchTeams.equals(teams[i])) {
                return 1;
            }
        }
    return -1;
    }
}
