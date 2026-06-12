import java.awt.Image;
import java.awt.Toolkit;
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
            setBounds(600, 350, 600, 300);

            //setExtendedState(6);

            //Vamos a aprender a incorporar una imagen al icono de la ventana
            Toolkit miSistema=Toolkit.getDefaultToolkit();

            //Variable de tipo Imagen donde almacenaremos la imagen
            Image miIcono=miSistema.getImage("C:\\Users\\Is y Doro\\Desktop\\CodigoPildorasInformaticas\\PildorasClasesJava\\InterfacesGraficas\\EjercicioVentanas\\imagen\\dadoss.png"); 

            //Establecemos el icono con el metodo SetIconImagen y aportandole la variable miIcono
            setIconImage(miIcono);

            setResizable(true);
            setVisible(true);
            
            
        }
    }
}

