

public class UsoVehiculos {

    public static void main(String[] args) {
        
        Vehiculos miCoche = new Vehiculos(4); //Objeto de tipo cehiculo. Instancia perteneciente a la clase vehiculo.
        //Hemos instanciado la clase vehiculo.
        
        miCoche.setColor("Verde"); 

        miCoche.getDatos();

        miCoche.setExtra(true);



        
        

        Vehiculos miMoto = new Vehiculos(2);

        miMoto.setColor("Rojo");

        

        System.out.println(miCoche.getDatos() + "\n" + miMoto.getDatos());

        miMoto.getDatos();
    }

}
