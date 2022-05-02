/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignment;

import Vessel.*;

/**
 *
 * @author avecaschilling
 */
public class FinalAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     /* instantiates the following flask objects and can objects
     */
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(9, 3, 17, 4);
        ErlenmeyerFlask eF2 = new ErlenmeyerFlask(13, 4, 19, 2);
        ErlenmeyerFlask eF3 = new ErlenmeyerFlask(5, 2, 10, 1);
        
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        SodaCan sc2 = new SodaCan(11.1, 1.7);
        SodaCan sc3 = new SodaCan(17.5, 3.25); 
        
    /**
     * calls toString method to print out member data for each object
     */   
        System.out.println("This flask has: \n" + eF1 + "\n");
        System.out.println("This flask has: \n" + eF2 + "\n");
        System.out.println("This flask has: \n" + eF3 + "\n");
        
        System.out.println("This can has: \n" + sc1 + "\n");
        System.out.println("This can has: \n" + sc2 + "\n");
        System.out.println("This can has: \n" + sc3 + "\n");
    }
    
}
