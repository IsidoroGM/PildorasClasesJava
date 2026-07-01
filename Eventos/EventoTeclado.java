import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class EventoTeclado {

    public static void main(String[] args) {

        MiMarcoVentana marcoVentana = new MiMarcoVentana();

        marcoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marcoVentana.addKeyListener(new EventoDeTeclado());

        marcoVentana.setVisible(true);
    }
}

class MiMarcoVentana extends JFrame {

    public MiMarcoVentana() {

        setTitle("eventos de teclado");
        setBounds(300, 300, 600, 300);
    }
}

class EventoDeTeclado implements KeyListener{
    
    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        //System.out.println("Has pulsado la tecla: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        System.out.println("Has pulsado la tecla: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        //System.out.println("Has soltado la tecla: " + e.getKeyChar());
    }
}