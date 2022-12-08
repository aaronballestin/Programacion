/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author A8-PC71
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla[][];
        tabla = new int [4][4];
        //construyes la tabla
        for(int i = 0; i<tabla.length;i++){
            for(int j = 0; j<tabla[i].length; j++){
                System.out.println("Introduzca un numero: ");
                tabla[i][j] = teclado.nextInt();
            }
        }
        //escribe por pantalla la matriz
        for(int i = 0; i<tabla.length;i++){
            for(int j = 0; j<tabla[i].length; j++){
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("");
        }
        //miras el resultado de sumar la fila 0
       int fila0=0;
       for(int i = 0;i<tabla.length;i++){
           fila0 += tabla[0][i];
       }
       //compruebas si el resto de sumas de digitos de filas da el mismo resultado
       boolean igual = true;
       int sumaFilas=0;
       for(int i = 0; i<tabla.length;i++){ 
           sumaFilas = 0;
           for(int j = 0; j<tabla[i].length; j++){
               sumaFilas += tabla[i][j];
           }
           if(sumaFilas != fila0){
               igual = false;
           }
       }
       //comprueba si la suma de digitos en las columnas da el mismo resultado
       int sumaColumnas = 0;
       for(int i = 0; i<tabla[0].length;i++){ 
           sumaColumnas = 0;
           for(int j = 0; j<tabla[i].length; j++){
               sumaColumnas += tabla[j][i];
           }
           if(sumaColumnas != fila0){
               igual = false;
           }
       }
       //muestra por pantalla si es matriz magica
       if(igual){
           System.out.println("Es una matriz magica");
       }else
            System.out.println("No es una matriz magica");
        
    }
    
}
