package Recursividade;

public class Somar {

    // Regra --> Soma(n) = n + Soma(n - 1)
    // Caso base --> n == 0 => n
    public static int somar(int n){
        if(n == 0){
            return n;
        } else {
            return n + somar(n - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(somar(numero));
    }
}
