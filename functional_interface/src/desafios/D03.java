package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class D03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Verifique se todos os números da lista são positivos
        boolean test = numeros.stream()
                .allMatch(n -> n >=0);

        System.out.println("Todos os números são positivos: " + test);
    }
}