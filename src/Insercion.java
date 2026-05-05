import java.util.Arrays;

public class Insercion {
    
    public void sort(int [] array, boolean asc){
        int comparaciones=0;
        int cambios=0;
        int iteraciones=0;

        System.out.println("\n==== METODO INSERCION ====");
        System.out.println("Arreglo original :");
        printArreglo(array);
        System.out.println();

        for (int i=1; i<array.length; i++){
            iteraciones++;

            int clave = array[i];
            int j = i-1;
            boolean huboCambio = false;

            while (j>=0){
                comparaciones++;
                
                int a=j;
                int b=j+1;
                boolean debeMoverse;

                if (asc==true){
                    debeMoverse = array[j] > clave;
                } else {
                    debeMoverse = array[j] < clave;
                }

                String cambioSiNo = debeMoverse ? "cambio=si" : "cambio=no";

                System.out.println("I"+i+": \t"+
                    "a="+a+"\t"+
                    "b="+b+"\t"+
                    "[a]="+array[a]+"\t"+
                    "[b]="+array[b]+"\t"+
                    cambioSiNo);

                if (debeMoverse){
                    array[j+1] = array[j];
                    cambios++;
                    huboCambio = true;
                    j--;
                } else {
                    break;
                }
            }
            
            array[j+1] = clave;

            if (huboCambio){
                System.out.println();
                printArreglo(array);
            }
            System.out.println();
        }

        System.out.println("END\t");
        printArreglo(array);
        System.out.println("\nCOMPARACIONES: " + comparaciones);
        System.out.println("ITERACIONES: " + iteraciones);
        System.out.println("CAMBIOS: " + cambios);
        System.out.println();
        
    }

    private void printArreglo(int[] array) {
        for (int valor : array){
            System.out.printf("%-8d", valor);
        }
        System.out.println();
    }
}
