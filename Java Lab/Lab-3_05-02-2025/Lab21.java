import java.util.*;
public class Lab21{

        int sum (int x, int y)
        {
                return x+y;
        }

        float sum (float x, float y)
        {
                return x+y;
        }

        double sum (double x, double y)
        {
                return x+y;
        }

       String sum (String x, String y)
        {
                return x+y;
        }

        //Overloaded method for 3 args

        int sum (int x, int y, int z)
        {
                return x+y+z;
        }

       float sum (float x, float y,float z)
        {
                return x+y+z;
        }

       double sum (double x, double y, double z)
        {
                return x+y+z;
        }

        String sum (String x, String y, String z)
        {
                return x+y+z;
        }

        public static void main(String[] args)
        {
                Scanner sc =new Scanner(System.in);
                Lab21 lab = new Lab21();
                System.out.println("Enter your input number for Integer :");
                int c = sc.nextInt();
                if(c==2)
                {
                        System.out.println("Enter your two input :");
                        int x= sc.nextInt();
                        int y = sc.nextInt();
                }

                System.out.println("Enter your input number for Float :");
                 c = sc.nextInt();
                if(c==2)
                {
                        System.out.println("Enter your tow input :");
                         float a= sc.nextInt();
                         float b = sc.nextInt();
                }

                System.out.println("Enter your input number for Float :");
                 c = sc.nextInt();
                if(c==2)
                {
                        System.out.println("Enter your tow input :");
                        float a= sc.nextInt();
                        float b = sc.nextInt();
                }

                System.out.println(lab.sum(5,9));
                System.out.println(lab.sum(5.5f,11.9f));
                System.out.println(lab.sum(6.88,9.664));
                System.out.println(lab.sum("you are", " good"));

                // for 3 args
                System.out.println();
                System.out.println(lab.sum(5,9,7));
                System.out.println(lab.sum(5.5f,11.9f, 3.14f));
                System.out.println(lab.sum(6.88,9.664,8.654));
                System.out.println(lab.sum("you are", " good"," Boy"));
        }

}
