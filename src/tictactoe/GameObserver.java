/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class GameObserver implements Observer{
   private int count=0;
    @Override
    public void update(char[] Array) {
        
        //check x
        if(this.check( Array)==1){
            JOptionPane.showMessageDialog(null,"You have Won The Game");
            Start s= new Start();
           
            s.setVisible(true);
        }
        else if(this.check( Array)==2){
             
            JOptionPane.showMessageDialog(null,"CPU has Won The Game");
             Start s= new Start();
             
             s.setVisible(true);
        }
        else{
        int x=0;
       for(int i=0;i<9;i++){
           if(Array[i]=='X'||Array[i]=='O'){
               x++;
           }
           if(x==9){
                JOptionPane.showMessageDialog(null,"No One Won");
                Start s= new Start();
             
                 s.setVisible(true);
           }
      }

        }
        
        
    }
    private int check(char[]Array){
       
        Check p=new Check(Array);
       // Check For X value=1
        if(p.ReturnVal(1)==1){
            return 1;
        }
            //Check for CPU value=2
             if(p.ReturnVal(2)==2){
            return 2;
        }
         
        //No One Won value=3
        return 3;
    }

}


