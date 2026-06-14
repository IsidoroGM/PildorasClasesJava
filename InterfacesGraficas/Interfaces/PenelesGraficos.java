import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PenelesGraficos {

    public static void main(String[] args) {

        MarcoGraficos miMarco=new MarcoGraficos();
        miMarco.setDefaultCloseOperation(3);

        
       
        
    }

}

class MarcoGraficos extends JFrame{
    public MarcoGraficos(){

        setBounds(300, 300, 800, 450);

        LaminaGraficos milamina=new LaminaGraficos();
        add(milamina);

        setVisible(true);

    }
}

class LaminaGraficos extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(20,20,125,75);
        g.drawLine(20,20,145,95);
        g.fillRect(20, 200, 125, 75);
    }
    
}
