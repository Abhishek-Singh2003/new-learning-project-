package Library_project;

public class Collection_Book {
    void meth1() {
 
        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               *      Book => Core Java.      *");
        System.out.println("               *    Author => Kishan Basina.  *");
        System.out.println("               *      ISBN => 101             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               *    Book => Advanced Java.    *");
        System.out.println("               *    Author => Satyam Singh.   *");
        System.out.println("               *      ISBN => 102             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               *  Book => Database Systems.   *");
        System.out.println("               *    Author => Sudhakar Ladda. *");
        System.out.println("               *      ISBN => 103             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               * Book => Web Development.     *");
        System.out.println("               *    Author => Pooja Sinha.    *");
        System.out.println("               *      ISBN => 104             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               * Book => Operating Systems.   *");
        System.out.println("               *   Author => Deepak Kumar.    *");
        System.out.println("               *      ISBN => 105             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               * Book => Data Structures.     *");
        System.out.println("               *   Author => Anjali Singh.    *");
        System.out.println("               *      ISBN => 106             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               * Book => Computer Networks.   *");
        System.out.println("               *   Author => Mohit Bansal.    *");
        System.out.println("               *      ISBN => 107             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");
    }

    void meth1(String name, String title, String author, int ISBN) 
    {
        meth1(); 
        System.out.println("               ********************************");
        System.out.println("               *                              *");
        System.out.println("               * Book => " + title + "              *");
        System.out.println("               *   Author => " + author + "          *");
        System.out.println("               *      ISBN => " + ISBN + "             *");
        System.out.println("               *                              *");
        System.out.println("               ********************************");

        System.out.println("\n\n\nThank you for Adding The Book To Archive " + name + "..");
        
        System.out.println("\n\n\n Thankyou For Visitiing Library [" + name + "]");	     
    }

}
