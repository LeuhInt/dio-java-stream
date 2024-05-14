package desafios;

import java.util.Arrays;
import java.util.List;

public class D17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //numeros primos

        numeros.stream()
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);
    }
}
