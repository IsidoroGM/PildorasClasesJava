
import java.util.Calendar;

public class EmpleadoAsalariado extends Empleado {


    public EmpleadoAsalariado(){
        super();
        salarioBase=0.0;

    }
    public EmpleadoAsalariado(String nombre, String DNI, double salarioBase, int agnoAlta){
        super(nombre, DNI, agnoAlta);

        this.salarioBase=salarioBase;
    }

    
    
    public double getSalario(){
        Calendar ahora=Calendar.getInstance();
        int agnoActual = ahora.get(Calendar.YEAR);
        int agnos=agnoActual-getAgnoAlta();
        if(agnos<0){
            System.out.println("Los años no pueden ser negativos");
        }
        if(agnos<2) return salarioBase;
        else if (agnos >=2 && agnos <=3) return salarioBase * 0.07 + salarioBase;
        else if (agnos >=4 && agnos <=8) return salarioBase * 0.11 + salarioBase;
        else if (agnos >=9 && agnos <=15) return salarioBase * 0.17 + salarioBase;
        else return salarioBase * 0.22 + salarioBase;
    }

    public void Imprimir(){
        super.imprimir(); 
        System.out.printf("Salario: %.2f\n", getSalario());
        System.out.println();
    }


   
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    private double salarioBase;
    
}

