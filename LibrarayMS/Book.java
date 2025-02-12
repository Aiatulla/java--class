package LibrarayMS;

public class Book {

    private String title;
    private String author;
    private int yearPublished;


    public String getBookInfo() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }


    public void printBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }



    public Book(String title, int yearPublished, String author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
