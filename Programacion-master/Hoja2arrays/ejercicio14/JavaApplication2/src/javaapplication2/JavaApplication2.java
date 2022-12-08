/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Aaron Ballestin Fuertes
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean tabla[][];
        tabla = new boolean[8][8];
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                tabla[i][j]=false;
            }
        }
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba la posicion del alfil: ");
        String posicion = teclado.nextLine();
        //escoge el primer valor de la posicion que es una letra y lo pasa a numero
        //por ejemplo a = 97, y luego les daremos el valor que tiene en la matriz que tenemos creada
        char columnaCaracter = posicion.charAt(0);
        
        char filaCaracter =posicion.charAt(1); 
        int fila = 0;
        //el 8 del tablero corresponde al 0 de nuestra tabla el 7 al 1.
        //podemos operar en nuestra tabla restando 8 al varlor introducido y cambiandole el signo ya que nos daria resultado negativo
        //para el valor columna restaremos a por el valor que nos han dado y tendremos el varlor en nuestra tabla
        //ya que 'a' - 'a' es 0 como la primera columna de nuestro array
        fila = '8' - filaCaracter;
        int columna = columnaCaracter - 'a';
        System.out.println("fila "+fila+" columna "+columna);
        
        tabla[fila][columna]=true;
        
        //un alfil se mueve en 4 posiciones, asi que buscaré las posibles posiciones en 4 whiles dependiendo direccion y sentido
        
        //diagonal hacia arriba y izquierda
        int x = fila; //se mueve una posicion hacia la izquierda asi que -1
        int y = columna;//se mueve una posicion hacia la derecha asi que -1
        
        //while cuando fila o columna sea 0 se para ya que -1 se saldría de la tabla o cuando sean 7 ya que si es 8 se sale tambien
        //cada posicion correcta la vuelve un true en nuestra tabla
        while(x>=0 && y>=0){
            tabla[x][y]=true;
            x--;
            y--;
            
        }
        //volvemos a inicializar
        x= fila;//hacia derecha asi que +1
        y=columna;//hacia arriba asi que -1
        
        while(x<=7 && y>=0){
            tabla[x][y]=true;
            x++;
            y--;
        }
        
        x = fila;//se mueve hacia izquierda asi que -1
        y = columna;//se mueve hacia abajo asi que +1
        
        while(x>=0 && y<=7){
            tabla[x][y]=true;
            x--;
            y++;
        }
        
        x = fila;//se mueve hacia derecha asi que +1
        y = columna;//se mueve hacia abajo asi que +1
        
        while(x<=7 && y<=7){
            tabla[x][y]=true;
            x++;
            y++;
        }
        
        //mostramos por pantalla los valores donde sea true
        System.out.println("Las posibles casillas son: ");
        for(int i =0; i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                if(tabla[i][j]){
                    int mostrarFila = -i+8; 
                    char mostrarColumna = 'a';
                    switch(j){
                        case 0: 
                            mostrarColumna = 'a';
                            break;
                        case 1: 
                            mostrarColumna = 'b';
                            break;
                        case 2: 
                            mostrarColumna = 'c';
                            break;
                        case 3:
                            mostrarColumna = 'd';
                            break;
                        case 4:
                            mostrarColumna = 'e';
                            break;
                        case 5:
                            mostrarColumna = 'f';
                            break;
                        case 6:
                            mostrarColumna = 'g';
                            break;
                        case 7:
                            mostrarColumna = 'h';
                            break;
                        
                    }
                    System.out.print(mostrarColumna+""+mostrarFila+"  ");
                   
                
                }
            }
        }
        
    }
    
}
