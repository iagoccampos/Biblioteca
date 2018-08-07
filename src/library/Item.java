package library;

public class Item {
    private final String author;
    private final String title;
    private final String subject;
    
    private int stock;
    
    public Item(String author, String title, String subject) {
        if (author == null) {
            throw new IllegalArgumentException("Author can't be null.");
        }
        
        this.author = author;
        this.title = title;
        this.subject = subject;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public String getSubject() {
        return this.subject;
    }
    
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock must be non-negative.");
        }
        
        this.stock = stock;
    }
}
