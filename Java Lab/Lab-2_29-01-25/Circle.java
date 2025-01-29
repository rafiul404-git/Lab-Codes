import java.util.Scanner;
import java.lang.Math;
public class Circle {

    double area(double r)
    {
        double x = r*r*Math.PI;
        return x;
    }

    void display(String a,double x)
    {
        System.out.println(a+" "+x);
    }

    double perimeter(double r)
    {
        double x = 2*Math.PI*r;
        return x;
    }

    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Scanner sc =new Scanner(System.in);

        double r = sc.nextDouble();
        double x = c1.area(r);

        c1.display("Area ",x);

        double y = c1.perimeter(r);
        c1.display("Perimeter ",y);



    }

}