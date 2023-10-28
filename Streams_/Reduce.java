package Streams_;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int result = nums.stream().reduce(100, soma);
        System.out.println(result);

        nums.stream().reduce(soma).ifPresent(System.out::println);

        nums.stream().reduce((ac, n) -> ac + n).ifPresent(System.out::println);
    }
}
