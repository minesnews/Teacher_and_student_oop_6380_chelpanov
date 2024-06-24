import Teacher_folder.Teacher;
import Students_folder.Student;
import Students_folder.StudentGroup;
import Students_folder.StudentGroupController;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Evgeniy", "Sidorov");
        Student student = new Student(1, "Ivan", "Ivanov");
        Student student2 = new Student(2, "Petr", "Petrov");

        student2.getStudentName();

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student2);

        StudentGroup studentGroup = new StudentGroup(teacher, 1, students);

        System.out.println(studentGroup.getStudentGroup());

        StudentGroupController controller = new StudentGroupController();
        
        Teacher teacher1 = new Teacher(2, "Vasiliy", "Vasiliev");
        Student student3 = new Student(3, "Nikita", "Nikitev");
        Student student4 = new Student(4, "Abdul", "Abdulov");

        List<Student> students1 = new ArrayList<Student>();
        students1.add(student3);
        students1.add(student4);

        StudentGroup sg = controller.CreateGroup(2, teacher1, students1);
        System.out.println(sg.getStudentGroup());

    }
}