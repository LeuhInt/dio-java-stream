package desafios;

import java.util.Arrays;
import java.util.List;

public class D16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Agrupar numero em pares e ímpares

        List<Integer> numPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> numImpares = numeros.stream()
                .filter(n -> n % 2 == 1)
                .toList();

        System.out.println("Numeros pares: " + numPares);
        System.out.println("Numeros impares: " + numImpares);
    }
}
