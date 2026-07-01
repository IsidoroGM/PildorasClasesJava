import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class CambiosEstado {

    public static void main(String[] args) {

        MiMarcoVentana marcoVentana = new MiMarcoVentana();

        marcoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marcoVentana.addWindowStateListener(new EventoDeVentana());

        marcoVentana.setVisible(true);
    }
}

class MiMarcoVentana extends JFrame {

    public MiMarcoVentana() {

        setTitle("Cambios de estado de ventana");
        setBounds(300, 300, 600, 300);
    }
}

class EventoDeVentana implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {

        System.out.println("La ventana ha cambiado de estado");

        System.out.println(e.getNewState());
    }
}