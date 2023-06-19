import java.util.Arrays;
import java.util.Comparator;

public class ArrayVowelsandCount {
        public static void main(String[] args) {
            String[] strings = {"hello", "world", "java", "programming"};

            Arrays.stream(strings)
                    .filter(s -> countVowels(s) > 0)
                    .forEach(s -> System.out.println("String: " + s + ", Vowel Count: " + countVowels(s)));
        }

        public static int countVowels(String str) {
            str = str.toLowerCase();
            long count = str.chars()
                    .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    .count();
            return (int) count;
        }
    }

