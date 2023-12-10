import enums.Roles;
import models.Instructor;
import models.Lesson;
import models.Student;

import java.util.*;

public class DataBase {
    List<Group> groups = new ArrayList<>();
    List<User> users = new LinkedList<>(List.of(new User("Bolot", "Sultanich", "admin@gmail.com", "admin123", "0707109090", "male", Roles.ADMIN)));
    List<Student> allStudents = new ArrayList<>();
    Set<Lesson> allLessons = new HashSet<>();
    List<Instructor> allInstructors = new ArrayList<>();

    public void addUser(User registerUser) {
        users.add(registerUser);
    }
    public void addGroup(Group group) {
        groups.add(group);
    }
    public void addLesson(Lesson lesson) {
        allLessons.add(lesson);
    }

    public void addStudentToAllStudents(Student student) {
        allStudents.add(student);
    }

    public void addInstructor(Instructor instructor) {
        allInstructors.add(instructor);
    }

    public void deleteGroup(Group group) {
       groups.remove(group);
    }

    public void deleteInstructor(String email) {
        for (Instructor instructor : allInstructors) {
            if (instructor.email.equals(email)) {
                allInstructors.remove(instructor);
                break;
            }
        }
    }

    public void deleteUser(String email) {
        for (User user : users) {
            if (user.email.equals(email)) {
                users.remove(user);
                break;
            }
        }
    }

    public void deleteStudent(String email) {
        for (Student student : allStudents) {
            if (student.email.equals(email)) {
                allStudents.remove(student);
                break;
            }
        }
    }

    public void deleteLesson(Lesson lesson) {
      allLessons.remove(lesson);
    }
}
