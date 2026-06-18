
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosSencillos2 {

    public static void main(String[] args) {
        
        MarcoBotonesColores mimarco=new MarcoBotonesColores();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoBotonesColores extends JFrame{

    public MarcoBotonesColores(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);
        LaminaBotonesColores milamina=new LaminaBotonesColores();
        add(milamina);
    }
}

//La clase LaminaBotonesColores hereda de JPanel y implementa la interfaz ActionListener. Esto significa que esta clase puede actuar como un panel en la interfaz gráfica y también puede manejar eventos de acción, como los clics de botones. Dentro de esta clase, se crea un botón llamado "Botón Azul" y se agrega al panel. Además, se registra el panel como el listener del botón, lo que permite que cuando el botón sea presionado, se ejecute el método actionPerformed. En este método, se cambia el color de fondo del panel a azul cuando se detecta un evento de acción (clic en el botón).
class LaminaBotonesColores extends JPanel{

    JButton botonAzul=new JButton("Botón Azul");
    JButton botonAmarillo=new JButton("Botón Amarillo");
    JButton botonRojo=new JButton("Boton Rojo");

    public LaminaBotonesColores(){

        ColorDeFondo Azul=new ColorDeFondo(Color.BLUE);
        ColorDeFondo Amarillo=new ColorDeFondo(Color.YELLOW);
        ColorDeFondo Rojo=new ColorDeFondo(Color.RED);

        add(botonAzul);
        botonAzul.addActionListener(Azul);

        add(botonAmarillo);
        botonAmarillo.addActionListener(Amarillo);

        add(botonRojo);
        botonRojo.addActionListener(Rojo);
        
    }

    //Creamos una clase interna que recoje la acción de cambio de color, ya que será el color quien recoja la acción del listener
    private class ColorDeFondo implements ActionListener{

        public ColorDeFondo(Color c){

            colorDeFondo=c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            setBackground(colorDeFondo);
        }

        private Color colorDeFondo;

    }
    
}


