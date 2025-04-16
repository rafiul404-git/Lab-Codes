package services;

import java.util.Scanner;  // For reading input
import entity.Student;  // Ensure this import is added to your HomePage class.
import entityList.StudentList;  // To manage the list of students
import entityList.EmployeeList;  // To manage the list of employees
import entityList.RoomList;  // To manage the list of rooms
import fileIO.FileIO;  // For saving and loading data to/from files
import java.util.ArrayList;

public class HomePage {
    static final String STUDENT_FILE = "records/students.txt";
    static final String EMPLOYEE_FILE = "records/employees.txt";
    static final String ROOM_FILE = "records/rooms.txt";
    static final String NOTICE_FILE = "records/notices.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        EmployeeList employeeList = new EmployeeList();
        RoomList roomList = new RoomList();

        // Load the data
        studentList.setAllStudents(new ArrayList<>(FileIO.loadStudents(STUDENT_FILE)));
        employeeList.setAllEmployees(new ArrayList<>(FileIO.loadEmployees(EMPLOYEE_FILE)));
        roomList.setAllRooms(new ArrayList<>(FileIO.loadRooms(ROOM_FILE)));

        int choice;
        do {
            System.out.println("\n===== Welcome to Hall Management System =====");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. View Notice");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    // Admin Login - Treating employee as admin
                    AdminLogin.loginAndShowMenu(employeeList, studentList, roomList);
                }
                case 2 -> {
                    // Student Login
                    Student loggedStudent = UserLogin.login(studentList);
                    if (loggedStudent != null) {
                        UserLogin.studentMenu(loggedStudent, studentList);
                    } else {
                        System.out.println("Invalid Student Credentials!");
                    }
                }
                case 3 -> FileIO.viewNotices(NOTICE_FILE);
            }

            // Save updated data after each loop
            FileIO.saveStudents(studentList.getAllStudents(), STUDENT_FILE);
            FileIO.saveEmployees(employeeList.getAllEmployees(), EMPLOYEE_FILE);
            FileIO.saveRooms(roomList.getAllRooms(), ROOM_FILE);

        } while (choice != 4);

        System.out.println("Thank you for using the system. Goodbye!");
    }
}
