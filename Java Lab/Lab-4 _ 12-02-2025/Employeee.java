public class Employeee {

    // Lab-4.3 _ 21/02/2025

    int id = 148;
    String name = "Rafiul";
    String date = "12-01-2025";

}

class HR extends Employeee{
    double salary = 150005.55;
    void display()
    {
        System.out.println("Your salary is "+salary);
    }
}

class SoftwareEngineer extends Employeee{
    double salary = 200400.44;
    void display()
    {
        System.out.println("Your salary is "+salary);
    }
}

class Main4 {
    public static void main(String[] arg)
    {
        HR hr = new HR();
        System.out.println(hr.name+ "- Id "+hr.id+ "\n joined date "+ hr.date);
        hr.display();

        System.out.println();
        SoftwareEngineer sw = new SoftwareEngineer();
        System.out.println(sw.name+ "- Id:"+sw.id+ "\n  joined date "+ sw.date);
        sw.display();
    }
}


