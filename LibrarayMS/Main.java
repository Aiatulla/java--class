package LibrarayMS;

public class Main {

    public static void main(String[] args){
        PrintedBook b1 = new PrintedBook("The Great Gatsby", 1925, "F. Scott", 218, "Scribner");
        Ebook b2 = new Ebook("Java programming for beginners", 2020, "John Smith", 4.5, "PDF");

        b1.bookType();
        b1.printBookDetails();
        b1.price();

        System.out.println("\n");

        b2.type();
        b2.printBookDetails();
        b2.price();
    }
}
