
import java.util.GregorianCalendar;

public class UsoEmpleados {

    public static void main(String[] args) {
        
        Jefes Antonio=new Jefes("Antonio", 10000, 2000, 12, 10);

        Antonio.getDatosEmpleado();
        
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
