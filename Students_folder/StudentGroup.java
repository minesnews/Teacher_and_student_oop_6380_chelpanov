package Students_folder;

import java.util.List;

import Teacher_folder.Teacher;

public class StudentGroup {

    private Teacher teacher;
    private Integer numberGroup;
    private List<Student> students;

    public StudentGroup( Teacher teacher, Integer numberGroup, List<Student> students ){
        this.teacher = teacher;
        this.numberGroup = numberGroup;
        this.students = students;
    }

    public String getStudentGroup(){
        return "Студенческая группа номер - " + numberGroup +
                ", преподаватель в группе - " + teacher +
                ", студенты в группе - " + students;
    }
}
