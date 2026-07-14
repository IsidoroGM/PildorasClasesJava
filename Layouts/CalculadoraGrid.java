
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



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

    private JPanel numeracion;

    public PanelCalculadora(){

        setLayout(new BorderLayout());

        JTextField pantalla=new JTextField("0");
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);

        add(pantalla, BorderLayout.NORTH);
        
        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4, 4, 4, 5));
        
        declararBoton("7");
        declararBoton("8");
        declararBoton("9");
        declararBoton("x");
        declararBoton("4");
        declararBoton("5");
        declararBoton("6");
        declararBoton("-");
        declararBoton("1");
        declararBoton("2");
        declararBoton("3");
        declararBoton("+");
        declararBoton("0");
        declararBoton(",");
        declararBoton("=");
        declararBoton("");

        add(numeracion, BorderLayout.CENTER);
        
    }

    private void declararBoton(String textoBoton){

        JButton boton=new JButton(textoBoton);

        numeracion.add(boton);
    }


}



