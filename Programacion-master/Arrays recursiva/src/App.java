public class App {
    public static void main(String[] args) throws Exception {
        //rellena una lista y la muestra por pantalla
        int [] lista;
        lista = new int[10];
        rellenarArray(lista, 0);
        mostrarArray(lista, 0);
        System.out.println();
        //rellena una matriz y la muestra por pantalla
        int [][] matriz;
        matriz = new int[5][5];
        rellenarMatriz(matriz, 0, 0);
        mostrarMatriz(matriz, 0, 0);
    }
    //rellena una lista con el numero de fila que tiene
    public static void rellenarArray(int[] array, int fila ){
        if(fila == array.length -1)
         array[fila]=fila;
         else {
            array[fila]=fila;
            rellenarArray(array, fila+1);
         }
    }
    //muestra por pantalla una lista
    public static void mostrarArray(int[] array, int fila){
        if(fila == array.length -1)
         System.out.print(array[fila]+" ");
         else {
            System.out.print(array[fila]+" ");
            mostrarArray(array, fila+1);
         }
    }
    //rellena por una matriz con el numero de fila que le corresponde * 10 + la columna que le corresponde
    public static void rellenarMatriz(int [][] matriz, int fila, int columna){
        if(fila == matriz.length - 1 && columna == matriz[fila].length-1){
            matriz[fila][columna] = fila*10+columna;
        }else if(columna == matriz[fila].length-1){
            matriz[fila][columna] = fila*10+columna;
            rellenarMatriz(matriz, fila+1, 0);
        }else{
            matriz[fila][columna] = fila*10+columna;
            rellenarMatriz(matriz, fila, columna+1);
        }
    }
    //muestra por pantalla una matriz
    public static void mostrarMatriz(int [][] matriz, int fila, int columna){
        if(fila == matriz.length - 1 && columna == matriz[fila].length-1){
            System.out.print(matriz[fila][columna]+" ");
        }else if(columna == matriz[fila].length-1){
            System.out.print(matriz[fila][columna]+" ");
            System.out.println();
            mostrarMatriz(matriz, fila+1, 0);
        }else{
            System.out.print(matriz[fila][columna]+" ");
            mostrarMatriz(matriz, fila, columna+1);
        }
    }
}
