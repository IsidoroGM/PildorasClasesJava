import java.util.Scanner;

public class UsoCuenta {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            CuentaBanco titu1=new CuentaBanco("Isi", 1000);
            CuentaBanco titu2=new CuentaBanco("Bea", 2000);
            
            //MENU PRINCIPAL
            while(true){
                System.out.println("\nElija una cuenta por favor:");
                System.out.println("1. Cuenta nº 1");
                System.out.println("2. Cuenta nº 2");
                System.out.println("3. Salir");
                
                int opcionCuenta=scanner.nextInt();
                
                if (opcionCuenta == 3) {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                
                CuentaBanco cuentaActual;
                
                if(opcionCuenta == 1) {
                    cuentaActual = titu1;
                } else if (opcionCuenta == 2) {
                    cuentaActual = titu2;
                } else {
                    System.out.println("Opción no válida");
                    continue;
                }
                
                boolean volver=false;
                
                while (!volver) {
                    
                    System.out.println("\n--- MENÚ PRINCIPAL ---");
                    System.out.println("1. Comprobar cuenta");
                    System.out.println("2. Retirar fondos");
                    System.out.println("3. Agregar fondos");
                    System.out.println("4. Realizar una transferencia ");
                    System.out.print("5. Volver");
                    
                    int opcionMenu=scanner.nextInt();
                    
                    switch (opcionMenu) {
                        case 1 ->{ System.out.println(cuentaActual.getDatosCuenta());
                        }
                        
                        case 2 -> {
                            System.out.println("Seleccione el importe a retirar: ");
                            double reintegro=scanner.nextDouble();
                            cuentaActual.setReintegro(reintegro);
                        }
                        
                        case 3 -> {
                            System.out.println("Seleecione el importe a agregar: ");
                            double ingreso=scanner.nextDouble();
                            cuentaActual.setIngresos(ingreso);
                        }
                        
                        case 4 -> {
                            System.out.println("Se realizará una transferencia a la cuenta nº2. Ingrese la cantidad: ");
                            double monto=scanner.nextDouble();
                            
                            if (cuentaActual== titu1) {
                                cuentaActual.Transferencia(titu1, titu2, monto);
                            }else{
                                cuentaActual.Transferencia(titu2, titu1, monto);
                            }
                        }
                        case 5 -> volver= true;
                        
                        default -> System.out.println("Opción no válida.");
                    }
                }
            }          
        }
    }
}

        



