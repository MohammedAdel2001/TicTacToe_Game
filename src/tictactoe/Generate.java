/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Generate {
    Start s;
    private int i=1;
    ClickToAddImage click;
    think frame;
    

 

    public Generate(Start s) {
        this.s = s;
        
       
  
       click=new ClickToAddImage(s);
       
      
       frame = new think(s,click);

        
       }

}
    
   
    

