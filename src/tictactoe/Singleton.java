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
public class Singleton {
    
    private static Singleton single=null;
    
    
    private Singleton(){
        
    }
    
    public static Singleton getInst(){
        if(single==null){
            single=new Singleton();
        }
        return single; 
    }
    
    

       public boolean check(int pos,char[] Array,ClickToAddImage c){
            
            if(Array[pos-1]!='X'&&Array[pos-1]!='O'){
                Array[pos-1]='X';
                c.setArray(Array);
                System.out.println(Array);
                return true;
            }
            else{
                return false;
            }
       }
    }
    
    

