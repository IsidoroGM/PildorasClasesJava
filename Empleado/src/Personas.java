
import java.util.GregorianCalendar;



public abstract class Personas{

    

    public Personas(String nom) {
        nombre = nom;
    }

    public String getNombre(){
        return nombre;

    }

    public abstract String getDescription();

    private String nombre;

}
    
class Empleados extends Personas{

    public Empleados(String nom, double sueldo, GregorianCalendar fechaAlta) {
        super(nom);
        //TODO Auto-generated constructor stub

        this.fechaAlta=fechaAlta;
        this.sueldo=sueldo;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        return "El empelado " + this.getNombre() + " tiene un sueldo de " + sueldo + ", y entró a trabajar en " + fechaAlta;
    }

    public double getSueldo(){
        return sueldo;
    }

    private double sueldo;

    private GregorianCalendar fechaAlta;

}













