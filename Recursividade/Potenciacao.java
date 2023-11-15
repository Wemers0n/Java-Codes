package Recursividade;

public class Potenciacao {

    // Regra --> pot(a, n) = a.pot(a, n -1)
    // Caso base --> n = 0 => 1
    public static int Potencia(int a, int n){
        if(n == 0){
            return 1;
        } else {
            return a * Potencia(a, n - 1);
        }
    }
    public static void main(String[] args) {
        int base = 10;
        int expoente = 2;

        System.out.println(Potencia(base, expoente));
    }
}
