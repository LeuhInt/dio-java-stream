package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Maria", "jose", "Leonard", "Pedro");

        Predicate<String> palavras5 = palavra -> palavra.length() >= 5;
        palavras.stream()
                .filter(palavras5)
                .forEach(System.out::println);

        palavras.stream()
                .filter(new Predicate<String>() {

                    @Override
                    public boolean test(String p) {
                        return p.length() >= 5;
                    }
                })
                .forEach(System.out::println);

        palavras.stream()
                .filter(p -> p.length() >= 5)
                .forEach(System.out::println);

    }
}
