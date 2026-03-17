// Crea un programa en Java que:
// Pida al usuario una palabra o frase.
// Recorra el texto carácter por carácter.
// Cuente:
// Cuántas letras mayúsculas hay
// Cuántas letras minúsculas hay
// Cuántos números hay
// Muestre los resultados por consola.


import java.util.Scanner;

public class contarCaracteres {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el texto:");
        String texto=sc.nextLine();

        int mayus=0;
        int minus=0;
        int num=0;

        for(int i=0;i< texto.length();i++){
            char c=texto.charAt(i);

            if(c >= 'A' && c<= 'Z'){
                mayus++;
            }else if(c >= 'a' && c<= 'z'){
                minus++;
            }else if (c >= '0' && c<= '9'){
                num++;
            }

        }

    System.out.println("Tu texto tiene " + mayus + " mayúsculas, " + minus + ", minúsculas, y " + num + " números.");    
        
    }
}
