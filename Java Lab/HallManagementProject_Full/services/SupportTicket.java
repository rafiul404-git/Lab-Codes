package services;

// Required imports for SupportTicket
import java.util.Scanner;  // For reading input
import fileIO.FileIO;  // For saving and viewing tickets
import entity.Student;  // To work with Student objects


public class SupportTicket {
    public static void submit(Student student, String issue) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password to confirm: ");
        String inputPass = sc.nextLine();
        if (inputPass.equals(student.getPassword())) {
            // Ask for the room number as well
            System.out.print("Enter your room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            // Save the ticket with room number included
            String ticket = "Student ID: " + student.getId() + " - " + issue + " (Room: " + roomNumber + ")";
            FileIO.saveTicket(ticket, "records/tickets.txt");
            System.out.println("Support ticket submitted successfully!");
        } else {
            System.out.println("Incorrect password. Ticket submission aborted.");
        }
    }

    public static void view() {
        FileIO.viewTickets("records/tickets.txt");
    }
}
