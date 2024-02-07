/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

/**
 *
 * @author Lenovo
 */
public class Check {
    private char[]Array;

    public Check(char[] Array) {
        this.Array = Array;
    }
    
     
     public int ReturnVal(int i){
     CreateState state=new CreateState(Array);    
     
          if((state.SetPos(0)==i&&state.SetPos(1)==i&&state.SetPos(2)==i)||(state.SetPos(3)==i&&state.SetPos(4)==i&&state.SetPos(5)==i)||
             (state.SetPos(6)==i&&state.SetPos(7)==i&&state.SetPos(8)==i)||(state.SetPos(0)==i&&state.SetPos(3)==i&&state.SetPos(6)==i)||
                (state.SetPos(1)==i&&state.SetPos(4)==i&&state.SetPos(7)==i)||(state.SetPos(2)==i&&state.SetPos(5)==i&&state.SetPos(8)==i)||
                (state.SetPos(0)==i&&state.SetPos(4)==i&&state.SetPos(8)==i )||(state.SetPos(6)==i&&state.SetPos(4)==i&&state.SetPos(2)==i)){
            return i;
     }
     return 3;
}
}
