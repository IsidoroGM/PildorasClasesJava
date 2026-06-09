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

public class ClasesInternasAnonimas {

    public static void main(String[] args) {

        Reloj mireloj=new Reloj();
        mireloj.ejecutarTemporizador(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        
    }

}

class Reloj{

    public void ejecutarTemporizador(int intervalo, boolean sonido){


        
        //Vamos a crear una clase INTERNA ANONIMA dentro del constuctor de Timer
        //Esto se hace escribiendo new y directamente la interfaz a la que implementa
        
        Timer miTemporizador= new Timer(intervalo, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
               
                Date ahora=new Date();

                System.out.println("Te pongo la hora cada 3 segundos " + ahora);

                if (sonido) Toolkit.getDefaultToolkit().beep();
            }
        });
        miTemporizador.start();

        
    }
    
}



