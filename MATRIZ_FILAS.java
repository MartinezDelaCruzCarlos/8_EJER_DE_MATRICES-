
package matriz_filas;

import java.util.Random;

/**
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class MATRIZ_FILAS {

    public static void main(String[] args) {
    //MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS DE LA MATRIZ
    Random rd = new Random();
        int i, sumafil;
        int[][] matriz = new int[3][3];
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
        //suma de filas
      for (i = 0; i < matriz.length; i++) {
          sumafil=0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumafil=sumafil+ matriz[i][j];
            }
            System.out.println("La suma de la fila "+(i+1)+" es: " +sumafil) ;
       }
        
    }
    
}
