package gb.homework9;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements Student {
    private String name;
    private List<Course> courses;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Course> getAllCourses() {
        return this.courses;
    }

    public StudentImpl(String name, String courses) {
        this.name = name;
        this.courses = new ArrayList<>();
        for (String i : courses.split(", ")) {
            this.courses.add(new CourseImpl(i));
        }
    }

    @Override
    public String toString() {
        return "Студент " + name + ", посещает курсы = " + courses;
    }
}
