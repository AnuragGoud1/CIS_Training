import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageSquares {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8,13,15,8};

       double avg = Arrays.stream(arr).filter(e->e%2==1).mapToDouble(e->e*e).average().orElse(0);
        System.out.println(avg);
    }
}
