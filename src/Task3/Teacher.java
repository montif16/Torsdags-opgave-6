package Task3;

import java.util.ArrayList;

public abstract class Teacher extends Person{
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();


    public Teacher(String name,ArrayList<String> thing) {
        super(name);
        this.canTeach = thing;
    }


    public boolean addCourse(ArrayList<String> canTeach,ArrayList<String> currentCourses) {
        return this.canTeach.contains(currentCourses);
    }
}
