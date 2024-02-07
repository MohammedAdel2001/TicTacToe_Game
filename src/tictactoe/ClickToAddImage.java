/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JLabel;

 
public class ClickToAddImage extends MouseAdapter {
    private Start s;
    private int Xaxis;
    private int Yaxis;
    private int x;
    private int y;
   private think frame;
   private X xshape;
    
    private char[] Array = new char[9];
    private ArrayList<Shape> shape=new ArrayList<>();
    private Singleton single=Singleton.getInst();
    
    
    public ClickToAddImage(Start s) {
        this.s = s;
         s.addMouseListener(this);
        frame=new think(s,this);
        
        
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Load and display an image
        this.Xaxis=e.getX();
        this.Yaxis=e.getY();
        
       
        
      // this.setArray(Array);
        
       
        
        this.setX(e.getX());
        this.setY(e.getY());
        
        if(single.check(this.GetPos(),this.getArray(),this)){
        shape.add(xshape);
        displayImage(this.getX(), this.getY());
       
        frame.setArray();
         ValidObservable v=new ValidObservable();
                GameObserver game=new GameObserver();
                v.Add(game);
                v.GiveArray(Array);
        s.repaint();
         
    }
        
    }
    
   public ArrayList<Shape> ReturnArray(){
       return this.shape;
   }

    public char[] getArray() {
        return Array;
    }

    public void setArray(char[] Array) {
        this.Array =  Array;
    }
    
    

    private void displayImage(int x, int y) {
       
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("X.png"));
        JLabel imageLabel = new JLabel(imageIcon);

       
        imageLabel.setBounds(x, y, imageIcon.getIconWidth(), imageIcon.getIconHeight());

        
        s.add(imageLabel);

       
        s.repaint();
    }
    
    public int GetPos(){
        Position p=new Position(this.getXaxis(), this.getYaxis());
        return p.getPosition();
    }
    
    public int getXaxis(){
        return this.Xaxis;
    }
     public int getYaxis(){
        return this.Yaxis;
    }
     
     public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y>=0&&y<267){
            this.y=0;
        }
        else if(y>=267&&y<534){
            this.y=267;
        }
        else if(y>=534&&y<800){
            this.y=534;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
           if(x>=0&&x<267){
            this.x=0;
        }
        else if(x>=267&&x<534){
            this.x=267;
        }
        else if(x>=534&&x<800){
            this.x=534;
        }
    }
    
   
     
     
}

    
    
    
    
    
    
    
