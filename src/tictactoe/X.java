/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author Lenovo
 */
public class X implements Shape{

    String name="X.png";
    private int pos;

    public X(int pos) {
        this.pos = pos;
    }
    
    
    @Override
    public String getImage() {
       return this.name;
    }
      
    public int getPos(){
        return this.pos;
    }
    
}
