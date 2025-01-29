import java.util.Scanner;

public class Main {
    String fname, lname;
    int age;

    void insertData(String a, String b,int c)
    {
        fname =a;
        lname = b;
        age =c;
    }

    void display()
    {

        System.out.println(fname + " "+ lname+ " "+age);
    }
    public static void main(String[] args)
    {
        Main s1 = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First name :");
        s1.fname = sc.nextLine();
        System.out.println("Enter Your Last name :");
        s1.lname = sc.nextLine();
        System.out.println("Enter Your age :");
        s1.age = sc.nextInt();
        s1.display();
        s1.insertData("Rapi", "rapi", 22);
        s1.display();
    }

}