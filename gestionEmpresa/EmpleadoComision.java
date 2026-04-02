public class EmpleadoComision extends Empleado {


    public EmpleadoComision(){
        super();
        clientesCaptados=0;
        comisionPorCliente=0;
    }

    public EmpleadoComision(String nombre, String DNI, int agnoAlta, int clientesCaptados, double montoPorCliente){
        super(nombre, DNI, agnoAlta);
        this.clientesCaptados=clientesCaptados;
        this.comisionPorCliente=montoPorCliente;

    }

    @Override
    public double getSalario() {
        if(comisionPorCliente*clientesCaptados>salarioMinimo){
            return comisionPorCliente*clientesCaptados;
        } else return salarioMinimo;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Salario: %.2f\n", getSalario());
        System.out.println();
    }

    public void setClientesCaptados(int clientesCaptados){
        this.clientesCaptados=clientesCaptados;
    }

    public int getClientesCaptados(){
        return clientesCaptados;
    }

    public void setComisionPorCliente(double comisionPorCliente){
        this.comisionPorCliente=comisionPorCliente;
    }

    public double getMontoPorCliente(){
        return comisionPorCliente;
    }


    private int clientesCaptados;
    private double comisionPorCliente;
    public static final double salarioMinimo=950;

}
