package Lambdas_;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = numero -> numero + 2;

        System.out.println(maisDois.apply(2));
    }
}
