import java.util.Arrays;
import java.util.Comparator;

public class ArrayStreams {
    public static void main(String[] args) {
        String[] strings = {"virat", "rohith", "dhoni", "vijay"};

        Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
