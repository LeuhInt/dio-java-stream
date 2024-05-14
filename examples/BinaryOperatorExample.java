import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> listNumeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somaNumeros = (num1, num2) -> num1 + num2;

        int soma = listNumeros.stream()
                .reduce(0, somaNumeros);

        int soma1 = listNumeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer n1, Integer n2) {
                        return n1 + n2;
                    }
                });

        int soma2 = listNumeros.stream()
                        .reduce(0, Integer::sum); // 0, (n1 + n2)

        System.out.println(soma);
        System.out.println(soma1);
        System.out.println(soma2);
    }
}
