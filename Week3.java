import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int num_pages;

    Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    void setDetails(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    String getName() { return name; }
    String getAuthor() { return author; }
    double getPrice() { return price; }
    int getNumPages() { return num_pages; }

    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class Week3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Number of pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(name, author, price, num_pages);
        }
        System.out.println("\nBook Details:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
