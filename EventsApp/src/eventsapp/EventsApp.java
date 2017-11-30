/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsapp;

/**
 *
 * @author x16102584
 */
public class EventsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventsGUI myGUI = new EventsGUI();
        myGUI.setVisible(true);
        
        
        //variables
        
        String date = "";
        String who = "";
        
            //arrays
            String venues[] = new String[4];
            venues[0]="Croke Park";
            venues[1]="Aviva Stadium";
            venues[2]="Thomond Park";
            venues[3]="Kingspan Stadium";
            
            String types[] = new String[5];
            types[0]="concert";
            types[1]="soccer match";
            types[2]="rugby match";
            types[3]="gaa match";
            types[4]="other";
        
        
        
        
    }
    
}
