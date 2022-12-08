public class Ejercicio4 {
  public static int[]  paresMenoresQue(int numero){
    int []paresMenores;
    paresMenores = new int [numero/2];
    if(numero >= 2){
        int par = 2;
        for(int i = 0; par<=numero; i++){
            paresMenores[i]= par;
            par += 2;
        }
    }
    return paresMenores;
  }
  
  public static void main(String[] args) {
    int numero = 7;
    int paresMenores[];
    paresMenores = new int [numero/2+1];
    paresMenores = paresMenoresQue(numero);
    for(int i=0;i<paresMenores.length;i++){
        System.out.print(paresMenores[i]+" ");
    }
  } 
}
