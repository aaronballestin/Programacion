public class Fibonacci {
    public static int fibonacci(int num){
        int resultado=0;;
        if(num==0){
            resultado = 0;
        }else if(num ==1){
            resultado = 1;
        }else{
            resultado = fibonacci(num-1)+fibonacci(num-2);
        }
        return resultado;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
