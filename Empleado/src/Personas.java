
// Clase dedicada al estudio de las clases Abastractas, y la herencia entre clases.
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

    public Empleados(String nom, double sueldo) {
        super(nom);
        //TODO Auto-generated constructor stub

      
        this.sueldo=sueldo;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        return "El empelado " + this.getNombre() + " tiene un sueldo de " + sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

    private double sueldo;

    
}

// Clase jefes que hereda de clase Empleados, a su vez de la abstracta Personas
// Se le implementa la interfaz paraJefes
class Jefes extends Empleados implements paraJefes{

    public Jefes(String nom, double sueldo, double incentivo) {
        super(nom, sueldo);
        //TODO Auto-generated constructor stub
    }

    public void setIncentivo(double incentivo){
        this.incentivo=incentivo;
    }

    private double incentivo;

    //Desarrollamos los métodos de la interfaz.
    @Override
    public void setCargo(String cargo) {
        this.cargo=cargo;
    }

    @Override
    public String getCargo() {
        return "\nAdemás tiene el cargo de: " + cargo;
    }

    //parámetro de clase de la interfaz.
    private String cargo;
}

class alumnos extends Personas{

    public alumnos(String nom, String carrera, String aula) {
        super(nom);
        //TODO Auto-generated constructor stub
        this.carrera=carrera;
        this.aula=aula;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        return "El alumno " + this.getNombre() + " estudia " + carrera + " y su aula es " + aula;
    }

    private String carrera;
    private String aula;

}












