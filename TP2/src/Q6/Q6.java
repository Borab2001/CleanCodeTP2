package Q6;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Q6 {

    public static <T> void buildAnything(Supplier<T> supplier, Consumer<T> consumer, Consumer<Exception> exceptionConsumer) {
        try {
            T value = supplier.get();
            consumer.accept(value);
        } catch (Exception ex) {
            exceptionConsumer.accept(ex);
        }
    }

    public static void main(String[] args) {
        Q6.buildAnything(
                () -> 42,
                System.out::println,
                ex -> System.err.println("An error occurred: " + ex.getMessage())
        );
    }
}