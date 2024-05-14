package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class D11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // soma dos quadrados de todos os numeros da lista

        Optional<Integer> test = numeros.stream()
                .map(n -> n * n)
                .reduce((n1, n2) -> (n1 + n2)); // Integer::sum

        System.out.println("A soma dos quadrados de todos os números é: " + test.get());
    }
}
