package filas_pares;

import java.util.Random;

/**
 * @author USER
 */
public class FILAS_PARES {

    public static void main(String[] args) {
        Random rd = new Random();
        int i, sumafil;
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
        // suma de filas pares
        int sumaFilas = 0;
        for (i = 0; i < matriz.length; i++) {
            for (i = 0; i < 5; i++) {
                if (i % 2 != 0) {
                    for (int j = 0; j < matriz.length; j++) {
                        sumaFilas += matriz[i][j];
                    }
                    System.out.print("\nLa suma de la fila " + (i+1) + " es: " + sumaFilas);
                    sumaFilas = 0;
                }
                System.out.println("");
            }
        }

    }
}
