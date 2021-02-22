/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayquiz;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class ArrayQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {{
        // TODO code application logic here
        System.out.println("---CANDIDATES--- ");
        String[] candidates = {"Arauz", "Perez", "Lasso", "Hervas"};
        for (String candidate : candidates) {
            System.out.println("name of the candidate -> " + candidate);

            float[] percents = {32.57F, 19.74F, 17.38F, 15.91F};
            for (int i = 0; i < percents.length; i++) {
                System.out.println("Percent of candidate number " + (i + 1) + " -> " + percents[i]);

            }

        }
    }
    System.out.println("------------Correction------------");
    int totalOfCandidates = 0;
        String[] candidates;
        float[] votesPercents;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the amount of candidates -> ");
        totalOfCandidates = scanner.nextInt();

        candidates = new String[totalOfCandidates];
        votesPercents = new float[totalOfCandidates];
        
        scanner.nextLine();        
        

        for (int i = 0; i < totalOfCandidates; i++) {
            scanner.nextLine();
            System.out.print("Please enter the name of candidate number " + (i+1) + " ->");
            candidates[i] = scanner.nextLine();            
            System.out.print("Please enter " + candidates[i] + " vote percent ->");
            votesPercents[i] = scanner.nextFloat();
            scanner.nextLine();
        }
            System.out.println("candidate   ->  \t      vote percent ");        

        for (int i = 0; i < totalOfCandidates; i++) {
            System.out.println(candidates[i] + "\t" + votesPercents[i]);
        }

    }


}
