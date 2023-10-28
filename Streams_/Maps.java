package Streams_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Maps {
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::println;
        Consumer<String> printStr = System.out::println;

        List<Integer> numberMap = Arrays.asList(1, 2, 3, 4);
        List<String> strMap = Arrays.asList("Teste");

        numberMap.stream().map(n -> n * 2).forEach(print);

        UnaryOperator<Integer> multiplicar = n -> n * 2;

        numberMap.stream()
                .map(multiplicar)
                .map(Integer::toBinaryString).forEach(printStr);

        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        strMap.stream().map(inverter).forEach(printStr);
    }
}
