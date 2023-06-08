import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {

    private String AccountHolderName;
    private int AccountNo;
    private String AccountBank;
    private String AccountType;
    private int Balance;
    private String City;




    public Account(String accountHolderName, int accountNo, String accountBank, String accountType, int balance, String city) {
        AccountHolderName = accountHolderName;
        AccountNo = accountNo;
        AccountBank = accountBank;
        AccountType = accountType;
        Balance = balance;
        City = city;
    }
    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public String getAccountBank() {
        return AccountBank;
    }

    public void setAccountBank(String accountBank) {
        AccountBank = accountBank;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Account Details: {" +
                "AccountHolderName='" + AccountHolderName + '\'' +
                ", AccountNo=" + AccountNo +
                ", AccountBank='" + AccountBank + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", Balance=" + Balance +
                ", City='" + City + '\'' +
                '}';
    }


    public static class Student implements Comparable<Student> {
        private String firstName;
        private String lastName;
        private double gpa;
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }



        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }



        @Override
        public int compareTo(Student other) {
            return this.lastName.compareTo(other.lastName);
        }

        public static void main(String[] args) {
            String csvFile = "students.csv";
            String line;
            String csvSplitBy = ",";

            List<Student> students = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    String firstName = data[0].trim();
                    String lastName = data[1].trim();
                    double gpa = Double.parseDouble(data[2].trim());

                    Student student = new Student(firstName, lastName, gpa);
                    students.add(student);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Sort the list of students based on last name
            Collections.sort(students);

            // Print the sorted student data
            for (Student student : students) {
                System.out.println(student.getLastName() + ", " + student.getFirstName() + ", " + student.getGpa());
            }
        }
    }
}
