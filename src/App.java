import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3};

        Insercion insercion = new Insercion();
        Shell shell = new Shell();

        int opcionMenu;

        do {
            System.out.println("\n==== PROGRAMA DE ORDENAMIENTO ====");
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opcion --> ");
            opcionMenu = entrada.nextInt();

            switch (opcionMenu) {
                case 1:
                    int[] arregloInsercion = arreglo.clone();
                    int[] arregloShell = Arrays.copyOf(arreglo, arreglo.length);

                    System.out.println("\nArreglo original: " + Arrays.toString(arreglo));

                    System.out.println("\nInsercion:");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    System.out.print("Elija tipo --> ");
                    int opInsercion = entrada.nextInt();

                    boolean ascInsercion = (opInsercion == 1);

                    insercion.sort(arregloInsercion, ascInsercion);
                    System.out.println("Arreglo ordenado con Insercion: " + Arrays.toString(arregloInsercion));

                    System.out.println("\nShell:");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    System.out.print("Elija tipo --> ");
                    int opShell = entrada.nextInt();

                    boolean ascShell = (opShell == 1);

                    shell.sort(arregloShell, ascShell);
                    System.out.println("Arreglo ordenado con Shell: " + Arrays.toString(arregloShell));

                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcionMenu != 2);
    }
}