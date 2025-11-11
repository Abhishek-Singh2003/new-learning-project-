package Library_project;


import java.time.LocalDate;
import java.util.Scanner;

public class Borrow_bookB extends Collection_Book {
    Scanner sc = new Scanner(System.in);
    Borrow_bookA aobj = new Borrow_bookA();

        void meth1(String name) {
        System.out.println("Welcome [" + name + "] in Borrow Book Section.\n\n\n");
        System.out.println("Which Book Will You BORROW\n\n");

        Collection_Book book1 = new Collection_Book();
        book1.meth1(); 

        System.out.print("\nEnter Book Name : ");
        String title = sc.nextLine();
        aobj.setTitle(title);

        System.out.print("\nEnter Your Book ISBN no : ");
        int ISBN = Integer.parseInt(sc.nextLine());
        aobj.setISBN(ISBN);

        System.out.print("\nEnter Book author name : ");
        String author = sc.nextLine();
        aobj.setAuthor(author);


        System.out.println("\n\n\nYou Borrowed book [" + aobj.getTitle() + "].");
        System.out.println("Book ISBN no is [" + aobj.getISBN() + "].");
        System.out.println("Book Author name is [" + aobj.getAuthor() + "].");      
                
        LocalDate today = LocalDate.now(); 
        System.out.println("Book Issue Date: " + today);

        LocalDate futureDate = today.plusDays(15); 
        System.out.println("\n\n\n ** After 15 Days PLJ Return The Book" ); 
        System.out.println("\n ** This Is the last date of Return The Book ["+ futureDate+"]");
        System.out.println("\n ** If You not Return in Time So 100 RS Penality for Everyday.!!");
        
        System.out.println("\n\n\n Thankyou For Visitiing Library [" + name + "]");
        }
}