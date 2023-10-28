package Streams_;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

  
        String[] nomes = {"Joao", "Pedro", "Maria"};
        Stream.of(nomes).forEach(print);

        Stream<String> langs = Stream.of("Java", "Pyhton", "Js");
        langs.forEach(print);
        
        Arrays.stream(nomes, 0, 3).forEach(print);
    }
}
