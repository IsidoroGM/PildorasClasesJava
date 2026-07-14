
import java.awt.BorderLayout;
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

        PanelConLayoutInferior laminaInferior=new PanelConLayoutInferior();
        PanelConLayoutSuperior laminaSuperior=new PanelConLayoutSuperior();
        add(laminaInferior, BorderLayout.SOUTH);
        add(laminaSuperior, BorderLayout.NORTH);


    }
}

// Panel para la zona superior
class PanelConLayoutSuperior extends JPanel{

    public PanelConLayoutSuperior(){

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        
    }
}

//Panel para la zona inferior
class PanelConLayoutInferior extends JPanel{

    public PanelConLayoutInferior(){

        setLayout(new BorderLayout());
        add(new JButton("Azul"), BorderLayout.CENTER);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Morado"), BorderLayout.WEST);

    }
}

