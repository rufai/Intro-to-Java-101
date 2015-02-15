/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author LUWALUWA
 */import javax.swing.JOptionPane;
public class AreaOfTriangleGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane newGUI=new JOptionPane();
        
        JOptionPane.showMessageDialog(null, "We want to calculate the area of a rectangle");
        
        String base = newGUI.showInputDialog("Enter the base");
        String height=newGUI.showInputDialog("Enter the height");
        
        double b= Double.parseDouble(base);
        double h= Double.parseDouble(height);
        
        double area=  (0.5)*b*h;
        
        String output="The area of your triangle is: "+area;
        
        JOptionPane.showMessageDialog(null, output);
        
        // TODO code application logic here
    }
    
}
