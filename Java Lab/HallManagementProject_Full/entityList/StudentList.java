package entityList;

import entity.Student;
import java.util.ArrayList;

public class StudentList {

    // List to store all student objects
    private ArrayList<Student> students = new ArrayList<>();

    // Adds a new student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Removes a student from the list by their ID
    public boolean removeStudentById(int id) {
        // Loop through the list of students
        for (Student s : students) {
            // If student ID matches, remove and return true
            if (s.getId() == id) {
                students.remove(s);
                return true;
            }
        }
        // If no matching student found, return false
        return false;
    }

    // Searches for a student by ID and returns the student object
    public Student searchById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null; // Student not found
    }

    // Displays information of all students in the list
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student found.");
            return;
        }
        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Returns the entire list of students
    public ArrayList<Student> getAllStudents() {
        return students;
    }

    // Replaces the current list with a new list of students
    public void setAllStudents(ArrayList<Student> list) {
        this.students = list;
    }
}
