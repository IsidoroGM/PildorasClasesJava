
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class EventosVentanaClasesAdaptadoras {

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

//En lugar de implementar WindowListener, heredaremos de la clase WindowAdapter para obtener todos los métodos de WindowListener

//class EventoDeVentana implements WindowListener{

  class EventoDeVentana extends WindowAdapter{

    //Sobreescribimos el único metodo que queremos utilizar

    @Override
    public void windowClosed(WindowEvent e){
        System.out.println("Gracias por trabajar la app.");
    }

    
}