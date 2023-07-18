/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorialapp;

/**
 *
 * @author judas
 */
public class TutorialSession {
    
    private String mentor;
    private String topic;
    private String subjectCode;
    private short duration;
    private short numOfStudents;
    private boolean repeatedSession;

    public TutorialSession(String mentor, String topic, String subjectCode) {
        this.mentor = mentor;
        this.topic = topic;
        this.subjectCode = subjectCode;
    }

    public TutorialSession(String mentor, String topic, String subjectCode, boolean repeatedSession) {
        this.mentor = mentor;
        this.topic = topic;
        this.subjectCode = subjectCode;
        this.repeatedSession = repeatedSession;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    public void setNumOfStudents(short numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public short getDuration() {
        return duration;
    }

    public short getNumOfStudents() {
        return numOfStudents;
    }

    public boolean isRepeatedSession() {
        return repeatedSession;
    }
    
    public double calculateCost()
    {
     double costOfSesssion = 0.0;
           if(numOfStudents <= 10) 
           {
               costOfSesssion = 12.35;
                 if(numOfStudents > 10 & numOfStudents <= 15)
              {
                costOfSesssion +=50 ; 
              }
           }
          
           else if(numOfStudents > 15)
           {
              costOfSesssion = 250;
           }
           
           if(duration < 60)
           {
               costOfSesssion += 60;
           }
           else if(duration > 60 && duration <= 90)
           {
              costOfSesssion += 100;
           }
           else if(duration > 90)
           {
              costOfSesssion += 125;
           }
           
           if(repeatedSession = true)
           {
             costOfSesssion *= 0.35;
           }
           
     
     
     return costOfSesssion;
        
    }
    
}
