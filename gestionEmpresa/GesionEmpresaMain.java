public class GesionEmpresaMain {

    public static void main(String[] args) {
        
        //Creación del array
        Empleado empleados[]=new Empleado[4];

        //Creación de empleado con parámetros
        EmpleadoAsalariado EA1=new EmpleadoAsalariado("Antonio", "49120270F", 1125, 2020);
        empleados[0]=EA1;

        //Creación de empleado con parámetros.
        EmpleadoComision EC1=new EmpleadoComision("Paco", "49120271F", 2024, 169, 7.10);
        empleados[1]=EC1;

        //Creación sin parámetros, estableciendolos con Métodos set.
        EmpleadoComision EC2=new EmpleadoComision();
        EC2.setDNI("49120272F");
        EC2.setNombre("Andres");
        EC2.setAgnoAlta(2019);
        EC2.setClientesCaptados(200);
        EC2.setComisionPorCliente(6.9);
        empleados[2]=EC2;

        EmpleadoAsalariado EA2=new EmpleadoAsalariado();
        EA2.setDNI("49120273F");
        EA2.setNombre("Manuel");
        EA2.setAgnoAlta(2010);
        EA2.setSalarioBase(1055);
        empleados[3]=EA2;

        sueldoMayor(empleados);
        mostrarTodos(empleados);


    }  

    public static void sueldoMayor(Empleado empleados[]){
        int empMayor=0;
        double salarioMayor=0;

        for (Empleado empleado : empleados) {
            try {
                if (empleado.getSalario() > salarioMayor) {
                    empMayor=1;
                    salarioMayor = empleado.getSalario();
                }
            } catch (Exception e) {
                System.out.println(empleado.getNombre() + ": ");
                System.out.println(e.getMessage());
            }
        }  
    }  

    public static void mostrarTodos(Empleado empleados[]){
        System.out.println("___Todos los empleados:___\n");
        for (Empleado empleado : empleados) {
            empleado.imprimir();
        }

    }
}
