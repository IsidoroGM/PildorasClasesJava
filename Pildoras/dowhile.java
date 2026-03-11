
import javax.swing.JOptionPane;

public class dowhile {

    public static void main(String[] args) {
        
    JOptionPane.showMessageDialog(null, """
                                        Este programa cuenta caracteres 
                                        Para finalizar escribe 'salir' """);

    String texto="";


    //el bucle DO-WHILE se ejecuta como WHILE, pero la condición se expresa al final, permitiendo
    //inciar el cçodigo al menos una vez.
    do { 
        
        texto=JOptionPane.showInputDialog("Introduce el texto.");

        JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length() + " caracteres");
    }while(!texto.equals("salir"));

    System.out.println("Has salido del programa");
    }
    
}
