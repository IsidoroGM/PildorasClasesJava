
import javax.swing.JOptionPane;

public class whileb {

    public static void main(String[] args) {
        
        String clave="Isi";

        String acceso="";


        //Si la condicion es TRUE el bucle se repite
        while (!clave.equals(acceso)) {
            
            acceso=JOptionPane.showInputDialog("Introduce tu clave: ");

           // System.out.println("Clave erronea.");

           if(!clave.equals(acceso)){

            System.out.println("la clave es incorrecta");

           }
            
        }

        System.out.println("Bienvenido a la zona de usuario.");

    }
    
}
