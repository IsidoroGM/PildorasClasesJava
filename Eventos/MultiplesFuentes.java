
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class MultiplesFuentes {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(() -> {

            MarcoBotonesColores marco = new MarcoBotonesColores();

            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
        });
    }
        
}

class MarcoBotonesColores extends JFrame {

    public MarcoBotonesColores() {

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);
        add(new LaminaFuentes());
    }
}

class LaminaFuentes extends JPanel{

    public LaminaFuentes() {

        EventoColorFondo colorAzul =
                new EventoColorFondo("Azul", Color.BLUE);

        EventoColorFondo colorRojo =
                new EventoColorFondo("Rojo", Color.RED);

        EventoColorFondo colorVerde =
                new EventoColorFondo("Verde", Color.GREEN);

        add(new JButton(colorAzul));
        add(new JButton(colorRojo));
        add(new JButton(colorVerde));

        InputMap mapaEntrada =
                getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        ActionMap mapaAccion = getActionMap();

        mapaEntrada.put(
                KeyStroke.getKeyStroke("ctrl A"),
                "Fondo azul"
        );

        mapaEntrada.put(
                KeyStroke.getKeyStroke("ctrl R"),
                "Fondo rojo"
        );

        mapaEntrada.put(
                KeyStroke.getKeyStroke("ctrl V"),
                "Fondo verde"
        );

        mapaAccion.put("Fondo azul", colorAzul);
        mapaAccion.put("Fondo rojo", colorRojo);
        mapaAccion.put("Fondo verde", colorVerde);
    }    
        private class EventoColorFondo extends AbstractAction{

            public EventoColorFondo(String nombre, Color color_fondo){

                putValue(Action.NAME, nombre);
                putValue("color_fondo_JPanel", color_fondo);
            }

            

            @Override
            public void actionPerformed(ActionEvent e) {

                Color c=(Color)getValue("color_fondo_JPanel");
                setBackground(c);
            }
        
        }
    
}
