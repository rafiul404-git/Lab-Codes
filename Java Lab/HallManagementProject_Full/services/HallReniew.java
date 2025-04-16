package services;

import entity.Student;
import java.util.Scanner;

public class HallReniew {

    // Method to renew a student's hall stay after password confirmation
    public static void renew(Student student) {
        Scanner sc = new Scanner(System.in);

        // Ask for password to confirm identity
        System.out.print("Enter your password to confirm hall renewal: ");
        String inputPass = sc.nextLine();

        // Check if password matches the student's password
        if (inputPass.equals(student.getPassword())) {
            // Prompt for new payment method
            System.out.print("Enter your payment method (e.g., Cash, Card, etc.): ");
            String paymentMethod = sc.nextLine();

            // Update payment status in student object
            student.setPayment(paymentMethod);
            System.out.println("Hall renewed for student ID: " + student.getId());
            System.out.println("Payment status updated with method: " + paymentMethod);
        } else {
            // If password doesn't match
            System.out.println("Incorrect password. Renewal aborted.");
        }
    }
}
