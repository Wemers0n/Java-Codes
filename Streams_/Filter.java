package Streams_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas(0, "Pedro", 10);
        Pessoas p2 = new Pessoas(1, "Joao", 21);
        Pessoas p3 = new Pessoas(2, "Bia", 22);
        Pessoas p4 = new Pessoas(3, "Lia", 19);
        Pessoas p5 = new Pessoas(4, "Lucas", 17);
        Pessoas p6 = new Pessoas(5, "Maria", 19);

        List<Pessoas> listPessoas = Arrays.asList(p1, p2, p3, p4, p5, p6);

        listPessoas.stream().filter(a -> a.idade >= 18)
                .map(a -> "Maiores de 18 anos => " + a.nome)
                .forEach(System.out::println);
    }
}
