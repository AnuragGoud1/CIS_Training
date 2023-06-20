import java.util.Arrays;
import java.util.Comparator;

public class ArrayAscending {
    public static void main(String[] args) {
        String[] strings = {"kishore", "ram", "jane", "Lohith", "blueberry"};

        Arrays.stream(strings)
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed()))
                .forEach(System.out::println);
    }
}
