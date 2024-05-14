import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printNumberPar = numerosPar -> {
            if (numerosPar % 2 == 0) {
                System.out.println(numerosPar);
            }
        };

        listNumber.stream().forEach(printNumberPar);

        listNumber.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0) {
                    System.out.println(integer);
                }
            }
        });

        listNumber.forEach(integer -> {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        });

        listNumber.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
    }
}
