/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author A8-PC71
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla[][];
        tabla = new int[4][5];
        //rellenamos los valores de la tabla
        for(int i = 0;i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length;j++){
                System.out.println("Introduce un numero: ");
                tabla[i][j] = teclado.nextInt();
            }
        }
        //escribimos por pantalla la tabla con la suma de filas
        int sumaFilas=0;
        for(int m=0;m<tabla.length;m++){
            sumaFilas=0;
            for(int n=0;n<tabla[m].length;n++){
                System.out.print(tabla[m][n]+" ");
                sumaFilas += tabla[m][n];
            }
            System.out.println("| "+sumaFilas);
        }
        System.out.println("-------------------------");
        int m=0;
        int n=0;
        int sumaColumna=0;
        int sumaTotal=0;
        //calculamos y escribimos por pantalla las columnas
        for(m=0; m<tabla[0].length;m++){
            sumaColumna=0;
            for(n=0;n<tabla.length;n++){
                sumaColumna += tabla[n][m];
            }
            System.out.print(sumaColumna+" ");
            sumaTotal += sumaColumna;
        }
        System.out.println("| "+sumaTotal);
    }
    
}
