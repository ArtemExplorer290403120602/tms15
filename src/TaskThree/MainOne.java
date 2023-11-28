package TaskThree;

import java.util.ArrayList;
import java.util.List;

import static TaskThree.Student.StudentManagement.printStudents;
import static TaskThree.Student.StudentManagement.removeLowPerformingStudents;

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе.
public class MainOne {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Group A", 1, List.of(5, 4, 3)));
        students.add(new Student("Jane", "Group B", 2, List.of(4, 3, 2)));
        students.add(new Student("Mike", "Group C", 1, List.of(4, 3, 4)));

        removeLowPerformingStudents(students);
        printStudents(students, 1);
    }
}
