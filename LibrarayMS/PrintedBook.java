package LibrarayMS;

public class PrintedBook extends Book{

    private int numberOfPages;
    private String publisher;

    public PrintedBook(String title, int yearPublished, String author, int numberOfPages, String publisher) {
        super(title, yearPublished, author);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public PrintedBook(String title, int yearPublished, String author, String publisher) {
        super(title, yearPublished, author);
        this.publisher = publisher;
    }

    public PrintedBook(String title, int yearPublished, String author, int numberOfPages) {
        super(title, yearPublished, author);
        this.numberOfPages = numberOfPages;
    }

    public String getBookInfo() {
        return super.getBookInfo() + ", number of pages " +
                numberOfPages + ", publisher " + publisher;
    }

    public void printBook(){
        System.out.println("Printing the book");
    }

    public void price(){
        if (numberOfPages < 300)
            System.out.println("Price 20$");
        else if (numberOfPages < 500)
            System.out.println("Price 30$");
        else
            System.out.println("Price 45$");
    }


    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
    }

    public void bookType(){
        System.out.println("This is a printed book");
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
