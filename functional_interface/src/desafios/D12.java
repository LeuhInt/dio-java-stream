package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class D12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Produto de todos os numeros da lista

        Optional<Integer> test = numeros.stream()
                .reduce((n1, n2) -> n1 * n2);

        System.out.println("O produto de todos os números é: " + test.get());
    }
}
