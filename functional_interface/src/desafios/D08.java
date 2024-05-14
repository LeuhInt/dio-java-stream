package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class D08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Somar os dígitos de todos os números da lista

        Optional<Integer> soma = numeros.stream()
                .reduce(Integer::sum);

        System.out.println("A soma de todos os números: " + soma.get());
    }
}
