package services;

import entityList.*;
import java.util.Scanner;
import entity.Employee;

public class AdminLogin {

    static String adminUser = "admin";  // Default admin username
    static String adminPass = "1234";   // Default admin password

    // Admin Menu accessible by both admin and employee
    public static void adminMenu(StudentList studentList, EmployeeList employeeList, RoomList roomList) {
        EmployeeMenu.show(studentList, employeeList, roomList);  // Showing the admin panel (EmployeeMenu is the panel here)
    }

    // Login method to handle both admin and employee login
    public static boolean login(Scanner sc, EmployeeList employeeList) {
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        // Check for admin login
        if (u.equals(adminUser) && p.equals(adminPass)) {
            System.out.println("Admin Login Successful!");
            return true;  // Admin login successful
        }

        // Check for employee login
        for (Employee e : employeeList.getAllEmployees()) {
            if (e.getUsername().equals(u) && e.getPassword().equals(p)) {
                System.out.println("Employee Login Successful! (Access as Admin)");
                return true;  // Employee login successful (treated as admin)
            }
        }

        System.out.println("Invalid credentials.");
        return false;  // Invalid login
    }

    // Method to handle login and show admin menu
    public static void loginAndShowMenu(EmployeeList employeeList, StudentList studentList, RoomList roomList) {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        // Try logging in (can be employee or admin)
        while (loggedIn == false) {
            loggedIn = login(sc, employeeList);
        }

        // After login, show Admin Panel
        adminMenu(studentList, employeeList, roomList);
    }
}
