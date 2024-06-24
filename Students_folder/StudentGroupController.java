package Students_folder;

import java.util.List;

import Teacher_folder.Teacher;
import User_folder.User;

public class StudentGroupController {
        public StudentGroupService studyGroupService = new StudentGroupService();
        public Teacher teacher;
        public Student student;
        public User user;
    public StudentGroup CreateGroup(Integer num, Teacher teacher1, List<Student> students){
        
        return studyGroupService.CreateGroup( num, teacher1, students);
    }

    public void getTeacherNameAndID(){
        teacher.getTeacherName();
        System.out.println("\n");
        System.out.println(teacher.getId());
    }

    public void getStudentNameAndID(){
        student.getStudentName();
        System.out.println("\n");
        System.out.println(student.getId());
    }



}
