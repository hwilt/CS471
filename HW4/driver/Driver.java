/**
 * @author: Henry Wilt
 * @class: CS471
 * @assignment: HW4
 */

package driver;

import builder.*;
import metrics.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class Driver {

    private static String _fileName = "driver/config.txt";



    public static void Contest(ArrayList<String> config){
        OutcomeBuilder obC = BuilderFactory.getOutcomeBuilder(OutcomeBuilder.CONTEST, config);

        if (obC != null) {
            OutcomeDirector od = new OutcomeDirector(obC);
            od.build();
            Outcome contest = obC.getOutcome();
            System.out.println(contest);
        } else {
            System.out.println("Unrecognized Outcome.");
        }
    }
    
    public static void Match(ArrayList<String> config){
        OutcomeBuilder obM = BuilderFactory.getOutcomeBuilder(OutcomeBuilder.MATCH, config);

        if (obM != null) {
            OutcomeDirector od = new OutcomeDirector(obM);
            od.build();
            Outcome match = obM.getOutcome();
            System.out.println(match);
        } else {
            System.out.println("Unrecognized Outcome.");
        }
    }

    public static void SpeedRace(ArrayList<String> config){
        OutcomeBuilder obSR = BuilderFactory.getOutcomeBuilder(OutcomeBuilder.SPEED_RACE, config);

        if (obSR != null) {
            OutcomeDirector od = new OutcomeDirector(obSR);
            od.build();
            Outcome speedRace = obSR.getOutcome();
            System.out.println(speedRace);
        } else {
            System.out.println("Unrecognized Outcome.");
        }
    }

    public static void Tournament(ArrayList<String> config){
        OutcomeBuilder obT = BuilderFactory.getOutcomeBuilder(OutcomeBuilder.TOURNAMENT, config);

        if (obT != null) {
            OutcomeDirector od = new OutcomeDirector(obT);
            od.build();
            Outcome tournament = obT.getOutcome();
            System.out.println(tournament);
        } else {
            System.out.println("Unrecognized Outcome.");
        }
    }
    


    public static void main(String[] args) {

        ArrayList<String> config = new ArrayList<String>();
        try{
            File file = new File(_fileName);
            Scanner sc = new Scanner(file);
            boolean firstLine = true;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if (!line.contains("#")) {
                    if (firstLine){
                        firstLine = false;
                        config.add(line);
                    } else {
                        String[] lineSplit = line.split(";");
                        config.add(lineSplit[1]);
                    }
                    //System.out.println(line);    
                }
                else{
                    String[] type = config.get(0).split(";");
                    if (type[0].equals("Contest")){
                        Contest(config);
                    }
                    else if (type[0].equals("Match")){
                        Match(config);
                    }
                    else if (type[0].equals("SpeedRace")){
                        SpeedRace(config);
                    }
                    else if (type[0].equals("Tournament")){
                        Tournament(config);
                    }
                    config = new ArrayList<String>();
                    firstLine = true;
                }
                
            }
        } catch(FileNotFoundException e){
            System.out.println("Error reading file, may be a bad file name or corrupted file. " + e);
        }
    }
}