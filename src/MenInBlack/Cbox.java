/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;
import java.util.ArrayList; 
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class Cbox {
    
    private InfDB idb;
    
    public Cbox(InfDB idb){
    
        this.idb = idb;
    }
   
    //Metod för att lagra utrustningens namn i combobox.
    public void cBoxHamtaUtrustning(JComboBox box){
    
        try{
        //Hämtar namn på alla föremål från utrustning.
        String fraga = "SELECT BENAMNING FROM UTRUSTNING";
        ArrayList<String> utrustning = idb.fetchColumn(fraga);
    
        //Loop som går igenom föremålen i ArrayListen och lägger in de som alternativ i cBoxen.
     for (String sak: utrustning){
        box.addItem(sak);
    
    }
    //Skydd så det inte krashar.
        } catch(InfException fel){
       
        JOptionPane.showMessageDialog(null, "Fel i databasen!");
        System.out.println("Internt felmeddelande " + fel);
          
    
    }
    
    
    }
    
    //Metod för att lägga till områden i cBox.
        public void cBoxHamtaOmrade(JComboBox box){
        //Hämtar namn på områden och lagrar i ArrayList.
            try{
            String fraga = "SELECT BENAMNING FROM OMRADE";
            ArrayList<String> omrade = idb.fetchColumn(fraga);
            //Loop som går igenom ArrayListen och lägger in de i cBoxen.
                for(String plats: omrade){
                    box.addItem(plats);
                
                }
                
            //Skydd så det inte krashar.
            }   catch(InfException fel){
                JOptionPane.showMessageDialog(null, "Fel i databasen!");
                System.out.println("internt meddelandev " + fel);
            
            }
        
        }
    
    
}
