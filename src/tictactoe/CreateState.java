
package tictactoe;


public class CreateState {
    private int Pos;
    private char[]Array;
    PositionState s;
    public CreateState( char[] Array) {
       
        this.Array = Array;
    }
    public int CheckState() {
        return s.CheckState();
    }
    
    public int SetPos(int pos){
        
        if(Array[pos]=='X'){
            s=new Xstate();
            return s.CheckState();
        }
        if(Array[pos]=='O'){
            s=new Ostate();
            return s.CheckState();
        }
        if(Array[pos]!='O'&&Array[pos]!='X'){
            s=new EmptyState();
            return s.CheckState();
        }
       return 0;
    }
    
    
}
