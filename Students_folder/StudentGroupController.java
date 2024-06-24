package Students_folder;

import java.util.List;

import Teacher_folder.Teacher;

public class StudentGroupController {
        public StudentGroupService studyGroupService = new StudentGroupService();
        public Teacher teacher;
        public Student student;
    public StudentGroup CreateGroup(Integer num, Teacher teacher1, List<Student> students){
        
        return studyGroupService.CreateGroup( num, teacher1, students);
    }

    public void getTeacherName(){
        teacher.getTeacherName();
    }

    public void getStudentName(){
        student.getStudentName();
    }



}
