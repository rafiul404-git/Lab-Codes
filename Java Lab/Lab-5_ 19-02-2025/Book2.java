class Author{
    String name;
    String friction;

    public Author(String name, String friction)
    {
        this.name = name;
        this.friction = friction;
    }
    void write()
    {
        System.out.println("Author "+name+ " Friction "+friction);
    }
}
public class Book2 {
    String title;
    double price;
    Author author;

    public Book2(String title, double price , Author author)
    {
        this.title = title;
        this.price = price;
        this.author= author;

    }

    void display()
    {
        System.out.println("Title "+title+" price "+price);
        System.out.println("Author "+author.name+ " Friction "+author.friction);
    }
    public static void main(String[] args)
    {
        Author author1 = new Author("Rafi","Thriler");
        Book2 b1 = new Book2("Mirror room",1202.50,author1);
        b1.display();
    }
}
