import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class BookStoreInventory {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public Book getBook(String isbn) {
        return inventory.get(isbn);
    }

    public Book removeOutdatedBook(int maxYears) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (Book b : inventory.values()) {
            if (currentYear - b.getPublicationYear() > maxYears) {
                inventory.remove(b.getIsbn());
                return b;
            }
        }
        return null;
    }

    public double buyBook(String isbn, int qty, String email, String address) {
    Book book = inventory.get(isbn);
    if (book == null || !book.isPurchasable())
        throw new IllegalArgumentException("Book not purchasable");

    if (book instanceof PaperBook) {
        PaperBook pb = (PaperBook) book;
        pb.reduceStock(qty);
        ShippingService.shipPaperBook(pb.getTitle(), address);
    } else if (book instanceof EBook) {
        EmailService.sendEBook(book.getTitle(), email);
    }

    return book.getPrice() * qty;
}

}
