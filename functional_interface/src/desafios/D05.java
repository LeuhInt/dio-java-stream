package desafios;

import java.util.List;
import java.util.Arrays;
import java.util.OptionalDouble;

public class D05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Média dos números maiores que 3
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 3)
                .mapToDouble(n -> n)
                .average();

        System.out.println("A média dos números é: " + media.getAsDouble());
    }
}
