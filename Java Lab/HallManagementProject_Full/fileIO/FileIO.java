package fileIO;

import entity.*;
import java.io.*;
import java.util.*;

public class FileIO {

    // Save a list of students to a file
    public static void saveStudents(List<Student> students, String filePath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            for (Student s : students) {
                pw.println(s.getUsername() + "," + s.getPassword() + "," + s.getName() + "," + s.getId() + "," +
                        s.getDepartment() + "," + s.getRoomNumber() + "," + s.getPayment() + "," + s.getPhone());
            }
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    // Load a list of students from a file
    public static List<Student> loadStudents(String filePath) {
        List<Student> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(",");
                list.add(new Student(s[0], s[1], s[2], Integer.parseInt(s[3]), s[4], Integer.parseInt(s[5]), s[6], s[7]));
            }
        } catch (Exception e) {
            System.out.println("Loading students: " + e.getMessage());
        }
        return list;
    }

    // Save a list of employees to a file
    public static void saveEmployees(List<Employee> employees, String filePath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            for (Employee e : employees) {
                // Null-safe write
                String phone = (e.getPhone() == null) ? "" : e.getPhone();
                String mail = (e.getMail() == null) ? "" : e.getMail();
                pw.println(e.getUsername() + "," + e.getPassword() + "," + e.getName() + "," + e.getId() + "," +
                        e.getDesignation() + "," + phone + "," + mail);
            }
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    // Load a list of employees from a file
    public static List<Employee> loadEmployees(String filePath) {
        List<Employee> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(",");
                Employee e = new Employee(s[0], s[1], s[2], Integer.parseInt(s[3]), s[4], s[5], s[6]);
                if (s.length > 5) e.setPhone(s[5]);
                if (s.length > 6) e.setMail(s[6]);
                list.add(e);
            }
        } catch (Exception e) {
            System.out.println("Loading employees: " + e.getMessage());
        }
        return list;
    }

    // Save a list of rooms to a file
    public static void saveRooms(List<Room> rooms, String filePath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            for (Room r : rooms) {
                pw.println(r.getSeat() + "," + r.getTable() + "," + r.getChair() + "," + r.getBed() + "," + r.getFanlight());
            }
        } catch (IOException e) {
            System.out.println("Error saving rooms: " + e.getMessage());
        }
    }

    // Load a list of rooms from a file
    public static List<Room> loadRooms(String filePath) {
        List<Room> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(",");
                list.add(new Room(Integer.parseInt(s[0]), s[1], s[2], s[3], s[4]));
            }
        } catch (Exception e) {
            System.out.println("Loading rooms: " + e.getMessage());
        }
        return list;
    }

    // =========================
    // Methods for Tickets and Notices
    // =========================

    // Save a single ticket line to a file (appended)
    public static void saveTicket(String ticket, String filePath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, true))) {
            pw.println(ticket);  // Appends the ticket to the file
        } catch (IOException e) {
            System.out.println("Error saving ticket: " + e.getMessage());
        }
    }

    // View all tickets from a file
    public static void viewTickets(String filePath) {
        try (Scanner sc = new Scanner(new File(filePath))) {
            System.out.println("---- Support Tickets ----");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());  // Prints each ticket line by line
            }
        } catch (IOException e) {
            System.out.println("Error reading tickets: " + e.getMessage());
        }
    }

    // Save a single notice line to a file (appended)
    public static void saveNotice(String notice, String filePath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, true))) {
            pw.println(notice);  // Appends the notice to the file
        } catch (IOException e) {
            System.out.println("Error saving notice: " + e.getMessage());
        }
    }

    // View all notices from a file
    public static void viewNotices(String filePath) {
        try (Scanner sc = new Scanner(new File(filePath))) {
            System.out.println("----- Notices -----");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());  // Prints each notice line by line
            }
        } catch (IOException e) {
            System.out.println("Error reading notices: " + e.getMessage());
        }
    }
}
