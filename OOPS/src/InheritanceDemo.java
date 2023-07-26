// Parent class
class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Child class inheriting from Product
class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public void displayAuthor() {
        System.out.println("Author: " + author);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Product product = new Product("Generic Product", 9.99);
        product.displayInfo();  // Output: Name: Generic Product, Price: $9.99

        System.out.println("-------------------");

        Book book = new Book("Java Programming", 29.99, "John Doe");
        book.displayInfo();  // Output: Name: Java Programming, Price: $29.99
        book.displayAuthor();  // Output: Author: John Doe


        // allows a class to inherit the properties and behaviors of another class. Inheritance establishes a hierarchical relationship between classes,
    }
}

