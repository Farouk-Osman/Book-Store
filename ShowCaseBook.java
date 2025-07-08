public class ShowCaseBook extends Book {

    public ShowCaseBook(String title, String author, String isbn, int publicationYear) {
        super(title, author, isbn, publicationYear, 0.0);
    }

    @Override
    public boolean isPurchasable() {
        return false;
    }
}
