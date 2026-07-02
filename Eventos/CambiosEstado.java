import java.awt.event.MouseAdapter;
import javax.swing.JFrame;

public class CambiosEstado {

    public static void main(String[] args) {

        
        MiMarcoVentana marcoVentana = new MiMarcoVentana();

        marcoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marcoVentana.addMouseListener(new EventoDeRaton());

        marcoVentana.setVisible(true);
    }
}

class MiMarcoVentana extends JFrame {

    public MiMarcoVentana() {

        setTitle("Cambios de estado de ventana");
        setBounds(300, 300, 600, 300);
    }
}

class EventoDeRaton extends MouseAdapter {

    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("Has hecho click en la ventana");
    }
    
}