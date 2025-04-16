package entity;

public class Employee {

    // Private fields to store employee information
    private String username;
    private String password;
    private String name;
    private int id;
    private String designation;
    private String phone;
    private String mail;

    // Constructor to initialize all fields of the employee
    public Employee(String username, String password, String name, int id, String designation, String phone, String mail) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.phone = phone;
        this.mail = mail;
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

    // Getter and Setter for designation
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter and Setter for phone number
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and Setter for email
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // Displays the employee information in a formatted way
    public void displayEmployee() {
        System.out.println("=======================================");
        System.out.println("           Employee Information        ");
        System.out.println("=======================================");
        System.out.println("Username     : " + username);
        System.out.println("Name         : " + name);
        System.out.println("ID           : " + id);
        System.out.println("Designation  : " + designation);
        System.out.println("Phone Number : " + phone);
        System.out.println("E-mail       : " + mail);
        System.out.println("=======================================\n");
    }
}
