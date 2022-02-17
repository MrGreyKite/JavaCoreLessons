package gb.homework9;

public class CourseImpl implements Course {
    String title;

    public CourseImpl(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

}
