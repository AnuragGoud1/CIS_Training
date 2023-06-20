import java.util.ArrayList;

public class StudentController {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        double avg = 0;

        Student s1 = new Student("Anurag","Panjala",4.0);
        Student s2 = new Student("Roshan", "Shetty", 3.5);
        Student s3 = new Student("Mahesh", "Babu", 3.9);
        Student s4 = new Student("Tony", "Stark", 2.1);
        Student s5 = new Student("Lionel Messi", "Panjala", 3.2);
        Student s6 = new Student("Justin", "Bieber", 2.5);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        avg = s1.findAvgGPA(students);
        System.out.println("Average:" + avg);
       s1.removeStudentsIfLessThanAvgGPA(students, avg);
        for(Student student: students){
            System.out.println(student);
        }
    }
}
