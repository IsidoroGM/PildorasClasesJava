
import java.util.Arrays;


public class Uso_personas {

    public static void main(String[] args) {
       
        // Empleados Juan=new Empleados("Juan", 15000);
        // System.out.println(Juan.getDescription());

        // Jefes Isidoro=new Jefes("Isidoro",38000, 10000);
        // Isidoro.setCargo("Jefazo");
        // System.out.println(Isidoro.getDescription() + Isidoro.getCargo());

        // alumnos Olivia=new alumnos("Olivia", "Informática", "Jirafas");

        // System.out.println(Olivia.getNombre());
        // System.out.println(Olivia.getDescription());


        Empleados losEmpleados[]=new Empleados[5];

        losEmpleados[0]=new Empleados("Isi", 2500);
        losEmpleados[1]=new Empleados("Bea", 2500);
        losEmpleados[2]=new Empleados("Olivia", 3500);
        losEmpleados[3]=new Empleados("Paco", 1500);
        losEmpleados[4]=new Empleados("Sandra", 3000);

        Arrays.sort(losEmpleados);
        for(Empleados e: losEmpleados){
            System.out.println(e.getDescription());
        }
        //Veremos la información de cada elemento guardado en el array

        Jefes Manuel=new Jefes("Manuel", 5000);

        Empleados Sonia=new Empleados("Sonia", 3000);
        System.out.println("El trabajador " + Sonia.getNombre() + " tiene un bonus de: " + Sonia.setBonus(500));

        
        
    }
}
