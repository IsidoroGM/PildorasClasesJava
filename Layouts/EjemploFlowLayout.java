
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class EjemploFlowLayout {

    public static void main(String[] args) {

        MarcoConLayout miMarco=new MarcoConLayout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
        
    }
}

class MarcoConLayout extends JFrame{

    public MarcoConLayout(){ 
    
        setTitle("Disposiciones");
        setBounds(600, 350, 600, 300);

        PanelConLayout lamina=new PanelConLayout();
        add(lamina);


    }
}

class PanelConLayout extends JPanel{

    public PanelConLayout(){

        setLayout(new java.awt.FlowLayout(FlowLayout.CENTER, 50, 100));
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));

        
    }
}
