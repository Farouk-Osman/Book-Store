public abstract class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected int publicationYear;
    protected double price;

    public Book(String title, String author, String isbn, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public double getPrice() {
        return price;
    }
    public abstract boolean isPurchasable();
}
