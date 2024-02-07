/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tictactoe;

/**
 *
 * @author Lenovo
 */
public interface Subject {
 
        
    public void Add(Observer x);
    public void Remove(Observer x);
    public void NotifyAllObservers(char [] Array);
}
