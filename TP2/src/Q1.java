import java.util.Optional;

public class Q1 {

    public static void main(String[] args) {
        Optional<String> myFirstOptionalString = Optional.empty();
        System.out.println(myFirstOptionalString);
        if (myFirstOptionalString.isPresent()) {
            System.out.println(myFirstOptionalString.get());
        }
        if (myFirstOptionalString.isEmpty()) {
            System.out.println("myFirstOptionalString is empty");
        }
        System.out.println(myFirstOptionalString.isEmpty());

        Optional<String> mySecondOptionalString = Optional.of("My Second Optional String");
        System.out.println(mySecondOptionalString);
        System.out.println(mySecondOptionalString.get());
        mySecondOptionalString.ifPresent(name -> System.out.println(name));

        // Utilisation de Optional.orElse()
        String defaultString = myFirstOptionalString.orElse("Default Value");
        System.out.println(defaultString);

        // Utilisation de Optional.orElseGet()
        String secondDefaultString = myFirstOptionalString.orElseGet(() -> "Default Value from Supplier");
        System.out.println(secondDefaultString);

        // Utilisation de Optional.filter()
        Optional<String> filteredOptional = mySecondOptionalString.filter(name -> name.contains("Second"));
        System.out.println(filteredOptional);

        // Utilisation de Optional.map()
        Optional<Integer> lengthOptional = mySecondOptionalString.map(String::length);
        System.out.println(lengthOptional);

        // Utilisation de Optional.flatMap()
        Optional<String> flatMappedOptional = mySecondOptionalString.flatMap(name -> Optional.of(name.toUpperCase()));
        System.out.println(flatMappedOptional);
    }
}
