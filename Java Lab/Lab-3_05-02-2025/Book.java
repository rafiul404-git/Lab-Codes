public class Book {
    String title ;
    String author;
    int price;
    public Book()
    {
        title = "Light a Penny Candle";
        author ="Maeve Binchy";
        price = 55;
    }
    public Book(String title1, String author1)
    {
        title =title1;
        author =title1;
        price = 65;
    }
    public Book(String title1, String author1, int x)
    {
        title =title1;
        author =title1;
        price = x;
    }
    public static void main(String[] args)
    {
        Book book1 = new Book();
        System.out.println(book1.title+"- _"+ book1.author+ "- _"+ book1.price+"$\n");
        Book book2 = new Book("Twenty-Dollar Horse","Gerald Raftery");
        System.out.println(book2.title+"- _"+ book2.author+ "- _"+ book2.price+"$");
        System.out.println();
        Book book3 = new Book("The 25¢ Miracle","Theresa Nelson",77);
        System.out.println(book3.title+"- _"+ book3.author+ "- _"+ book3.price+"$");


    }
}
