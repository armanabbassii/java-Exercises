package bookstore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookInventoryManager[] s = {
                new BookInventoryManager("Burn the Past", "Arman", 10000, 5),
                new BookInventoryManager("Eye of Death", "Ali", 20000, 7),
                new BookInventoryManager("Bride of Princes", "Hossein", 30000, 0),
                new BookInventoryManager("Sticks and Stones", "Javad", 40000, 10),
                new BookInventoryManager("Enemy of Blood", "Naser", 50000, 2)
        };

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1- Show the list of all books");
            System.out.println("2- Calculate the total inventory value");
            System.out.println("3- Buy a book");
            System.out.println("4- View details of a book");
            System.out.println("5- Exit");

            int menuItem = scanner.nextInt();

            switch (menuItem) {

                case 1:
                    System.out.println("======================================Details====================================");

                    for (BookInventoryManager book : s) {
                        book.BookDetail();
                    }
                    System.out.println("=================================================================================");

                    break;

                case 2:
                     int totalBookValue = 0;

                    System.out.println("======================================TotalBookValue==============================");

                    for (BookInventoryManager book : s) {
//extra                 book.eachBooksValue();
                        totalBookValue += book.eachBooksValue();
                    }
                    System.out.println("the total value of all books is: " + totalBookValue);
                    System.out.println("==================================================================================");
                    break;

                case 3:

                    System.out.println("Please choose book item:{0,1,2,3,4} ");
                    int index = scanner.nextInt();
                    if (0 <= index && index <= 4) {
                        s[index].reduceQuantity();
                    } else {
                        System.out.println("Your choosed item is invalid!");
                    }
                    System.out.println("==================================================================================");
                    break;

                case 4:
                    System.out.println("Please choose book item:{0,1,2,3,4} ");
                    index = scanner.nextInt();
                    if (0 <= index && index <= 4) {
                        s[index].BookDetail();
                    } else {
                        System.out.println("Your choosed item is invalid!");
                    }
                    System.out.println("==================================================================================");
                    break;


                case 5:
                    System.out.println("Good luck :)");
                    System.exit(0);
            }
        }
    }
}
