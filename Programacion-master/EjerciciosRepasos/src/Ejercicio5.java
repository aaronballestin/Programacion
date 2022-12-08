public class Ejercicio5 {
    public static boolean iguales(int [] array){
        boolean resultado = true;
        for(int i = 1; i<array.length; i++){
            if(array[i]!=array[i-1]){
                resultado = false;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int [] lista ={9,9,9,9};
        if(iguales(lista)){
            System.out.println("Todos los numeros son iguales");
        }else   
            System.out.println("No son todos iguales");
    }
}
