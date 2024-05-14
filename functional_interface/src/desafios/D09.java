package desafios;

import java.util.Arrays;
import java.util.List;

public class D09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verificar se todos os numeros da lista são distinct

        boolean test = numeros.stream()
                .distinct()
                .count() == numeros.size();

        System.out.println("Todos os números são distintos? " + test);
    }
}
