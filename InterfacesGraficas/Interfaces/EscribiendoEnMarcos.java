import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class EscribiendoEnMarcos {

    public static void main(String[] args) {
    
    MarcoTexto MiMarco=new MarcoTexto();
    MiMarco.setDefaultCloseOperation(3);

    }
}

// Creamos clase para el JFrame
class MarcoTexto extends JFrame{
    public MarcoTexto(){
            
            setBounds(400,200,600,450);
            setTitle("Escritura");
            setVisible(true);

            // PrimerPanel milamina=new PrimerPanel();
            // add(milamina);

            add(new JPanel(){

                public void paintComponent(Graphics g){

                 //Pero para que el metodo pinte el componente, 
                 //debemos llamar al metodo paintComponent de la clase padre JPanel 
                 // y hara el trabajo que tenga asignado el metodo paintComponent

                setBackground(new Color(39, 245, 242));

                super.paintComponent(g);
                
                // Creamos un color para la letra
                g.setColor(new Color(224, 0, 36));

                g.setFont(new Font("Verdana", Font.ITALIC, 30));

                g.drawString("Hola amigos", 200, 200);
            }
        });    

    }
}    

// Craemos clase para poder escribir en el JFrame
// El tamaño del panel se adapta or defecto al JFrame

// class PrimerPanel extends JPanel{

//     public void paintComponent(Graphics g){

//         //Pero para que el metodo pinte el componente, 
//         //debemos llamar al metodo paintComponent de la clase padre JPanel 
//         // y hara el trabajo que tenga asignado el metodo paintComponent

//         super.paintComponent(g);

//         setBackground(new Color(39, 245, 242));

//         Color miLetraColor=new Color(224, 0, 36);
//         g.setColor(miLetraColor);

//         Font miletra=new Font("Verdana", Font.ITALIC, 30);

//         g.setFont(miletra);
//         g.drawString("Hola amigos", 20, 20);
        
//     }
// }