/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import java.awt.*;
import javax.swing.*;

public class Start extends javax.swing.JFrame{
    private int Height;
    private int Width;
     Generate g;
    
   
    
    public Start(){
        
      
         this.setMinimumSize(new Dimension(800,800));
         this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.CYAN);
            
        
          
        ImagePanel imagePanel = new ImagePanel("Board.png");
        this.setContentPane(imagePanel);
               
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        g=new Generate(this);
    }

    public int getHeight() {
        return 800;
    }

    public int getWidth() {
        return 800;
    }
}