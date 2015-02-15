/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author LUWALUWA
 */import javax.swing.JOptionPane;

public class AreaAndPerimeterOfRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane newGUI=new JOptionPane();
        JOptionPane.showMessageDialog(null, "We want to Calculate the Area and Perimeter of a rectangle");
        
        String lenght=newGUI.showInputDialog("Enter the value of the lenght");
        String breath=newGUI.showInputDialog("Enter the value of the breath");
        
        double l=Double.parseDouble(lenght);
        double b=Double.parseDouble(breath);
        
        double area=l*b;
        double perimeter=2*(l+b);
        
        String output="The area of the rectangle is: "+area+"\nThe perimeter of the rectangle is: "+ perimeter;
        JOptionPane.showMessageDialog(null, output);
        
        // TODO code application logic here
    }
    
}
