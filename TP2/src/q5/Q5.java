package q5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        List<String> phoneNumbers = List.of(
                "0626820882",
                "0766647521",
                "0176420702",
                "+33719368632",
                "+33619368632",
                "+33656297793",
                "+33600000001",
                "+24058641339"
        );
        //Predicate<String> isFrenchNumber = phoneNumber -> phoneNumber.startsWith("+33");
        List<String> internationalFrenchMobilePhone = phoneNumbers
                .stream()
                .filter(phone -> !Objects.equals(phone,null))
                .filter(phone -> phone.startsWith("+33"))
                .filter(phone -> phone.startsWith("+336"))
                .distinct()
                .sorted()
                .peek(phone -> System.out.println(phone))
                .toList();

        List<Integer> internationalFrenchMobilePhone1 = phoneNumbers
                .stream()
                .filter(phone -> !Objects.equals(phone,null))
                .filter(phone -> phone.startsWith("+33"))
                .filter(phone -> phone.startsWith("+336"))
                .distinct()
                .map(phone -> phone.length())
                .peek(phone -> System.out.println(phone))
                .toList();





        // Students
        List<Student> students = Arrays.asList(
                new Student("Antoine", 13),
                new Student("Bora", 20),
                new Student("Charlotte", 17),
                new Student("Damien", 11),
                new Student("Eve", 18)
        );

        List<Student> sortedStudents = students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()))
                .collect(Collectors.toList());
        System.out.println("Sorted students: " + sortedStudents);
    }
}
