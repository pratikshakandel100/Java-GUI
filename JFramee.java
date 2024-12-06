import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JFrame;
class JFramee{
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to 
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Bank Management System"); // sets title of frame
        frame.setSize(420,420); // set the x-dimension and y-dimension of frame
        frame.setVisible(true); // make frame visible
        frame.setResizable(false); //prevent frame from being resized
        ImageIcon image = new ImageIcon("image.png"); //change icon of frame

        frame.getContentPane().setBackground(new Color(255,0,0)); // change color of backgraund
        


    }
}