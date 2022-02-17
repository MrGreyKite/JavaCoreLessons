package gb.homework9;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFunctions {

    static Set<String> uniqueCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .map(course -> course.toString())
                .collect(Collectors.toSet());
    }

    //альтернативынй метод создания выборки уникальных значений
    static List<String> uniqueCoursesAlt(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .map(course -> course.toString())
                .distinct()
                .collect(Collectors.toList());
    }

    static List<Student> mostCurious(List<Student> students) {
        return students.stream()
                .sorted((student1, student2) -> Integer.compare(student2.getAllCourses().size(), student1.getAllCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
    }

    static List<Student> goingToCourse(List<Student> students, String courseTitle) {
        return students.stream()
                .filter(student -> student.getAllCourses().toString().contains(courseTitle))
                .collect(Collectors.toList());
    }

}

