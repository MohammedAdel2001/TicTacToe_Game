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
public class ValidObservable implements Subject{

     private ArrayList<Observer>gameEngine;
     private String s;

    public ValidObservable() {
        
        gameEngine=new ArrayList<>();
    }
     
     
    @Override
    public void Add(Observer x) {
        gameEngine.add(x);
    }
       

    @Override
    public void Remove(Observer x) {
        gameEngine.remove(x);
    }
        

    @Override
    public void NotifyAllObservers(char [] Array) {
        for(Observer x :gameEngine){
            x.update(Array);
        }
    }
    
    public void GiveArray(char[] Array){
        this.NotifyAllObservers(Array);
    }
        
}
