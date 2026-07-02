import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosdeFoco {

    public static void main(String[] args) {

        MarcoFoco marcoFoco=new MarcoFoco();
        marcoFoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFoco.setVisible(true);
        
    }

}

class MarcoFoco extends JFrame{

    public MarcoFoco(){

        setTitle("Eventos de foco");
        setBounds(300,300,600,300);

        add(new Lamina_marco());
    }
}

class Lamina_marco extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        campoTexto1=new JTextField();
        campoTexto1.setBounds(50, 20, 150, 20);
        add(campoTexto1);

        campoTexto2=new JTextField();
        campoTexto2.setBounds(50, 60, 150, 20);
        add(campoTexto2);

        EventosDeFoco foco=new EventosDeFoco();
        campoTexto1.addFocusListener(foco);
    }

    private JTextField campoTexto1, campoTexto2;
    

}

class EventosDeFoco implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'focusGained'");
    }

    @Override
    public void focusLost(FocusEvent e) {
        
        System.out.println("El cuadro 1 ha perdido el foco");
    }
    
}