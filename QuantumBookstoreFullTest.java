public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BookStoreInventory store = new BookStoreInventory();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Book paperBook = new PaperBook("Java Fundamentals", "Ali", "001", 2017, 120, 1.0, 5);
        Book eBook = new EBook("Spring Boot Guide", "Sara", "002", 2021, 90, "pdf", 2.0);
        Book showcaseBook = new ShowCaseBook("Mastering Algorithms", "Yasser", "003", 2010);

        store.addBook(paperBook);
        store.addBook(eBook);
        store.addBook(showcaseBook);

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        try {
            double paid = store.buyBook("001", 2, "ali@mail.com", "Cairo");
            System.out.println("Quantum book store - Paid amount for paper book: " + paid);
        } catch (Exception e) {
            System.out.println("Quantum book store - ERROR: " + e.getMessage());
        }
        System.out.println("--------------------------------------------------");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        try {
            double paid = store.buyBook("002", 1, "sara@mail.com", "");
            System.out.println("Quantum book store - Paid amount for ebook: " + paid);
        } catch (Exception e) {
            System.out.println("Quantum book store - ERROR: " + e.getMessage());
        }
        System.out.println("--------------------------------------------------");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        try {
            store.buyBook("003", 1, "", "");
        } catch (Exception e) {
            System.out.println("Quantum book store - ERROR (ShowcaseBook): " + e.getMessage());
        }
        System.out.println("--------------------------------------------------");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        try {
            store.buyBook("001", 10, "fail@mail.com", "Giza");
        } catch (Exception e) {
            System.out.println("Quantum book store - ERROR (overstock): " + e.getMessage());
        }
        System.out.println("--------------------------------------------------");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Book removed = store.removeOutdatedBook(10);
        if (removed != null) {
            System.out.println("Quantum book store - Removed outdated book: " + removed.getTitle());
        } else {
            System.out.println("Quantum book store - No outdated books removed.");
        }
    }
}
