public class ChildClassDog extends ParentClassAnimal {
     public String type;
     public int age;
    public int costPrice;

    public ChildClassDog(String category, String type, int age, int costPrice) {
        super(category);
        this.type = type;
        this.age = age;
        this.costPrice = costPrice;
    }
    public ChildClassDog( String type, int age, int costPrice) {
        super("Wild-dogs");
        this.type = type;
        this.age = age;
        this.costPrice = costPrice;
    }



}
