package Streams_;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MostrandoValores {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Nome1", "Nome2", "Nome3");

        for (String string : nomes) { // Usando foreach
            System.out.println(string);
        }

        Iterator<String> iterator = nomes.iterator(); // Usando Iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Stream<String> streams = nomes.stream(); // Usando Streams
        streams.forEach(System.out::println); // Laco interno

    }
}
