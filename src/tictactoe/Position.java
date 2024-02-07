/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author Lenovo
 */
public class Position {
    private int x;
    private int y;
    private int pos;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getPosition(){
        //pos1
        if ((x>=0&&x<267)&&(y>=0&&y<267) ){
            pos=1;
            return pos; 
        }
        //pos2
        else if ((x>=267&&x<534)&&(y>=0&&y<267) ){
            pos=2;
            return pos; 
        }
         //pos3
        else if ((x>=534&&x<800)&&(y>=0&&y<267) ){
            pos=3;
            return pos; 
        }
         //pos4
         else if ((x>=0&&x<267)&&(y>=267&&y<534) ){
            pos=4;
            return pos; 
        }
          //pos5
          else if ((x>=267&&x<534)&&(y>=267&&y<534) ){
            pos=5;
            return pos; 
        }
           //pos6
          else if ((x>=534&&x<800)&&(y>=267&&y<534) ){
            pos=6;
            return pos; 
        }
               //pos7
         else if ((x>=0&&x<267)&&(y>=534&&y<800) ){
            pos=7;
            return pos; 
        }
          //pos8
          else if ((x>=267&&x<534)&&(y>=534&&y<800) ){
            pos=8;
            return pos; 
        }
           //pos9
           else if ((x>=534&&x<800)&&(y>=534&&y<800) ){
            pos=9;
            return pos; 
        }
            
        
      else return 0; 
         
        
        
        
    }
    
    
}
