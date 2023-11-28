package TaskThree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public class StudentManagement {
        public static void removeLowPerformingStudents(List<Student> students) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                double averageGrade = calculateAverageGrade(student.getGrades());
                if (averageGrade < 3) {
                    iterator.remove();
                } else {
                    student.course++;
                }
            }
        }

        private static double calculateAverageGrade(List<Integer> grades) {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }

        public static void printStudents(List<Student> students, int course) {
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
}
