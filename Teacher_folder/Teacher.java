package Teacher_folder;

import java.util.ArrayList;
import java.util.List;

import User_folder.*;

public class Teacher extends User {
    private final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastname){
        super(id, name, lastname);
    }

    public void getTeacherName() {
        System.out.println(getUsername() + " " + getLastname());
    }

    
}
