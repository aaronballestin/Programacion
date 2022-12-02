import java.util.*;
public class Ejercicio3 {
    public static boolean alMenosDos(int [] array, int numero){
        int iguales =0;
        int posicion=0;
        boolean resultado = false;
        while(iguales < 2 && posicion<array.length){
            if(array[posicion]==numero){
                iguales++;
            }
            posicion++;
        }
        if(iguales == 2)
            resultado = true;
        return resultado;
    }
    public static void main(String[] args){
        int lista [];
        lista = new int [5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los numeros");
        for(int i=0;i<lista.length;i++){
            int num = teclado.nextInt();
            lista[i] = num;
        }
        System.out.println("Introduce el numero sobre el que quieres buscar iguales: ");
        int numero = teclado.nextInt();
        if(alMenosDos(lista, numero)){
            System.out.println("Hay al menos dos");
        }else
            System.out.println("No hay al menos dos");
    }
}
