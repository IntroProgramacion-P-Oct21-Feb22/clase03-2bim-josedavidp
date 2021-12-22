/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Creación de arreglo bidimensionales

        int[][] arreglo1 = new int[3][3];
        int valorIngresado;
        /*
        -10      41      40
        1       -2       -3
        6       8       -9
         */
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int valor;

        System.out.println("Presentación de valores iniciales del arreglo");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%d\t", arreglo1[i][j]);
            }
            System.out.println(); // salto de línea
        }

        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];

                if (valor > 0) {
                    sumaPositivos = sumaPositivos + valor;
                } else {
                    if (valor < 0) {
                        sumaNegativos = sumaNegativos + valor;
                    }
                }

            }
        }
        System.out.printf("Suma de valores de positivos: %d\n", sumaPositivos);
        System.out.printf("Suma de valores de negativos: %d\n", sumaNegativos);
    }

}
