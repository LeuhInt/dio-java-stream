package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class D19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //soma dos números divisiveis por 3 e por 5

       Optional<Integer> soma = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce((n1, n2) -> n1 + n2); //Integer::sum

        System.out.println("A soma dos números divisiveis por 3 e 5: " + soma.get());
    }
}
