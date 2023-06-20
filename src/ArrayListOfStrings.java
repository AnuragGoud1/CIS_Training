import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListOfStrings {
    public static void main(String[] args) {
        String[] stringArray;
        ArrayList<String>  stringArrayList = new ArrayList<>();
        stringArrayList.add("Messi");
        stringArrayList.add("Ronaldo");
        stringArrayList.add("Neymar Jr");
        stringArrayList.add("Mbappe");
        stringArrayList.add("Benzema");
        stringArrayList.add("Haaland");

        stringArray= stringArrayList.toArray( new String[stringArrayList.size()]);

        Iterator<String> iterator = Arrays.stream(stringArray).iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
