
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


//Estudiaremos las clases internas, que son clases que se definen dentro de otra clase.

/*
CLASES INTERNAS
 *Para acceder a los campos privados de una clase dentro de otra
 *Para ocultar una clase de las pertenecientes al mismo paquete
 *Oara crear ckases internas "anonimas", muy útiles para gestionar eventos y retrollamadas
 *Cuando solo una clase debe acceder a los campos de ejemplar de otra clase
 */

 // Para realizar el ejemplo, volveremos a realizar un temporizador.

public class ClasesInternas {

    public static void main(String[] args) {

        Reloj mireloj=new Reloj();
        mireloj.ejecutarTemporizador(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        
    }

}

class Reloj{

    public void ejecutarTemporizador(int intervalo, boolean sonido){


        // Clase interna Local, dentro del método ejectuarTemporizador()
        class DameLaHora implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            Date ahora=new Date();

            System.out.println("Te pongo la hora cada 3 segundos" + ahora);

            if (sonido) Toolkit.getDefaultToolkit().beep();
        }

    }
        ActionListener oyente=new DameLaHora();

        Timer miTemporizador= new Timer(intervalo,oyente);
        miTemporizador.start();

        
    }

    // //Campo que realiza el conteo temporal.
    // private int intervalo;

    // //Campo que recoge el sonido.
    // private boolean sonido;

    //CLASE INTERNA
    //Solo puede aplicarse el modificador PRIVATE a una clase cuando es clase interna
    
}


