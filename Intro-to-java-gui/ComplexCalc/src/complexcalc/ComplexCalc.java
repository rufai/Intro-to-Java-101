/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexcalc;

/**
 *
 * @author LUWALUWA
 */ import javax.swing.JOptionPane;
public class ComplexCalc {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        JOptionPane GUI=new JOptionPane();
        
        GUI.showMessageDialog(null, "We want to calculate the value of Electric Field");
        
        String charge=GUI.showInputDialog("Enter the value of Charge");
        String distance=GUI.showInputDialog("Enter the value of distance");
        
        double q=Double.parseDouble(charge);
        double z=Double.parseDouble(distance);
        
        double E=(3*q)/(4*Math.PI*(8.85e-12)*Math.pow(z, 4));
        
       String output="The value of the Electric Field is: "+E;
       GUI.showMessageDialog(null,output);
       
        
        
        
        
        
        
        
     
        
        // TODO code application logic here
    }
    
}
