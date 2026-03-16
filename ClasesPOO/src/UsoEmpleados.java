
import java.util.GregorianCalendar;

public class UsoEmpleados {

    public static void main(String[] args) {
        
        Jefes Antonio=new Jefes("Antonio", 10000, 2000, 12, 10);


        Empleados[] misEmpleados=new Empleados[5];
        
        misEmpleados[0]=new Empleados("Ana", 30000, 2000, 10, 10);
        misEmpleados[1]=new Empleados("Juan", 40000, 2001, 5, 15);
        misEmpleados[2]=new Empleados("María", 35000, 2002, 8, 20);
        misEmpleados[3]=new Empleados("Pedro", 45000, 2003, 12, 25);
        misEmpleados[4]=Antonio; //Principio de sustitución

        Jefes Patricia=new Jefes("Patricia", 50000, 1999, 3, 5);  
        
        Empleados PatriciaSecretaria=Patricia; //Principio de sustitución
        //Una clase padre puede contener a un objeto de una clase hija, pero no al revés.

        for (Empleados e: misEmpleados){
            System.out.println(e.getDatosEmpleado() + " y un salario de: " + e.getSueldo() + " y fecha de alta: " + e.getFechaAlta().getTime());
        }
        
        
    }

}

class Empleados{

    public Empleados(String nom, double sue, int agno, int month, int day){ //Constructor

        this.nombre=nom;

        sueldo=sue;

        calendario =new GregorianCalendar(day, month, agno);

        Id=IdSiguiente;

        IdSiguiente++;

        

    }

    //Metodo para cambiar la sección de un empleado.


    public String getDatosEmpleado(){
        return "El empleado " + nombre + " tiene el número: " + Id;
    }

    public static String getIdSiguiente(){
        return "El Id del siguiente empleado será: " + IdSiguiente;
    }

    public double getSueldo(){
        return sueldo;
    }

    public GregorianCalendar getFechaAlta(){
         return calendario;
    }

    //Metodo subir salario 
    public void subirSalario(double porcentaje){

        double aumento=sueldo*porcentaje/100;
         sueldo+=aumento;

    }

    //Método para pedir aumento
    public void pedirAumento(double porcentaje){
        System.out.println("El empleado " + nombre + " pide un aumento del " + porcentaje + "%.");
        subirSalario(porcentaje);
    }
 
    //Parámetros

    private final String nombre;

    private double sueldo;

    GregorianCalendar calendario;


    private int Id;

    private static int IdSiguiente=1;
}


// Creamos la clase que hereda de Empleado
class Jefes extends Empleados{
    
    public Jefes(String nombre, double sue, int agno, int month, int day) {
        super(nombre, sue, agno, month, day);
    }

    public void setIncentivo(double b){
        incentivo=b; 
    }

    public double getSueldoJefe(){

        double sueldoJefe=getSueldo();

        return sueldoJefe + incentivo;

    }

    private double incentivo;
    
}
