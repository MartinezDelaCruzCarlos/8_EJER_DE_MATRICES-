
package columnas_pares;

import java.util.Random;

/**
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class COLUMNAS_PARES {
// MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS PARES DE LA MATRIZ
    public static void main(String[] args) {
         Random rd = new Random();
        int i;
        int[][] matriz = new int[5][5];
        // rellenamos matrices
        //matriz.length=filas
        //matriz[i].length=columnas
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                /* System.out.print("Ingrese el valor de celda [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt(); (esto se usa cuando importal "Scanner") */
                matriz[i][j] = rd.nextInt(99 - 10 + 1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }
        // suma de columnas pares 
        int sumaColumnasPar = 0;
        for (int j = 0; j < matriz.length; j++) {
            for (j = 0; j < 5; j++) {
                if (j%2!=0) {
                    for (i = 0; i < matriz.length; i++) {
                        sumaColumnasPar += matriz[i][j];
                    }
                    System.out.print("\nLa suma de la columna imapar " + (j + 1) + " es: " + sumaColumnasPar);
                    sumaColumnasPar = 0;
                }
                System.out.println("");
            }
        }
    }
    
}
