package models;

public class Lesson {
    public String lessonName;
    public String taskDescription;

    @Override
    public String toString() {
        return "Урок " + lessonName +
                ", oписание задачи: " + taskDescription;
    }
}
