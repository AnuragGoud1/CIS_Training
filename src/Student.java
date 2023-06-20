import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    public  String firstName;
    public String lastName;
    public double GPA;
    double averageGPA=0;
    double sumofGPA=0;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public double findAvgGPA(ArrayList<Student> students){

        for(Student s: students){
            sumofGPA=sumofGPA+ s.getGPA();
        }
        averageGPA = sumofGPA/students.size();
        return averageGPA;
    }
    public void removeStudentsIfLessThanAvgGPA(ArrayList<Student> students, double averageGPA) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getGPA() < averageGPA) {
                iterator.remove();
            }
        }
    }



}
