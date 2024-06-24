package Students_folder;

import User_folder.User;

public class Student extends User {
    int groupId;

    public Student(int id, String name, String lastName) {
        super(id, name, lastName);
        
    }
    public void getStudentName() {
        System.out.println(getUsername() + " " + getLastname());
    }
}
