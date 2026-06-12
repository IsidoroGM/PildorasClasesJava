import java.util.Set;

import javax.swing.JFrame;

public class PrimerJFrame {

    public static void main(String[] args) {
        
        MiVentana miVentana=new MiVentana();

        miVentana.setDefaultCloseOperation(3);

    }

    static class MiVentana extends JFrame{
        public MiVentana() {
            setTitle("Hola Beita");

            //setSize(600,300);
            //setDefaultCloseOperation(3);
            //setLocation(300, 300);
            //setLocationRelativeTo(null); //Nos despliega la ventana en el centro con null
            //setBounds(600, 350, 600, 300);

            setExtendedState(6);

            setResizable(true);
            setVisible(true);
            
            
        }
    }
}

