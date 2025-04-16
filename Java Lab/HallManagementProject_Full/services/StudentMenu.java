package services;

import entity.Student;

public class StudentMenu {

    // Updates the profile details of a student
    public static void updateProfile(Student student, String name, String dept, String phone, String payment) {
        student.setName(name);          // Set new name
        student.setDepartment(dept);    // Set new department
        student.setPhone(phone);        // Set new phone number
        student.setPayment(payment);    // Set new payment status
    }

    // Changes the student's username and password
    public static void changeCredentials(Student student, String newUser, String newPass) {
        student.setUsername(newUser);   // Set new username
        student.setPassword(newPass);   // Set new password
    }
}
