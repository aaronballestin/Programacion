/*
 * Escribe un programa que genera al azar una matriz cuadrada de NxN números enteros (siendo
 * N una constante definida al principio del programa con un valor cualquiera) y que luego
 * muestre un pequeño menú de opciones al usuario. Cada opción debe invocar un método
 * diferente. Supongamos, para ver qué tiene que hacer cada método, que la matriz generada al
 * azar es de 4x4 y que contiene estos números:
 * Opción 1: mostrar matriz. Esta función sacará el contenido de la matriz por la pantalla en
 * formato matriz.
 * Opción 2: perímetro. Mostrará los elementos que ocupan el borde de la matriz, partiendo de la
 * esquina superior izquierda y recorriéndola hacia la derecha y luego hacia abajo (4 6 7 8 9 4 5
 * 3 3 7 0 2 en el ejemplo).
 * Opción 3: espiral. Hará el recorrido en espiral comenzando por la esquina superior izquierda (4
 * 6 7 8 9 4 5 3 3 7 0 2 4 3 3 1 en el ejemplo).
 * Opción 4: salir. Hace que el programa finalice.
 */
package ejercicio12;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author A8-PC71
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos al usuario que introduzca la dimension
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la dimension (n x n) n: ");
        int n = teclado.nextInt();
        //creamos la matriz
        int matriz[][];
        matriz = new int[n][n];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(int) (Math.random()*10);
            }
        }
        //creamos el apartado donde se ubicaran las diferentes opciones
        int opcion =0;
        while(opcion != 4){
            System.out.println("¿Que opcion quieres realizar?");
            opcion = teclado.nextInt();
            //muestra por pantalla la matriz
            if(opcion ==1){
                for(int i=0;i<matriz.length;i++){
                    for(int j=0;j<matriz[i].length;j++){
                        System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println(" ");
                }
               
            }
            //muestra los valores del borde de la matriz
            if(opcion == 2){
               for(int i=0;i<matriz.length;i++){
                   System.out.print(matriz[0][i]+" ");
               } 
               for(int i = 1;i<matriz.length;i++){
                   System.out.print(matriz[i][matriz.length - 1]+" ");
               }
               for(int i=matriz.length - 2;i>=0;i--){
                   System.out.print(matriz[matriz.length - 1][i]+" ");
               }
               for (int i=matriz.length - 2; i>0;i--){
                   System.out.print(matriz[i][0]+" ");
               }
                System.out.println(" ");
            }
            //muestra una espiral hecha por los numeros de la matriz
            int vuelta = 0;
            int vueltaMax =0;
            if(opcion == 3){
                if(n % 2 != 0){
                    vueltaMax = (n/2 + 1);
                    while(vuelta < vueltaMax){
                        for(int i=vuelta;i<matriz.length-vuelta;i++){
                             System.out.print(matriz[vuelta][i]+" ");
                        } 
                        for(int i = vuelta+ 1;i<matriz.length-vuelta;i++){
                            System.out.print(matriz[i][matriz.length - 1-vuelta]+" ");
                        }
                        for(int i=matriz.length - 2-vuelta;i>=vuelta;i--){
                           System.out.print(matriz[matriz.length - 1 - vuelta][i]+" "); 
                        }
                        
                         for (int i=matriz.length - 2 - vuelta; i>vuelta;i--){
                            System.out.print(matriz[i][vuelta]+" ");
                        }   
                        
                        
                        
                        vuelta++;
                     }
                }
                if(n % 2 == 0){
                    vueltaMax = (n/2);
                    while(vuelta < vueltaMax){
                        for(int i=vuelta;i<matriz.length-vuelta;i++){
                             System.out.print(matriz[vuelta][i]+" ");
                        } 
                        for(int i = vuelta+ 1;i<matriz.length-vuelta;i++){
                            System.out.print(matriz[i][matriz.length - 1-vuelta]+" ");
                        }
                        for(int i=matriz.length - 2-vuelta;i>=vuelta;i--){
                           System.out.print(matriz[matriz.length - 1 - vuelta][i]+" "); 
                        }
                        
                         for (int i=matriz.length - 2 - vuelta; i>vuelta;i--){
                            System.out.print(matriz[i][vuelta]+" ");
                        }   
                        
                        
                        
                        vuelta++;
                     }
                }
                
            }
            System.out.println(" ");
        }
    }
    
}
