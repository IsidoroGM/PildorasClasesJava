
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class EventosVentana {

    public static void main(String[] args) {

        MiMarcoVentana marcoVentana=new MiMarcoVentana();
        marcoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marcoVentana.addWindowListener(new EventoDeVentana());

        marcoVentana.setVisible(true);
            
        
        
    }

}

class MiMarcoVentana extends JFrame{

    public MiMarcoVentana(){

        setBounds(300,300,600,300);
    

    }
}

class EventoDeVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}