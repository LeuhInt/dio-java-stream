package examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> mensage = () -> "Hello World";

        List<String> listMensagens = Stream.generate(mensage)
                .limit(5)
                .toList();

        List<String> listMensagens2 = Stream.generate(
                        new Supplier<String>() {

                            @Override
                            public String get() {
                                return "Hello 2";
                            }
                        }
                )
                .limit(5)
                .toList();

        List<String> listMensagens3 = Stream.generate(() -> "Hello 3")
                .limit(5)
                .toList();

        listMensagens.forEach(System.out::println);
        listMensagens2.forEach(System.out::println);
        listMensagens3.forEach(System.out::println);
    }
}
