package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> listNumeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = listNumeros.stream()
                .map(dobrar)
                .toList();

        List<Integer> numeros2 = listNumeros.stream()
                .map(new Function<Integer, Integer>() {

                    @Override
                    public Integer apply(Integer integer) {
                        return integer * 2;
                    }
                }).toList();

        List<Integer> numero3 = listNumeros.stream()
                .map(n -> n * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
        numeros2.forEach(System.out::println);
        numero3.forEach(System.out::println);
    }
}
