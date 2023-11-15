package Recursividade;

public class Fatorial {

    // Regra --> Fat(n) = n.Fat(n - 1)
    // Caso base --> n = 0 ou n = 1 => 1
    public static int Fat(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * Fat(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(Fat(numero));

    }
}
