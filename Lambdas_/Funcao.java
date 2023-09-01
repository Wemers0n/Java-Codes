package Lambdas_;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> complemeto = strLetras -> parOuImpar + "!!!";

        System.out.println(parOuImpar.andThen(complemeto).apply(10));
    }
}
