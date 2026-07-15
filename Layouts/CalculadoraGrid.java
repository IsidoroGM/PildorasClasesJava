
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private final JPanel numeracion;
    private final JTextField pantalla;
    private boolean comienzo;

    //Variables de lógica de cálculo
    private String ultimaOperacion="";
    private double resultado;
    private double ultimoValor;
    

    public PanelCalculadora(){

        setLayout(new BorderLayout());

        comienzo=true;
        pantalla=new JTextField("0");
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);

        add(pantalla, BorderLayout.NORTH);
        
        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4, 4, 4, 5));
        

        InsertarNumero insertar=new InsertarNumero();
        Operacion realizarOperacion=new Operacion();

        declararBoton("7",insertar);
        declararBoton("8",insertar);
        declararBoton("9",insertar);

        declararBotonOperacion("x",realizarOperacion);

        declararBoton("4",insertar);
        declararBoton("5",insertar);
        declararBoton("6",insertar);

        declararBotonOperacion("-",realizarOperacion);

        declararBoton("1",insertar);
        declararBoton("2",insertar);
        declararBoton("3",insertar);

        declararBotonOperacion("+",realizarOperacion);

        declararBoton("0",insertar);

        declararBotonOperacion(",",realizarOperacion);
        declararBotonOperacion("=",realizarOperacion);
        declararBotonOperacion("/",realizarOperacion);

        add(numeracion, BorderLayout.CENTER);
        
    }

    //Método para valores numéricos
    private void declararBoton(String textoBoton, InsertarNumero oyente){

        JButton boton=new JButton(textoBoton);

        boton.addActionListener(oyente);

        numeracion.add(boton);
    }

    //Método para operaciones
    private void declararBotonOperacion(String textoBoton, Operacion oyente){

        JButton boton=new JButton(textoBoton);

        boton.addActionListener(oyente);

        numeracion.add(boton);
    }

    private class InsertarNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String  entrada=e.getActionCommand();

            if(comienzo){
                pantalla.setText(entrada);
                comienzo=false;
            } else{
                pantalla.setText(pantalla.getText()+entrada);
            }

            ultimoValor=Double.parseDouble(pantalla.getText());

        }
    }

    private class Operacion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String operacionPulsada=e.getActionCommand();
            resultado+=ultimoValor;
            pantalla.setText("");
            comienzo=true;
            

        }

    }
}





