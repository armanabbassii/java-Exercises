package bookstore;

import java.util.Scanner;

public class BookInventoryManager {
    Scanner scanner = new Scanner(System.in);

    String title;
    String author;
    int price;
    int stockQuantity;

    public BookInventoryManager(String title, String author, int price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void BookDetail() {
        System.out.println("title: " + title + "        author: " + author + "        price: " + price + "        stockQuantity: " + stockQuantity);
    }

    public void stockQuantity() {
        System.out.println("the count of " + title + " is: " + stockQuantity);
    }

    public int reduceQuantity() {

        System.out.println("Please Enter count of book sale: ");
        int saleCount = scanner.nextInt();
        if (stockQuantity >= saleCount) {
            stockQuantity -= saleCount;
            System.out.println("Count of {" + title + "} is " + stockQuantity);
        } else {
            System.out.println("your saleCount is higher than stockQuantity :( ");
        }
        return stockQuantity;
    }

    public int eachBooksValue() {
        int eachBooksValue;
        eachBooksValue = stockQuantity * price;
        return eachBooksValue;
    }

//    public int search() {
//        System.out.println("Please search by title :)");
//        int search = scanner.nextInt();
//        return search;

//    }

}
