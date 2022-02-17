package gb.homework9;

import java.util.ArrayList;
import java.util.List;

import static gb.homework9.StreamFunctions.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new StudentImpl("Марина Тестина", "Химия, Музыка, Математика"));
        students.add(new StudentImpl("Иван Тестов", "Химия, Физика"));
        students.add(new StudentImpl("Петр Петров", "Математика, Физика, Экономика, Астрономия"));
        students.add(new StudentImpl("Сергей Сергеев", "Математика"));
        students.add(new StudentImpl("Любовь Кузнецова", "Экономика"));
        students.add(new StudentImpl("Федор Федоров", "Музыка, Риторика"));
        students.add(new StudentImpl("Анна Аннова", "Химия, Математика, Физика, Астрономия"));

        System.out.println("Список студентов :");
        students.stream().forEach(System.out::println);

        System.out.println("Список всех курсов: " + uniqueCourses(students));

        System.out.println("Список всех курсов - через distinct: " + uniqueCoursesAlt(students));

        System.out.println("Самые любознательные: " + mostCurious(students));

        String courseTitle = "Астрономия";

        System.out.println("На курс " + courseTitle + " ходят студенты: " + goingToCourse(students,courseTitle));
    }
}
