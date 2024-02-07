/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;


import java.util.*;

/**
 *
 * @author Lenovo
 */
public class think {
    Start board;
    Shape o=new O();
    display d;
    Position p;
    int pos;
    private char[]Array;
    private int y;
    private int x;
    ClickToAddImage click;
    
    public think(Start board,ClickToAddImage click) {
        this.board = board;
        this.click=click;
        d=new display(board, o);

       
    }
    

    
    
    
    public void disp(){
         int lowerBound = 0;
        int upperBound = 800;

        
        double DoubleX = Math.random();
        double DoubleY=Math.random();
       
        int randomX = (int) (lowerBound + DoubleX * (upperBound - lowerBound + 1));
        int randomY = (int) (lowerBound + DoubleY * (upperBound - lowerBound + 1));
        
        p=new Position(randomX, randomY);
        pos=p.getPosition();
        int i=0; //for infinite loop of while
        while(click.getArray()[pos-1]=='X' ||click.getArray()[pos-1]=='O' &&i<9){
            DoubleX = Math.random();
            DoubleY=Math.random();
             randomX = (int) (lowerBound + DoubleX * (upperBound - lowerBound + 1));
             randomY = (int) (lowerBound + DoubleY * (upperBound - lowerBound + 1));
             p=new Position(randomX, randomY);
            pos=p.getPosition();
            i++;
        }
        
      //  System.out.println(pos);
//        System.out.println(randomX);
//        System.out.println(randomY);

        this.setX(randomX);
        this.setY(randomY);
       
         
    }
    public void setArray(){
        
        this.Array=click.getArray();
        
        this.disp();
        //System.out.println(this.pos);
        
         if(Array[this.pos-1]!='X'&&Array[this.pos-1]!='O'){
            
           
              d.displayImage(o,getX(),getY());
              
                Array[this.pos-1]='O';
                System.out.println(Array);
                
                
                click.setArray(Array);

                }
          
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
