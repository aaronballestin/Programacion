package Hoja2arrays.ejercicio13.src;


import java.util.Scanner;
import java.util.*;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tabla [][];
        tabla = new String[30][3];
        char seguir = 's';
        int i = 0;
        double masPeso; double menosPeso;
        int menosAltura;
        int masAltura;
        int j = 0;
        //esto sirve para leer el, la altura y el peso de cada alumno, lo hace mientras la persona que introduce los valores 
        //quiere o cuando se completa la tabla con los 30 alumnos
        while(seguir == 's' && i<tabla.length){
            System.out.println("Introduce el nombre del alumno: ");
            tabla[i][j] = teclado.next();
            j++;
            System.out.println("Introduzca su peso: ");
            tabla[i][j] = teclado.next();
            j++;
            System.out.println("Introduzca su altura en centimetros: ");
            tabla[i][j] = teclado.next();
            j=0;
            i++;
            System.out.println("¿Quieres seguir? si[s] o no[n]");
            seguir = teclado.next().charAt(0);
        }
        //for(int x=0; x < tabla.length; x++){
        //    for(int y=0; y < tabla[x].length; y++){
        //        tabla[x][y]= "Pepe";
        //    }
            

        //}
        for(int x=0; x < i; x++){
            for(int y=0; y < tabla[x].length; y++){
                System.out.print(tabla[x][y]+" ");
            }
            System.out.println("");

        }
        //mira el peso de los alumnos
        //primero meto los datos del primer alumno, comparo al segundo respecto a este y a los demas respecto al que mas y menos pesa
        masPeso = Double.parseDouble(tabla[0][1]);
        menosPeso = Double.parseDouble(tabla [0][1]);
        String nombre = tabla [0][0];
        String nombre2 = tabla [0][0];
        
        for(int m = 0; m < i; m++){
            //compara cada uno de la tabla con el que mas peso tiene, si uno tiene mas peso que el anterior guardado guarda su nombre y su peso
            if(Double.parseDouble(tabla[m][1]) > masPeso){
                masPeso = Double.parseDouble(tabla[m][1]);
                nombre = tabla[m][0];
            }
            //compara cada uno de la tabla con el que menos peso tiene, si uno tiene menos peso que el anterior guardado guarda su nombre y su peso
            if(Double.parseDouble(tabla[m][1]) < menosPeso){
                menosPeso = Double.parseDouble(tabla[m][1]);
                nombre2 = tabla[m][0];
            }
            
        }
        System.out.println("El alumno que mas pesa es "+nombre+" y pesa "+masPeso);
        System.out.println("El alumno que menos pesa es "+nombre2+" y pesa "+menosPeso);
        //mira la altura de los alumnos
        //primero meto los datos del primer alumno, comparo al segundo respecto a este y a los demas respecto al mas alto y al mas bajo
        masAltura = Integer.parseInt(tabla[0][2]);
        menosAltura = Integer.parseInt(tabla[0][2]);
        nombre = tabla [0][0]; 
        String pesoAlto= tabla[0][1];
        String pesoBajo = tabla[0][1];
        nombre2 = tabla [0][0];
        
        for(int m = 0; m < i; m++){
            //compara cada uno de la tabla con el que mas peso tiene, si uno tiene mas peso que el anterior guardado guarda su nombre y su peso
            if(Integer.parseInt(tabla[m][2]) > masAltura){
                masAltura = Integer.parseInt(tabla[m][2]);
                nombre = tabla[m][0];
                pesoAlto =tabla[m][1];

            }
            //compara cada uno de la tabla con el que menos peso tiene, si uno tiene menos peso que el anterior guardado guarda su nombre y su peso
            if(Double.parseDouble(tabla[m][2]) < menosAltura){
                menosAltura = Integer.parseInt(tabla[m][2]);
                nombre2 = tabla[m][0];
                pesoBajo = tabla[m][1];
            }
            
        }
        System.out.println("El alumno mas alto es "+nombre+" y mide "+masAltura);
        System.out.println("El alumno mas pequeño es "+nombre2+" y mide "+menosAltura);

        //el nombre del alumno y el valor del peso del alumno mas alto y mas bajo
        //con los datos recogidos en el apartado anterior lo podemos utilizar para esto
        System.out.println("El alumno mas alto es "+nombre+" mide "+masAltura+" y pesa "+pesoAlto);
        System.out.println("El alumno que menos mide es "+nombre2+" mide "+menosAltura+" y pesa "+pesoBajo);

        //los promedios de altura y peso
        //va sumando todos los valores de peso y altura de todas las personas introducidas y al final divide este valor por el numero de personas que ha contado
        double sumaPeso=0;
        int sumaAltura=0;
        int contador=0;
        for(int x=0; x<i;x++){
            sumaPeso += Double.parseDouble(tabla[x][1]);
            sumaAltura +=Integer.parseInt(tabla[x][2]);
            contador++;
        }
        double mediaPeso = sumaPeso/contador;
        double mediaAltura = sumaAltura/contador;

        System.out.println("La media de peso es: "+mediaPeso);
        System.out.println("La media de alura es: "+mediaAltura);

        //los nombres de todos los alumnos de la clase que estan por encima del promedio de la clase en peso
        //recorre todos los pesos de la clase y cuando una persona esta por encima de la media de peso ya calculada imprime su nombre
        System.out.println("PERSONAS POR ENCIMA DE LA MEDIA EN PESO");
        for(int x=0; x<i; x++){
            if(Double.parseDouble(tabla[x][1]) > mediaPeso ){
                System.out.println(tabla[x][0]);
            }
        }

        //los nombres de todos los alumnos de la clase que estan por debajo del promedio de la clase en altura
        //recorre todas las alturas de clase y cuando una persona esta por debajo de la media de altura ya calculada imprime su nombre
        System.out.println("PERSONAS POR DEBAJO DE LA MEDIA EN ALTURA");
        for(int x=0; x<i; x++){
            if(Integer.parseInt(tabla[x][2]) < mediaAltura){
                System.out.println(tabla[x][0]);
            }
        }
    }


    
    
}
