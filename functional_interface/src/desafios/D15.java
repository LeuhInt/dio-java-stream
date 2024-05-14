package desafios;

import java.util.Arrays;
import java.util.List;

public class D15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //pelo menos um numero negativo

        boolean test = numeros.stream()
                .anyMatch(n -> n < 0);

        System.out.println("Existe algum número negativo: " + test);
    }
}
