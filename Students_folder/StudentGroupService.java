package Students_folder;

import java.util.ArrayList;
import java.util.List;

import Teacher_folder.Teacher;

public class StudentGroupService {
            public StudentGroup CreateGroup(Integer num, Teacher teacher, List<Student> students){
        ArrayList<Student> listStudent = new ArrayList<>();
        for (Student student: students){
            listStudent.add(student);
        }
        return new StudentGroup( teacher, num, listStudent);
    }
}
