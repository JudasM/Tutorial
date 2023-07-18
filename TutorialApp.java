/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorialapp;

import java.util.Random;

/**
 *
 * @author judas
 */
public class TutorialApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TutorialSession tutorialSession = new TutorialSession("Judas", "Programming", "OOP216D");
        
        short duration = (short)(Math.random()* (100- 40 + 1) + 40);
         tutorialSession.setDuration(duration);
         
        short students= (short)(Math.random() * (20 - 5 +1) +5 );
        tutorialSession.setNumOfStudents(students);
        
        Random repating = new Random();
        
        double cost = tutorialSession.calculateCost();
        
        
        String message = "The number of student(s) are/is " + tutorialSession.getNumOfStudents()
                       +"\n" + "The duration of the session is " +tutorialSession.getDuration()
                       +"\n" +  "the cost is " +cost +"\n" + "repeating or not.? "+repating.nextBoolean();
       
        System.out.println(message);
        
        
    }
    
}
