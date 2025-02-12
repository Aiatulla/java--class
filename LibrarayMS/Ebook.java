package LibrarayMS;

public class Ebook extends Book{
    private double fileSizeMb;
    private String fileFormat;


    public void printBookDetails(){
        super.printBookDetails();
        System.out.println("File size in MB: " + fileSizeMb);
        System.out.println("File format: " + fileFormat);
    }

    public Ebook(String title, int yearPublished, String author, String fileFormat) {
        super(title, yearPublished, author);
        this.fileFormat = fileFormat;
    }

    public void type(){
        System.out.println("This is Ebook");
    }
    public void price(){
        if (fileSizeMb < 10)
            System.out.println("Price 5$");
        else if (fileSizeMb < 50)
            System.out.println("Price 30$");
        else
            System.out.println("Price 50$");
    }

    public Ebook(String title, int yearPublished, String author, double fileSizeMb) {
        super(title, yearPublished, author);
        this.fileSizeMb = fileSizeMb;
    }

    public String getBookInfo(){
        return super.getBookInfo() + ", file size in MB: " + fileSizeMb + "MB, file format: " + fileFormat;
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }

    public void setFileSizeMb(double fileSizeMb) {
        this.fileSizeMb = fileSizeMb;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public Ebook(String title, int yearPublished, String author, double fileSizeMb, String fileFormat) {
        super(title, yearPublished, author);
        this.fileSizeMb = fileSizeMb;
        this.fileFormat = fileFormat;
    }
}
