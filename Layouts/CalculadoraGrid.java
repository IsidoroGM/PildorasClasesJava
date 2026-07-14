
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class CalculadoraGrid {

    public static void main(String[] args) {

        CalculadoraGridFrame Calculadora=new CalculadoraGridFrame();
        Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calculadora.setVisible(true);
        
    }

}

class CalculadoraGridFrame extends JFrame{

    public CalculadoraGridFrame(){

        setTitle("Calculadora");
        setBounds(500, 500, 400, 600);

        PanelCalculadora panelCalculadora=new PanelCalculadora();
        add(panelCalculadora);
    }
}

class PanelCalculadora extends JPanel{

    public PanelCalculadora(){

        setLayout(new BorderLayout());

        JButton pantalla=new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        JPanel numeracion=new JPanel();
        numeracion.setLayout(new GridLayout(4, 4));
        

    }
}


