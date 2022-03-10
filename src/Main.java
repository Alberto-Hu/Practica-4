import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        Scanner scn = new Scanner(System.in);
        boolean salida = false;
        int opcion; //Guardaremos la opcion del usuario


        while (!salida) {
            System.out.println("\nElige una de las siguientes opciones: ");

            System.out.println("Opcion 1: Captura y mostrar CURP");
            System.out.println("Opcion 2: Captura y mostrar RFC");
            System.out.println("Opcion 3: Salir del programa");

            try {
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Opcion 1: Captura y mostrar CURP");
                        Mexicano curp = new Mexicano(CapParametro.capCadena("Ingrese su nombre: "), CapParametro.capCadena("Ingrese su primer apellido: "),
                                CapParametro.capCadena("Ingrese su segundo apellido: "),
                                CapParametro.capCadena("Ingrese su fecha de nacimiento AAAA/MM/DD: "),
                                CapParametro.capCadena("Ingrese su genero H/M: "),
                                CapParametro.capCadena("Ingrese el estado de nacimiento: \n")
                        );
                        curp.setcurp();
                        System.out.println("Su CURP es: " + curp.getcurp());

                    }
                    case 2 -> {
                        System.out.println("Opcion 2: Captura y mostrar RFC\n");
                        Mexicano rfc = new Mexicano(CapParametro.capCadena("Ingrese su nombre: "), CapParametro.capCadena("Ingrese su primer apellido: "),
                                CapParametro.capCadena("Ingrese su segundo apellido: "),
                                CapParametro.capCadena("Ingrese su fecha de nacimiento AAAA/MM/DD: "),
                                CapParametro.capCadena("Ingrese su genero H/M: "),
                                CapParametro.capCadena("Ingrese el estado de nacimiento: \n")
                        );

                        rfc.setrfc();
                        System.out.println("Su RFC es: " + rfc.getrfc());

                    }
                    case 3 -> salida = true;
                    default -> System.out.println("Solo números entre 1 y 3\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nIngresa un número valido");
                sn.next();
            }
        }
    }
}

class CapParametro{
    public static String capCadena(String cap){
        Scanner sc= new Scanner(System.in);
        System.out.print(cap);
        return (sc.nextLine());
    }
}
