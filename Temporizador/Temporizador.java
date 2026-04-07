// Creación de una aplicación de prueba de tipo temporizador
// Objetivo: Aprender sobre la "eventListener" e interfaces.


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Temporizador {

    public static void main(String[] args) {
        
        // Constructor de la clase ActionListener para darle un objeto de tipo temporizador para la clase miTemporizador.
        // Se lo pasamos al timer como segundo parametro
        TemporizadorOyente oyente=new TemporizadorOyente();

        //Constructor del temporizador de la clase Timer
        Timer miTemporizador=new Timer(1000, oyente);


        // De dejarlo aqui, la ejecución terminaría y no imprimiría nada.
        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");



    }

}

// Creamos otra clase para implementar la interfaz ActionListener

class TemporizadorOyente implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Hola mundo");
    }

}
