import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};
        int[] arregloInsercion = arreglo.clone();
        int[] arregloShell = Arrays.copyOf(arreglo, arreglo.length);

        Insercion insercion = new Insercion();
        Shell shell = new Shell();
    
        int opcionMenu;

        do{
            System.out.println("\n==== PROGRAMA DE ORDENAMIENTO ====");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opcion --> ");
            opcionMenu = entrada.nextInt();

            switch (opcionMenu){
                case 1:
                    System.out.println("\nArreglo original: " + Arrays.toString(arreglo));
                    
                    insercion.sort(arregloInsercion, true);
                    System.out.println("Arreglo ordenado con Insercion (ascendente): " + Arrays.toString(arregloInsercion));
                    
                    //shell.sort(arregloShell, true);
                    System.out.println("Arreglo ordenado con Shell (ascendente): " + Arrays.toString(arregloShell));
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        }while(opcionMenu!=2);

    }

}
