/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenInBlack;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ifkli
 */
public class Validering {
    //Validering för att se så inget av textfälten är tomma.
    public static boolean tomtTextfalt(JTextField textRuta)
    {
        boolean resultat = true;        
        if(textRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i textrutorna!");
            textRuta.requestFocus();
            resultat = false;
        }       
        return resultat;
    }
    //Validering för att kolla om textfältet har ett heltal.
    public static boolean kollaHeltal(JTextField textRuta) {
        
        boolean resultat = true;        
        try {
            String strang = textRuta.getText();
            Integer.parseInt(strang);
            textRuta.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }
        return resultat;
    }
    
    //I princip samma kod som kolla heltal, denna validering har dock annat felmeddelande vilket passar bättre där ID ska ifyllas.
    public static boolean kollaID(JTextField ruta){

    boolean resultat = true;
        
        try{
        
            String ID = ruta.getText();
            Integer.parseInt(ID);
            ruta.requestFocus();
        
        }   catch(NumberFormatException f){
        
                JOptionPane.showMessageDialog(null, "Var god fyll i giltigt ID");
                resultat = false;
        }

return resultat;

}
    
    
    //I princip samma kod som "tomtTextfalt", denna kan dock användas då endast en textruta finns.
    public static boolean kollaEnskildTf(JTextField ruta){
    
        boolean resultat = true;
            //kollar om textrutan är tom.
            if(ruta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Vänligen fyll i textrutan!");
            ruta.requestFocus();
            resultat = false;
            
            }
        
        return resultat;
    }
    
    
}
