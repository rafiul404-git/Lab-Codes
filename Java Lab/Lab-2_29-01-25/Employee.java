import java.util.Scanner;
public class Employee{
    String name;
    String title;
    int salary;

    void display()
    {
        System.out.println(title+" "+name+" $"+salary);
    }

    void increment()
    {
        salary += 2000;
        System.out.println("Incriment Salary is: ");
        display();
    }

    void YearlySalary()
    {

        salary *=12;
        System.out.println("Yearly  Salary is: ");
        display();
    }

    public static void main(String[] args)
    {
        Employee m1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  name;");
        m1.name= sc.nextLine();
        System.out.println("Enter title :");
        m1.title=sc.nextLine();
        System.out.println("Enter Salary ;");
        m1.salary=sc.nextInt();

        System.out.println("Employe Info:");
        m1.display();
        System.out.println();
        m1.increment();
        System.out.println();
        m1.YearlySalary();
    }

}
