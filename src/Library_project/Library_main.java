package Library_project;

import java.util.Scanner;


public class Library_main extends Add_book
{
    Scanner sc = new Scanner(System.in);
    public String name;

    void meth1() 
    {
    	System.out.println("\n\n\n      **********************************************************");
    	System.out.println("            *    Welcome to the Smart Library System!!    *");
    	System.out.println("            *                                             *");
    	
        System.out.print("\n\n\n ** PLJ Enter your name : ");
        name = sc.nextLine();  
    }

    void meth2()
    {
        System.out.println("\n\n ** Which Section Would you Go\n");
        System.out.println("1) Add Book");
        System.out.println("2) Borrow book");
        System.out.println("3) Study Here Book");
        System.out.print("Enter your choice Btw (1,2,3): ");
        int book_option = sc.nextInt();
        sc.nextLine(); 

        if (book_option == 1)
        {
        	Add_book borrow1 = new Add_book();
        	borrow1.meth1(name);
        }
        else if (book_option == 2) 
        {
            Borrow_bookB borrow = new Borrow_bookB();
            borrow.meth1(name);
        } else if (book_option == 3)
        {
           System.out.println("\n\n\n ** Welcome to Study Section ["+name+"]");
           System.out.println("\n\n\n Thankyou For Visitiing Library [" + name + "]");
        } 
        else
        {
            System.out.println("PLJ enter your valid choice.");
        }
    }

    public static void main(String[] args) {
        Library_main LIB = new Library_main();
        LIB.meth1();    
        LIB.meth2(); 
        
        
    }
}
