
//Ejercicio de PildorasInformáticas donde deberemos crear 3 ventanas que aparezcan en lugares concretos de la pantalla.

import javax.swing.JFrame;

public class EjercicioVentanas {

    public static void main(String[] args) {
        
        MiVentana Ventana1 = new MiVentana("Ventana1", 300,300,0,0);
        Ventana1.setLocation(0, 0);
        

        MiVentana Ventana2 = new MiVentana("Ventana2",300,300, 200, 200);
        Ventana2.setLocation(200, 200);

        MiVentana Ventana3 = new MiVentana("Ventana3",300,300, 400, 400);
        Ventana3.setLocation(400, 400);
    
        
    }

}

class MiVentana extends JFrame{
    public MiVentana(String titulo, int WIDTH, int HEIGHT, int LWIDTH, int LHEIGHT){

        setDefaultCloseOperation(3);
        setLocation(LWIDTH, LHEIGHT);
        setTitle(titulo);
        setSize(WIDTH, HEIGHT);;
        setVisible(true);
    }

    
}