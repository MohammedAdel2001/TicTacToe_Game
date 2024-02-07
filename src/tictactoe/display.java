
package tictactoe;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class display {
     private Start s;
    private int Xaxis;
    private int Yaxis;
    Shape shape;
     public display(Start s,Shape shape) {
        this.s = s;
        this.shape=shape;
       
    }
      public void displayImage(Shape shape, int x, int y) {
          
          s.setLayout(null);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("O.png"));
        JLabel imageLabel = new JLabel(imageIcon);

        
        imageLabel.setBounds(x, y, imageIcon.getIconWidth(), imageIcon.getIconHeight());

        s.add(imageLabel);

        
        s.repaint();
        
    }
      
    public int getXaxis(){
        return this.Xaxis;
    }
     public int getYaxis(){
        return this.Yaxis;
    }

}
