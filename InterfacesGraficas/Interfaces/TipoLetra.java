import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;


public class TipoLetra {

    public static void main(String[] args) {
    
    M2 MiMarco=new M2();
    MiMarco.setDefaultCloseOperation(3);

    }
}

// Creamos clase para el JFrame
class M2 extends JFrame{
    public M2(){
            setBounds(400,200,600,450);
            setTitle("Escritura");

            // Obtener fuentes instaladas localmente
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            String[] misFuentes = ge.getAvailableFontFamilyNames();

            // Pedir al usuario que elija una fuente (selector desplegable)
            String fuenteElegida = (String) JOptionPane.showInputDialog(
                    this,
                    "Elige la fuente para el texto:",
                    "Seleccionar fuente",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    misFuentes,
                    misFuentes.length > 0 ? misFuentes[0] : "Serif");

            // Si el usuario cancela o no selecciona, usar una por defecto
            if (fuenteElegida == null) {
                fuenteElegida = "Serif";
            }

            // Comprobar que la fuente seleccionada está presente recorriendo el array
            boolean letraPresente = false;
            for (String f : misFuentes) {
                if (f.equalsIgnoreCase(fuenteElegida)) {
                    letraPresente = true;
                    fuenteElegida = f; // normalizar nombre exacto
                    break;
                }
            }

            if (!letraPresente) {
                // Si no está presente, avisar y usar Serif
                JOptionPane.showMessageDialog(this, "Fuente no encontrada. Se usará 'Serif'.", "Aviso", JOptionPane.WARNING_MESSAGE);
                fuenteElegida = "Serif";
            }

            final String fuenteParaPanel = fuenteElegida;

            add(new JPanel(){
                public void paintComponent(Graphics g){
                    super.paintComponent(g);
                    Graphics2D g2=(Graphics2D)g;

                    Font miLetra=new Font(fuenteParaPanel, Font.BOLD, 26);
                    g2.setFont(miLetra);
                    g2.setPaint(Color.BLUE);
                    g2.drawString("Hola Mundo", 100, 100);
                }
            });

            setVisible(true);

    }
}   