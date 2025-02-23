
class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

class Bank{
    String name;
    Emp emp;

    public Bank (String name, Emp emp) {
        this.name = name;
        this.emp = emp;
    }
    void display()
    {
        System.out.println("Bank name :"+name+"-> Employe is : "+emp.name);
        emp.disAdd();

    }
}

public class Emp extends Person{
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }
    void disAdd()
    {
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("Savar","Dhaka","BD");
        Address address2=new Address("Dighirchala","Gazipur","BD");

        Emp e1=new Emp(148,"Rafi",address1);
        Emp e2=new Emp(698,"Sami",address2);

        e1.display();
        e2.display();

        Bank b1 = new Bank("Mugda bank", e1);
        b1.display();
    }
}