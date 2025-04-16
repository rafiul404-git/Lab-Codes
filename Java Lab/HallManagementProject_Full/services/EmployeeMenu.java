package services;

// Required imports for EmployeeMenu
import java.util.Scanner;  // For reading input
import entityList.EmployeeList;  // For accessing Employee data
import entityList.StudentList;  // For accessing Student data
import entityList.RoomList;  // For accessing Room data
import fileIO.FileIO;  // To save and load data from files
import entity.Employee;  // To handle Employee objects
import entity.Student;  // To handle Student objects
import entity.Room;  // To handle Room objects
import java.util.ArrayList;  // For managing dynamic collections (e.g., StudentList, EmployeeList)

public class EmployeeMenu {

    // Displays the employee menu and handles user interaction
    public static void show(StudentList studentList, EmployeeList employeeList, RoomList roomList) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student & Employee");
            System.out.println("4. Search Student & Employee by ID");
            System.out.println("5. View All Students & Employees");
            System.out.println("6. Add & Check Room");
            System.out.println("7. View Support Tickets");
            System.out.println("8. Change Username and Password (for yourself)");
            System.out.println("9. View Own Profile");
            System.out.println("10. Add Notice");
            System.out.println("11. Update Employee & Student Details");
            System.out.println("12. Logout");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    // Add Employee
                    System.out.print("Username: ");
                    String u = sc.next();
                    System.out.print("Password: ");
                    String p = sc.next();
                    sc.nextLine(); // Consume newline
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Designation: ");
                    String d = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("E-mail: ");
                    String mail = sc.nextLine();

