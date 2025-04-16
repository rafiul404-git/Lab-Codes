package services;

// Required imports for UserLogin
import java.util.Scanner;  // For reading input
import entityList.StudentList;  // To manage and access Student data
import entity.Student;  // To access individual Student data
import fileIO.FileIO;  // For loading data (students in this case)


public class UserLogin implements LoginInterface {
    // Optional: maintain a static reference to StudentList, if needed
    private static StudentList staticList;

    @Override
    public boolean login(String username, String password) {
        if (staticList == null) return false;
        for (Student s : staticList.getAllStudents()) {
            if (s.getUsername().equals(username) && s.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Original login method
    public static Student login(StudentList list) {
        staticList = list;
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();
        for (Student s : list.getAllStudents()) {
            if (s.getUsername().equals(u) && s.getPassword().equals(p)) {
                return s;
            }
        }
        return null;
    }

    public static void studentMenu(Student student, StudentList studentList) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. View Own Profile");
            System.out.println("2. Update Own Profile");
            System.out.println("3. Hall Renewal");
            System.out.println("4. Support Ticket");
            System.out.println("5. View Room List");
            System.out.println("6. Change Username & Password");
            System.out.println("7. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> student.displayStudent();
                case 2 -> {
                    System.out.print("New Name: ");
                    String name = sc.nextLine();
                    System.out.print("New Dept: ");
                    String dept = sc.nextLine();
                    System.out.print("New Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("New Payment: ");
                    String payment = sc.nextLine();
                    StudentMenu.updateProfile(student, name, dept, phone, payment);
                }
                case 3 -> HallReniew.renew(student);
                case 4 -> {
                    System.out.print("Write your issue: ");
                    String issue = sc.nextLine();
                    SupportTicket.submit(student, issue);
                }
                case 5 -> {
                    // Reload from file and display all rooms
                    FileIO.loadRooms("records/rooms.txt")
                            .forEach(room -> room.displayRoom());
                }
                case 6 -> {
                    System.out.print("New Username: ");
                    String newUser = sc.nextLine();
                    System.out.print("New Password: ");
                    String newPass = sc.nextLine();
                    StudentMenu.changeCredentials(student, newUser, newPass);
                }
            }
        } while (choice != 7);
    }
}
