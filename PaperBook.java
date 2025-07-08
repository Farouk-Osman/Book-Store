public class PaperBook extends Book {
    private double weight;
    private int stock;

    public PaperBook(String title, String author, String isbn, int publicationYear, double price, double weight, int stock) {
        super(title, author, isbn, publicationYear, price);
        this.weight = weight;
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }
    public int getStock() {
        return stock;
    }

    @Override
    public boolean isPurchasable() {
        return stock > 0;
    }
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Not enough stock available");
        }
    }

}
