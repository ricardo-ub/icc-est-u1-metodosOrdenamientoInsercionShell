public class Shell {

    public void sort(int[] array, boolean asc) {
        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("\n==== METODO SHELL ====");
        System.out.println("Arreglo original:");
        printArreglo(array);
        System.out.println();

        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                iteraciones++;

                int temp = array[i];
                int j = i;
                boolean huboCambio = false;

                while (j >= gap) {
                    comparaciones++;

                    int a = j - gap;
                    int b = j;

                    boolean debeMoverse;

                    if (asc) {
                        debeMoverse = array[j - gap] > temp;
                    } else {
                        debeMoverse = array[j - gap] < temp;
                    }

                    String cambioSiNo = debeMoverse ? "cambio=si" : "cambio=no";

                    System.out.println("I" + i + ":\t" +
                            "gap=" + gap + "\t" +
                            "a=" + a + "\t" +
                            "b=" + b + "\t" +
                            "[a]=" + array[a] + "\t" +
                            "[b]=" + array[b] + "\t" +
                            cambioSiNo);

                    if (debeMoverse) {
                        array[j] = array[j - gap];
                        cambios++;
                        huboCambio = true;
                        j -= gap;
                    } else {
                        break;
                    }
                }

                array[j] = temp;

                if (huboCambio) {
                    System.out.println();
                    printArreglo(array);
                }

                System.out.println();
            }
        }

        System.out.println("END");
        printArreglo(array);
        System.out.println("\nCOMPARACIONES: " + comparaciones);
        System.out.println("ITERACIONES: " + iteraciones);
        System.out.println("CAMBIOS: " + cambios);
        System.out.println();
    }

    private void printArreglo(int[] array) {
        for (int valor : array) {
            System.out.printf("%-8d", valor);
        }
        System.out.println();
    }
}