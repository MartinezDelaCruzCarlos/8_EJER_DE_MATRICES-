package matriz_2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class MATRIZ_2 {

    public static void main(String[] args) {
    //MATRIZ DE 10X1O INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL PRIMARIA Y SECUNDARIA
        Random rd = new Random();
        int i;
        int[][] matriz = new int[3][3];
        // rellenamos matrices
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

        {
            int diagonalPrincipal[] = new int[matriz.length];
            int diagonalSecundaria[] = new int[matriz.length];
            for (i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j) {
                        diagonalPrincipal[i] = matriz[i][j];
                    }
                    if ((i + j) == matriz.length - 1) {
                        diagonalSecundaria[i] = matriz[i][j];
                    }
                }

            }
            int multi1= 1 ;
            int multi2= 1;
            System.out.println("\nEste es tu diagonal principal");
            for (int elemento : diagonalPrincipal) {
                System.out.print("\t" + elemento);
                multi1 = multi1 * elemento;
                System.out.println("");
            }
            System.out.print(" Multiplicación de tu diagonal principal : " + multi1);
            System.out.println("");

            System.out.println("\nEste es tu diagonal secundaria");
            for (int elemento : diagonalSecundaria) {
                System.out.print("\t" + elemento);
                multi2 = multi2 * elemento;
                System.out.println("");
            }
            System.out.print("Multiplicacion de tu diagonal secundaria: " + multi2);
            System.out.println("");
            int multitotal = 1;
            multitotal = multi1 * multi2;
            System.out.print("\nESTA ES LA MULTIPLICACION TOTAL DE AMBAS DIAGONALES: " + multitotal);
            System.out.println("");
        }

    }
}
