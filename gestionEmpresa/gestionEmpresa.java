public class gestionEmpresa {

    public static void main(String[] args) {
        
    }

}

//Creación de una clase abstracta de la que heredarán el resto.
abstract class Empleado{

    public Empleado(String nom, double salario, int añoAlta){

    this.nombre=nom;
    this.salario=salario;
    this.añoAlta=añoAlta;
    }

    public abstract double getSalario();
    public abstract String getDescription();

    public String imprimir(){
        return "El empleado " + this.getNombre() + ", tiene uns salario de " + salario + "€. Se incorporó en el año " + añoAlta + ".";
    }

    public String getNombre(){
        return nombre;
    }

    

    private String nombre;
    private double salario;
    private int añoAlta;
}

class EmpleadoAsalariado extends Empleado{

    public EmpleadoAsalariado(String nom, double salario, int añoAlta){
        super(nom, salario, añoAlta);

        this.salario=salario;
    }

    @Override
    public double getSalario(){
        return salario;
    }

    @Override
    public String getDescription(){
        return null;
    }

    private String nom;
    private double salario;
    private int añoAlta;

}