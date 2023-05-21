package q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.*;

public class Q4 {

    public static void main(String[] args) {

        StartWithGreg myNameChecker = name -> Objects.equals(name, "BOBO");
        System.out.println("Test for BOBO: " + myNameChecker.checkName("BOBO"));
        System.out.println("Test for Bora: " + myNameChecker.checkName("Bora"));

        Predicate<String> myPredicateNameChecker = name -> Objects.equals(name, "BOBO");
        System.out.println("Test for BOBO: " + myPredicateNameChecker.test("BOBO"));
        System.out.println("Test for Bora: " + myPredicateNameChecker.test("Bora"));

        GenerateRandomNumber myNumberGenerator = () -> (int) (Math.random() * 101);
        System.out.println("Randoms from @FunctionalInterface");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Random number " + i + ": " + myNumberGenerator.create());
        }

        Supplier<Integer> mySupplierRandomGenerator = () -> (int) (Math.random() * 101);
        System.out.println("Randoms from Supplier");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Random number " + i + ": " + mySupplierRandomGenerator.get());
        }

        List<Integer> intList = initializeIntegerList(10, mySupplierRandomGenerator);
        System.out.println("Initialized Integer List: " + intList);

        List<Character> charList = initializeList(5, () -> (char) (Math.random() * 26 + 'a'));
        System.out.println("Initialized Character List: " + charList);

        Consumer<String> welcomeMessage = name -> System.out.println("Welcome " + name + "!");
        welcomeMessage.accept("Bob");

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello World': " + stringLength.apply("Hello World"));

        BiFunction<Integer, Integer, Double> powerFunction = (num, pow) -> Math.pow(num, pow);
        System.out.println("5 to the power of 3: " + powerFunction.apply(5, 3));
    }

    public static List<Integer> initializeIntegerList(int size, Supplier<Integer> supplier) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static <T> List<T> initializeList(int size, Supplier<T> supplier) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    public static void printWelcomeMessage(String name) {
        Consumer<String> consumer = s -> System.out.println("Welcome " + s + "!");
        consumer.accept(name);
    }

    public static int calculateStringLength(String str) {
        Function<String, Integer> lengthFunction = s -> s.length();
        return lengthFunction.apply(str);
    }

    public static double calculatePower(int x, int y) {
        BiFunction<Integer, Integer, Double> myPowerFunction = (a, b) -> Math.pow(a, b);
        return myPowerFunction.apply(x, y);
    }

    public static void main(String[] args) {
        StartWithGreg myNameChecker = name -> Objects.equals(name, "BOBO");
        System.out.println("Test for BOBO: " + myNameChecker.checkName("BOBO"));
        System.out.println("Test for Bora: " + myNameChecker.checkName("Bora"));

        // Check name with Predicate functional interface
        Predicate<String> myPredicateNameChecker = name -> Objects.equals(name, "BOBO");
        System.out.println("Test for BOBO: " + myPredicateNameChecker.test("BOBO"));
        System.out.println("Test for Bora: " + myPredicateNameChecker.test("Bora"));

        GenerateRandomNumber myNumberGenerator = () -> (int) (Math.random() * 101);
        System.out.println("Random numbers from GenerateRandomNumber functional interface");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Random number " + i + ": " + myNumberGenerator.create());
        }

        Supplier<Integer> mySupplierRandomGenerator = () -> (int) (Math.random() * 101);
        System.out.println("Random numbers from Supplier functional interface");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Random number " + i + ": " + mySupplierRandomGenerator.get());
        }
    }
    // À finir
}