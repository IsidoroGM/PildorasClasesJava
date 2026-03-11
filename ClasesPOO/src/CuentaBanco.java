
import java.util.Random;

public class CuentaBanco{

    public CuentaBanco(String nombreTitular, double saldo){//Creación del constructor y parámetros

        this.saldo=saldo;

        this.nombreTitular=nombreTitular;

        Random rnd= new Random();
        this.numeroCuenta=Math.abs(rnd.nextLong());
               


    }

    //Creación de METODOS

    public void setIngresos(double ingreso){
        if(ingreso<0) System.out.println("No se permiten ingresos negativos");
        else saldo+=ingreso;
    }

    public void setReintegro(double reintegro){
        saldo-=reintegro;
    }
    public String getsaldo(){
        return "EL saldo de la cuenta es: " + saldo;
    }

    public String getDatosCuenta(){
        return "Hola " + nombreTitular + ", tu cuenta es la nº: " + numeroCuenta + "." + "\n Su saldo es de: " + saldo;
    }

    public void Transferencia(CuentaBanco titu1, CuentaBanco titu2, double monto){

        titu1.saldo-=monto;
        titu2.saldo+=monto;
    }

    //Campos de clase o Propiedades

    private double saldo;

    private String nombreTitular;

    private long numeroCuenta;


}