package desafios;

import java.util.Arrays;
import java.util.List;

public class D02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Imprima a soma dos números pares da lista
        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("A soma dos números pares é: " + soma);
    }
}
