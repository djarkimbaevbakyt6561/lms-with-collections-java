import models.Instructor;
import models.Lesson;
import models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {
    private static final Scanner scanner = new Scanner(System.in);
    String groupName;
    String description;
    List<Lesson> lessons = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Instructor> instructors = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteInstructor(String email) {
        for (Instructor instructor : instructors) {
            if (instructor.email.equals(email)) {
                instructors.remove(instructor);
                break;
            }
        }
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void deleteStudent(String email) {
        for (Student student : students) {
            if (student.email.equals(email)) {
                students.remove(student);
                break;
            }
        }
    }

    public void deleteLesson(Lesson lesson) {
        lessons.remove(lesson);
    }

    private static String inputString(String prompt) {
        System.out.print(prompt);
        String returnText;
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                System.out.println("Значение не должно быть пустым!");
            } else {
                returnText = text;
                break;
            }
        }
        return returnText;
    }

    public static Group createGroup(DataBase dataBase) {
        Group newGroup = new Group();
        boolean found = false;
        while (true) {
            String groupName = inputString("Введите название группы: ");
            for (Group group : dataBase.groups) {
                if (group.groupName.equals(groupName)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newGroup.groupName = groupName;
                newGroup.description = inputString("Введите описание группы: ");
                break;
            } else {
                System.out.println("Группа с таким названием уже существует!");
            }
        }
        return newGroup;

    }

    @Override
    public String toString() {
        return "Группа " +
                groupName +
                ", Oписание: " + description +
                ", Уроки: " + lessons +
                ", Студенты: " + students +
                ", Инструктора: " + instructors;
    }
}
