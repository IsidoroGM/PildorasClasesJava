


//Creación de una clase abstracta de la que heredarán el resto.
public abstract class Empleado{


    //Constructor por defecto
    public Empleado(){
        DNI="00000000";
        nombre="No Disponible";
        agnoAlta=2010;

    }

    //Constructor por parámetros
    public Empleado(String nombre,String DNI, int agnoAlta){

    this.DNI=DNI;
    this.nombre=nombre;
    this.agnoAlta=agnoAlta;
    }

    public abstract double getSalario();

    public void imprimir(){
        System.out.println("DNI: " + getDNI() + "\nNombre: " + getNombre() + "\nAño de ingreso: " + getAgnoAlta() );
    }

    public void setDNI(String DNI){
        this.DNI=DNI;
    }

    public String getDNI(){
        return DNI;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setAgnoAlta(int agnoAlta){
        this.agnoAlta=agnoAlta;
    }

    public int getAgnoAlta(){
        return agnoAlta;
    }

    
    private String DNI;
    private String nombre;
    protected int agnoAlta;
}

