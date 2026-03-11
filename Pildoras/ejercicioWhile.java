/*Debes crear un programa que genere un número aleatorio entre 1 y 100 y lo guarde en una variable. Al ejecutar el programa
 este pedirá por consola la introducción de un número entre 1 y 100.

Si el nº introducido por el usuario es mayor que el generado por el programa aleatoriamente, saldrá un mensaje en consola indicando que «el nº es menor».

Si el nº introducido por el usuario es menor que el generado por el programa aleatoriamente, saldrá un mensaje en consola indicando que «el nº es mayor».

La operativa se repetirá indefinidamente hasta que el usuario adivine el nº aleatorio generado por el programa. Cuando se adivine el nº aleatorio,
 debe salir un mensaje en consola que diga «Correcto» y el nº de intentos consumidos para averiguar el nº */


import java.util.*;
import javax.swing.JOptionPane;
public class ejercicioWhile {

    public static void main(String[] args) {
    


        //Generamos un número entre 1 y 100 y las variables.
         Random num = new Random();
         int numAlea=num.nextInt(100)+1;
         int numB=0;
         int intentos=0;

         //System.out.println(numAlea);
         //Si la condicion es TRUE el bucle se repite 
        while(!(numB==numAlea)){

             numB=Integer.parseInt(JOptionPane.showInputDialog("Dame un número:"));
             intentos++;

                if(numB>numAlea){
                    System.out.println("Tu número es mayor que el objetivo.");
                }else{
                    System.out.println("El número es menor que el objetivo");
                }
 
            }

        System.out.println("Numero correcto");
        System.out.println("Has realizado " + intentos + " intentos.");

        }
    }   


