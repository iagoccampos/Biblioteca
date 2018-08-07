package library;

public class Item {
    private final String author;
    private final String title;
    private final int id;
    private final String subject;
    
    private int stock;
    
    public Item(String author, String title, int id, String subject) {
        this.author = author;
        this.title = title;
        this.id = id;
        this.subject = subject;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public String getSubject() {
        return this.subject;
    }
    
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException();
        }
        
        this.stock = stock;
    }
}
