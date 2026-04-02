
public class Uso_personas {

    public static void main(String[] args) {
       
        Empleados Juan=new Empleados("Juan", 15000);
     
        System.out.println(Juan.getDescription());


        Jefes Isidoro=new Jefes("Isidoro",38000, 10000);
        Isidoro.setCargo("Jefazo");
        System.out.println(Isidoro.getDescription() + Isidoro.getCargo());

        

        alumnos Olivia=new alumnos("Olivia", "Informática", "Jirafas");

        System.out.println(Olivia.getNombre());
        System.out.println(Olivia.getDescription());
    }
}
