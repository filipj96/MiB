/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ifkli
 */
public class Start {
    
    private static InfDB idb;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testa ifall DB går att nås.
        try {
            String aktuellMap = System.getProperty("user.dir");
            
            String sokVag = aktuellMap + ("\\db\\MIBDB.FDB");

        idb = new InfDB(sokVag);
        new InloggningSida(idb).setVisible(true);
        //om inte, kör:
        }
        catch(InfException undantag){
        JOptionPane.showMessageDialog(null, "Kunde inte koppla till databasen!");
        System.out.println("Internt felmeddelade" + undantag.getMessage());
        
        }
        
    }
    
}




