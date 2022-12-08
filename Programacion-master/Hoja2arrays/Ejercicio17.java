package Hoja2arrays;
import java.util.*;
public class Ejercicio17{
    //funcion que busca si hay una mesa con 0 clientes
    public static boolean mesaLibre(int [] mesas){
        boolean resultado=false;
        int buscaMesa=0;
        while(buscaMesa < mesas.length && resultado ==false){
            if(mesas[buscaMesa]==0){
                resultado = true;
            }
            buscaMesa ++;
        }
        return resultado;
    }
    //funcion que metera el numero de clientes que se pidan en la mesa que digamos
    public static void rellenarMesa(int mesa, int clientes, int [] mesas){
        mesas[mesa] += clientes;
    }
    //funcion que busca si unos clientes caben en una mesa con otros clientes
    public static boolean cabenMesa(int [] mesas, int numClientes){
        boolean resultado = false;
        int buscaMesa=0;
        while(buscaMesa < mesas.length && resultado ==false){
            if(mesas[buscaMesa]+numClientes <= 4){
                resultado = true;
            }
            buscaMesa++;
        }
        return resultado;
    }
    //funcion que buscara el numero mesa en la primera mesa vacia que encuentre o en su defecto la mesa primera con clientes en la que quepan
    public static int sentarseMesa(int [] mesas, int clientes){
        int mesa=-1;
        boolean encontrado = false;
        if(mesaLibre(mesas)){
            while(mesa < mesas.length && encontrado == false){
                mesa++;
                if(mesas[mesa]==0){
                    encontrado = true;
                }
            }
        }else{
            while(mesa < mesas.length && encontrado == false){
                mesa++;
                if(mesas[mesa]+clientes<=4){
                    encontrado = true;
                }
            }  
        }
        return mesa;
    }
    //main
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] mesas = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Introduce el numero de clientes, o menor que 0 para parar el programa: ");
        int clientes = teclado.nextInt();
        int mesa=0;
        while(clientes>=0 && clientes < 5){
            if(mesaLibre(mesas)){
                mesa =sentarseMesa(mesas, clientes);
                rellenarMesa(mesa, clientes, mesas);
            }else if(cabenMesa(mesas, clientes)){
                mesa = sentarseMesa(mesas, clientes);
                rellenarMesa(mesa, clientes, mesas);
            }else
                System.out.println("No caben en ninguna mesa");
            for(int i = 0; i<mesas.length;i++){
                System.out.println("Mesa nº "+i+" nº Clientes "+mesas[i]);
            }
            System.out.println("Introduce el numero de clientes, o menor que 0 para parar el programa: ");
            clientes = teclado.nextInt();
        }
    }


}