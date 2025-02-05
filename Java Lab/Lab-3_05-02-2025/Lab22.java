public class Lab22 {

    int x;
    int newYear;
    String name;
    public Lab22(int y)
    {
        x =y;
    }
    public Lab22()
    {
        x=5;
    }

    public Lab22(int year, String name1)
    {
        newYear = year;
        name = name1;
    }


    public static void main(String[] args)
    {
        Lab22 lab = new Lab22(15);
        System.out.println(lab.x);

        Lab22 lab1 = new Lab22();
        System.out.println(lab1.x);

        Lab22 lab2 =new Lab22(1996,"Rafi");
        System.out.println(lab2.name+" "+lab2.newYear);
    }
}
