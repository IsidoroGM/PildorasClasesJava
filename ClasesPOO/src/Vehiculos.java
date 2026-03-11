public class Vehiculos {

    //Creación del constructor. Método que da estado inicial a nuestros objetos.
    
    public Vehiculos(int ruedas){ //Constructor. Obligatorio el mismo nombre que su clase.

        //Establecemos el estado inicial 

        this.ruedas=ruedas;
        
        largo=2;

        ancho = 1;

        peso=2;

        color="sin color";

        
      
        //Para modificar estos parametros necesitamos el método Setter
    } 

    public void setExtra(boolean climatizador){

        this.climatizador=climatizador; 
    }

    public String getExtra(){

        if (climatizador) return "Tu coche tiene climatizador";
        else return "Tu coche no tiene climatizador";
    }

    //Métodos SETTER. Estos métodos establecen un estado pero no devuelven valores.

    public void setColor(String colorVehiculo){  //Establece valor de propiedad color.

    this.color=colorVehiculo; //this siempre hace referencia al campo de clase y lo usamos con la propiedad.

    //color="azul";

    } 
      
    

    //Métodos GETTER. Devuelven el valor de una propiedad.

    public String getColor(){ //Devuelve valor de propiedad
        return color;
    }

    public String getDatos(){
        return "Tu vehículo tiene " + ruedas + " ruedas." + " Además " + largo + " metros de largo.";
    }

    //Creamos campos de clase o PROPIEDADES.
    //para crear propiedades usamos PRIVATE = ENCAPSULAMIENTO

    private int ruedas;

    private String color;

    private double  largo;

    private double ancho;

    private double peso;

    private boolean climatizador;

    private boolean tapicería_cuero;

    private boolean GPS;

    


}
