public class Person {  //Lab-4.1- 12/2/2025
    private  String name;
    private int age;

    public Person()
    {
        this.name = "Bro";
        this.age = 20;
    }
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args)
    {
        Person p1 =new Person();

        p1.setName("Rafi");
        p1.setAge(22);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        Person p2 = new Person();
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        Person p3 = new Person("Jim",28);
        System.out.println(p3.getName());
        System.out.println(p3.getAge());
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}