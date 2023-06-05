public class StaticExample {

    public static int age;
    public static int getAgeValue(){
        return 26;
    }
    static {
        age = getAgeValue();
    }
}
