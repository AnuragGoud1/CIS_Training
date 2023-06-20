import java.util.ArrayList;

public class LastobjectArray {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("Rav");
        arr.add("anu");
        arr.add("messi");
        arr.add("Kohli");
        arr.add("selena");

        arr.remove(arr.size()-1);
        for(String i: arr){
            System.out.println(i);
        }
    }
}
