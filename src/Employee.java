public class Employee implements Domain, Company {

    private String name;
    private int age;

    public Employee(String name, int age, String companyName, String domain) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.domain = domain;
    }

    private String companyName;
    private String domain;

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getDomainName() {
        return domain;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Devi", 25,"OPTUM","HealthCare");

    }
}
