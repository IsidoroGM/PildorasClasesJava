


//En este ejercicio debemos crear una clase que genere contraseñas aleatorias compuestas por letras mayúsculas, minúsculas y números.
// Dichas contraseñas serán de la longitud que quiera el usuario y dicha longitud se le pedirá por teclado desde una ventana JOptionPane. 
// Las contraseñas se almacenarán en un Array cuyo tamaño también se le pedirá al usuario por teclado a través de una ventana JOptionPane.

//Debe tener constructor
        //Dos metodos getter. uno devuelve la contraseña y el otro la longitud
        // un metodo encargado de generar (construir la contraseña)
        //un metodo que evalue y devuelva la contraseña si es segura o debil en funcion de las condiciones antes descritas

import java.util.Random;

public class Ejercicio_password {
    public static void main(String[] args) {
        int longitud = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce la longitud de la contraseña:"));
        int cantidad = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce la cantidad de contraseñas a generar:"));

        PasswordGenerator[] generadores = new PasswordGenerator[cantidad];

        for (int i = 0; i < cantidad; i++) {
            generadores[i] = new PasswordGenerator(longitud);
            System.out.println("Contraseña " + (i + 1) + ": " + generadores[i].getContraseña() + " - " + (generadores[i].comprobarSeguridad() ? "Segura" : "Débil"));
        }
    }
}



class PasswordGenerator {

    private int length;
    private String password;


    public PasswordGenerator(int length) {
        this.length = length;
        this.password = generatePassword();
    }

    //Getter que devuelve contraseña

    public String getContraseña(){
        return password;
    } 
    //Getter que devuelve longitud

    public int getLongitud(){
        return length;
    }

    //metodo que construye la contraseña
    private String generatePassword() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String allChars = upper + lower + digits;

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            sb.append(allChars.charAt(index));
        }

        return sb.toString();
    }    

    public boolean comprobarSeguridad(){

        int numeros=0;
        int mayus=0;
        int minus=0;
       
        for(int i =0; i<password.length();i++){
            char c= password.charAt(i);

            if(c >= '0' && c<='9'){
                numeros++;
            }else if(c>='A' && c<='Z'){
                mayus++;
            }else if( c>='a' && c<='z'){
                minus++;
            }
        }
        if(numeros >5 && mayus > 1 && minus > 1){
            return true;
        }else{
            return false;
        }
        
    }

    
    
}




    


