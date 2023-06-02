public class RunTimePolymorphismChildClass extends RunTimePolymorphismParentClass {

    @Override
    public int addition(int x, int y) {
        return super.addition(x, y);
    }

    public static void main(String[] args) {
        RunTimePolymorphismParentClass rpm = new RunTimePolymorphismParentClass();
        int a =rpm.addition(8,20);
        RunTimePolymorphismParentClass rpm2= new RunTimePolymorphismChildClass();
        int b = rpm2.addition(20,25);
        System.out.println(a +" "+b);

    }
}
