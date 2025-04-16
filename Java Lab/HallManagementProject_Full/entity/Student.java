package entity;

public class Student {

    // Private fields to store student information
    private String username;
    private String password;
    private String name;
    private int id;
    private String department;
    private int roomNumber;
    private String payment;
    private String phone;

    // Constructor to initialize all fields of the student
    public Student(String username, String password, String name, int id, String department, int roomNumber, String payment, String phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.id = id;
        this.department = department;
        this.roomNumber = roomNumber;
        this.payment = payment;
        this.phone = phone;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter and Setter for room number
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Getter and Setter for payment status
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    // Getter and Setter for phone number
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Method to display student information in a formatted layout
    public void displayStudent() {
        System.out.println("=======================================");
        System.out.println("           Student Information         ");
        System.out.println("=======================================");
        System.out.println("Username   : " + username);
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + id);
        System.out.println("Department : " + department);
        System.out.println("Room No.   : " + roomNumber);
        System.out.println("Payment    : " + payment);
        System.out.println("Phone      : " + phone);
        System.out.println("=======================================\n");
    }
}
