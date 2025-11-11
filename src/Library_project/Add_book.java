package Library_project;

import java.util.Scanner;

public class Add_book extends Collection_Book {
    static Scanner sc = new Scanner(System.in);

    void meth1(String name) {
        System.out.println("\n\n\nWelcome To Book Add Section : " + name + " ");

        System.out.print("\nEnter your Book name : ");
        String title = sc.nextLine();
        System.out.print("\nEnter Your Book ISBN no : ");
        int ISBN = Integer.parseInt(sc.nextLine());
        System.out.print("\nEnter author name : ");
        String author = sc.nextLine();

        System.out.println("\n\n\nYour Book Name is [" + title + "].");
        System.out.println("Your Book ISBN no is [" + ISBN + "].");
        System.out.println("Your Book Author name is [" + author + "].");

        new Collection_Book().meth1(name, title, author, ISBN);
 }
          
}