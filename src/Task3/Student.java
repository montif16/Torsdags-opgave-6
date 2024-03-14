package Task3;
import java.util.ArrayList;

public abstract class Student extends Person{
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }


    public boolean addCourse(ArrayList<String> currentCourses,ArrayList<String> passedCourses) {
        if (passedCourses.contains(currentCourses)){
            System.out.println("Can't add course, it has already been passed");
            return false;
        }
        return true;
    }
}
