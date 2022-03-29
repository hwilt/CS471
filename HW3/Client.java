/**
 * @author: Henry Wilt
 * Class: CS471 HW3
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Client{

    private static String _fileName = "config.txt";

    /**
     * readFile method
     * Reads the file and creates an array of Question objects
     */
    public static ArrayList<String> readFile(String fileName){
        ArrayList<String> config = new ArrayList<String>();
        try{
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                config.add(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("Error reading file");
        }
        return config;
    }

    /**
     * makeOutcomes method
     * Creates an array of Outcome objects
     * @param config ArrayList<String>
     * @return ArrayList<Outcome>
     */
    public static ArrayList<Outcome> makeOutcomes(ArrayList<String> config){
        ArrayList<Outcome> outcomes = new ArrayList<Outcome>();
        for(int i = 0; i < config.size(); i++){
            String[] line = config.get(i).split(",");
            Outcome o = new Outcome(line[0]);
            for(int j = 1; j < line.length; j++){
                String[] metric = line[j].split(" ");
                if(metric[0].equals("Time")){
                    o.addMetric(new Time(metric[1], line[0]));
                } 
                else if(metric[0].equals("Place")){
                    o.addMetric(new Place(Integer.parseInt(metric[1]), line[0]));
                } 
                else if(metric[0].equals("PointsEarned")){
                    o.addMetric(new PointsEarned(Integer.parseInt(metric[1]), line[0]));
                } 
                else if(metric[0].equals("Tries")){
                    o.addMetric(new Tries(Integer.parseInt(metric[1]), line[0]));
                }
                else if(metric[0].equals("Win")){
                    o.addMetric(new Win(Boolean.parseBoolean(metric[1]), line[0]));
                }
            }
            outcomes.add(o);
        }
        return outcomes;
    }

    /**
     * printOutcomes method
     * Prints the outcomes
     * @param outcomes ArrayList<Outcome>
     * @return void
     */
    public static void printOutcomes(ArrayList<Outcome> outcomes){
        for(int i = 0; i < outcomes.size(); i++){
            ArrayList<Metrics> metrics = outcomes.get(i).getMetrics();
            System.out.println(outcomes.get(i));
            for(int j = 0; j < metrics.size(); j++){
                System.out.println(metrics.get(j));
            }
            System.out.println("#");
        }
    }


    public static void main(String[] args){
        ArrayList<String> config = readFile(_fileName);
        ArrayList<Outcome> outcomes = makeOutcomes(config);
        printOutcomes(outcomes);
    }
}