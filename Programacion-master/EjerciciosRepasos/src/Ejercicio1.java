import java.util.*;
public class Ejercicio1 {
   public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int tamArray=5;
    int [] imagen;
    imagen = new int [tamArray];
    int [] imagenEspejo;
    imagenEspejo = new int [tamArray * 2];
    int posicion = 0;
    for(int i=0;i<tamArray;i++){
        int num =teclado.nextInt();
        imagen[i]=num;
    }
    rellenarIgual(imagen, imagenEspejo, posicion, tamArray);
    rellenarAlreves(imagen, imagenEspejo, posicion, tamArray);
    for(int i = 0; i<(tamArray*2);i++){
        System.out.print(imagenEspejo[i]+" ");

    }
   }

   public static void rellenarIgual(int imagen[], int imagenEspejo[], int posicion, int tamArray ){
    if(posicion == tamArray - 1){
        imagenEspejo[posicion] = imagen[posicion];
    }else {
        imagenEspejo[posicion] = imagen[posicion];
        rellenarIgual(imagen, imagenEspejo, posicion + 1, tamArray);
    }
}
    public static void rellenarAlreves(int imagen[], int imagenEspejo[], int posicion, int tamArray){
        if(posicion == tamArray - 1){
            imagenEspejo[tamArray + posicion] = imagen[tamArray - posicion-1];
        }else{
            imagenEspejo[tamArray + posicion] = imagen[tamArray - 1 - posicion];
            rellenarAlreves(imagen, imagenEspejo, posicion + 1, tamArray);
        }
    }
}

