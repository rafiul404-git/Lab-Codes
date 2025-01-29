import java.util.Scanner;
public class Lab{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Info info = new Info();

        System.out.println("Enter your name :");
        info.name=sc.nextLine();
        info.age = sc.nextInt();
        info.cg = sc.nextDouble();
        sc.nextLine();
        info.id = sc.nextLine();

        System.out.println();
        System.out.println("Here we go. Your Information:");
        System.out.println("Your name is : "+info.name);
        System.out.println("Your agr is : "+info.age);
        System.out.println("Your Cgpa is : "+info.cg);
        System.out.println("Your id is : "+info.id);

    }
}

class Info{

    String name;
    int age;
    double cg;
    String id;
}