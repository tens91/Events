/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp;

import java.util.ArrayList;

/**
 *
 * @author aenni
 */
public class EventApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventGUI g = new EventGUI();
        g.setVisible(true);
        g.setResizable(false);
        
        ArrayList<Event> eventList = new ArrayList<Event>();
        
        ArrayList<Event> avivaList = new ArrayList<Event>();
        
        ArrayList<Event> crokeaList = new ArrayList<Event>();
        ArrayList<Event> kingspanList = new ArrayList<Event>();
        ArrayList<Event> thomondList = new ArrayList<Event>();
        
        
        Event e = new Event();
        
    }
    
}
