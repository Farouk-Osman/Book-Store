public class EBook extends Book {
    private String fileFormat;
    private double fileSize;

    public EBook(String title, String author, String isbn, int publicationYear, double price, String fileFormat, double fileSize) {
        super(title, author, isbn, publicationYear, price);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public boolean isPurchasable() {
        return true;
    }
}
