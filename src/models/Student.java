package models;

public class Student {
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String phoneNumber;
    public String gender;

    @Override
    public String toString() {
        return "Ученик " +
                firstName + " " + lastName +
                ", email: " + email +
                ", пароль: " + password +
                ", номер телефона: " + phoneNumber +
                ", пол: " + gender;
    }
}