                    Employee e = new Employee(u, p, n, id, d, phone, mail);
                    employeeList.addEmployee(e);
                    FileIO.saveEmployees(employeeList.getAllEmployees(), "records/employees.txt");
                }

                case 2 -> {
                    // Add Student
                    System.out.print("Username: ");
                    String u = sc.next();
                    System.out.print("Password: ");
                    String p = sc.next();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Dept: ");
                    String d = sc.nextLine();
                    System.out.print("Room No: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Payment: ");
                    String pay = sc.nextLine();
                    System.out.print("Phone: ");
                    String ph = sc.nextLine();

                    Student s = new Student(u, p, n, id, d, r, pay, ph);
                    studentList.addStudent(s);
                    FileIO.saveStudents(studentList.getAllStudents(), "records/students.txt");
                }

                case 3 -> {
                    // Remove Student or Employee
                    System.out.println("Choose who to remove:");
                    System.out.println("1. Remove Student");
                    System.out.println("2. Remove Employee");
                    System.out.print("Choice: ");
                    int type = sc.nextInt();
                    System.out.print("Enter ID to remove: ");
                    int id = sc.nextInt();

                    if (type == 1) {
                        if (studentList.removeStudentById(id)) {
                            System.out.println("Student Removed.");
                        } else {
                            System.out.println("Student not found.");
                        }
                    } else if (type == 2) {
                        if (employeeList.removeEmployeeById(id)) {
                            System.out.println("Employee Removed.");
                        } else {
                            System.out.println("Employee not found.");
                        }
                    }

                    FileIO.saveStudents(studentList.getAllStudents(), "records/students.txt");
                    FileIO.saveEmployees(employeeList.getAllEmployees(), "records/employees.txt");
                }

                case 4 -> {
                    // Search Student or Employee by ID
                    System.out.println("Choose who to search:");
                    System.out.println("1. Search Student");
                    System.out.println("2. Search Employee");
                    System.out.print("Choice: ");
                    int type = sc.nextInt();
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();

                    if (type == 1) {
                        Student s = studentList.searchById(id);
                        if (s != null) s.displayStudent();
                        else System.out.println("Student not found.");
                    } else if (type == 2) {
                        Employee e = employeeList.searchById(id);
                        if (e != null) e.displayEmployee();
                        else System.out.println("Employee not found.");
                    }
                }

                case 5 -> {
                    // View all students or employees
                    System.out.println("Choose what to view:");
                    System.out.println("1. View All Students");
                    System.out.println("2. View All Employees");
                    System.out.print("Choice: ");
                    int type = sc.nextInt();

                    if (type == 1) studentList.viewAllStudents();
                    else if (type == 2) employeeList.viewAllEmployees();
                }

                case 6 -> {
                    // Add or Check Room
                    System.out.println("1. Add Room");
                    System.out.println("2. Check Room Details");
                    System.out.print("Choice: ");
                    int roomChoice = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    if (roomChoice == 1) {
                        System.out.print("Room Number: ");
                        int roomNumber = sc.nextInt(); sc.nextLine();
                        System.out.print("Table: ");
                        String table = sc.nextLine();
                        System.out.print("Chair: ");
                        String chair = sc.nextLine();
                        System.out.print("Bed: ");
                        String bed = sc.nextLine();
                        System.out.print("Fan/Light: ");
                        String fan = sc.nextLine();

                        Room room = new Room();
                        room.setSeat(roomNumber);  // Treated as room number
                        room.setTable(table);
                        room.setChair(chair);
                        room.setBed(bed);
                        room.setFanlight(fan);
                        roomList.addRoom(room);
                        FileIO.saveRooms(roomList.getAllRooms(), "records/rooms.txt");
                    } else if (roomChoice == 2) {
                        roomList.viewAllRooms();
                    }
                }

                case 7 -> FileIO.viewTickets("records/tickets.txt"); // View support tickets

                case 8 -> {
                    // Change admin credentials
                    sc.nextLine();
                    System.out.print("New username: ");
                    AdminLogin.adminUser = sc.nextLine();
                    System.out.print("New password: ");
                    AdminLogin.adminPass = sc.nextLine();
                }

                case 9 -> {
                    // View own (admin) profile
                    System.out.println("Employee Name: Admin");
                    System.out.println("Phone: N/A");
                    System.out.println("Email: N/A");
                }

                case 10 -> {
                    // Add a new notice
                    sc.nextLine();
                    System.out.print("Enter notice text: ");
                    String notice = sc.nextLine();
                    System.out.print("Enter the date for the notice (e.g., 2023-06-25): ");
                    String date = sc.nextLine();
                    String fullNotice = "Date: " + date + " - " + notice;
                    FileIO.saveNotice(fullNotice, "records/notices.txt");
                    System.out.println("Notice added or updated successfully!");
                }

                case 11 -> {
                    // Update student or employee details
                    System.out.println("1. Update Student");
                    System.out.println("2. Update Employee");
                    System.out.print("Choice: ");
                    int updateChoice = sc.nextInt();

                    if (updateChoice == 1) {
                        System.out.print("Enter Student ID: ");
                        int studentId = sc.nextInt();
                        Student student = studentList.searchById(studentId);
                        if (student != null) {
                            System.out.print("New Name: ");
                            sc.nextLine();
                            String newName = sc.nextLine();
                            System.out.print("New Department: ");
                            String newDept = sc.nextLine();
                            System.out.print("New Phone: ");
                            String newPhone = sc.nextLine();
                            System.out.print("New Payment: ");
                            String newPayment = sc.nextLine();

                            StudentMenu.updateProfile(student, newName, newDept, newPhone, newPayment);
                            System.out.println("Student details updated.");
                            FileIO.saveStudents(studentList.getAllStudents(), "records/students.txt");
                        } else {
                            System.out.println("Student not found.");
                        }
                    } else if (updateChoice == 2) {
                        System.out.print("Enter Employee ID: ");
                        int empId = sc.nextInt();
                        Employee emp = employeeList.searchById(empId);
                        if (emp != null) {
                            System.out.print("New Name: ");
                            sc.nextLine();
                            String newName = sc.nextLine();
                            System.out.print("New Designation: ");
                            String newDesignation = sc.nextLine();

                            emp.setName(newName);
                            emp.setDesignation(newDesignation);
                            System.out.println("Employee details updated.");
                            FileIO.saveEmployees(employeeList.getAllEmployees(), "records/employees.txt");
                        } else {
                            System.out.println("Employee not found.");
                        }
                    }
                }
            }

        } while (choice != 12);  // Repeat until logout
    }
}
