package Mall_project;

import java.util.Scanner;

public class Parking_management_main {
    static Scanner sc = new Scanner(System.in);

    // Instance variables to store user input
    private String name = "";
    private String wheller2 = "";
    private int Vechicle    = 0;
    private String noplate1 = "";
    private String noplate2 = "";

    // Method to handle parking entry
    String meth1() {
        System.out.println(" \n\n                                                                             ");
        System.out.println("         *************************************************************************");
        System.out.println("         *                                                                       *");
        System.out.println("         *         Welcome to Lulu Mall - India's Biggest Mall..!!               *");
        System.out.println("         *                                                                       *");
        System.out.println("         *************************************************************************");

        while (true) {
            System.out.print("\n\n\n\n\n       *  Please enter your name: (A-Z or a-z)... ");
            name = sc.nextLine();

            if (name.matches("[a-zA-Z ]+")) {
                System.out.println("          ------------------------------------------------");
                break;
            }
        }

        System.out.println("\n       =>  Welcome [" + name + "] India's Biggest Mall!");

        while (true) {
            System.out.println("\n\n\n\n\n                 *  How did you come here?");
            System.out.println("                    ---------------------\n");
            System.out.println("                 *  1. Pedestrian (Walking)");
            System.out.println("                 *  2. 2-Wheeler");
            System.out.println("                 *  3. 4-Wheeler");
            System.out.print("\n                 *  Enter your choice (1-3): ");

            if (sc.hasNextInt()) {
                Vechicle = sc.nextInt();
                sc.nextLine();
                if (Vechicle >= 1 && Vechicle <= 3) {
                    break;
                } else {
                    System.out.println("\nInvalid choice! Please enter (1-3) only.");
                }
            } else {
                System.out.println("\nInvalid choice! Please enter (1-3) only.");
                sc.nextLine();
            }
        }

        if (Vechicle == 1) {
            System.out.println("\n                 =>  ThankYou so Much For Your Cooperation ..");
            System.out.println("\n                =>  Step inside and let the magic of India's biggest mall unfold before you!!");
        } else if (Vechicle == 2) {
            while (true) {
                System.out.println("\n                 *  What is the type of your 2-wheeler? (BICYCLE or MOTOR-CYCLE).......[WRITE IN CAPITAL]");
                wheller2 = sc.nextLine();

                if (wheller2.equalsIgnoreCase("BICYCLE")) {
                    System.out.println("\n                 =>  Please park your Bicycle in A Block (Basement, Left Side)");
                    System.out.println("\n                 =>  ThankYou so Much For Your Cooperation .. Please Collect Your BICYCLE In Exit Time ");
                    break;
                } else if (wheller2.equalsIgnoreCase("MOTOR-CYCLE")) {
                    while (true) {
                        System.out.print("\n                 *  Enter your MOTOR-CYCLE number (10 characters only): ");
                        noplate1 = sc.nextLine();

                        if (noplate1.length() == 10) {
                            break;
                        }
                        System.out.println("                 *  Vehicle number must be exactly 10 characters!");
                    }

                    System.out.println("\n                 =>  Please park your MOTOR-CYCLE [" + noplate1 + "] in B Block (Basement, Right Side)");
                    System.out.println("\n                 =>  ThankYou so Much For Your Cooperation .. Please Collect Your MOTOR-CYCLE [" + noplate1 + "] In Exit Time ");
                    break;
                }
            }
        } else if (Vechicle == 3) {
            while (true) {
                System.out.print("\n                 *   Enter your 4-WHEELER number (10 characters only): ");
                noplate2 = sc.nextLine();
                if (noplate2.length() == 10) {
                    break;
                }
                System.out.println("\n                 *   Vehicle number must be exactly 10 characters!!");
            }

            System.out.println("\n                 =>  Please park your 4-WHEELER [" + noplate2 + "] in C Block (Basement, Second Floor)");
            System.out.println("                 =>  ThankYou so Much For Your Cooperation .. Please Collect Your 4-WHEELER [" + noplate2 + "] In Exit Time ");
        }

        System.out.println(" \n\n\n                                                                                    ");
        System.out.println("         **********************************************************************************");
        System.out.println("         *                                                                                *");
        System.out.println("         *  You're all set! Enjoy your Lulu Mall experience — food, fun & shopping await  *");
        System.out.println("         *                                                                                *");
        System.out.println("         **********************************************************************************");
        return name;
    }

    // Method to handle parking exit
    void meth2() {
        System.out.println("\n\n\n");
        System.out.println("                 =>  Thank you [" + name + "] for exploring Lulu Mall...");

        // Display parking charges based on vehicle choice
        if (Vechicle == 2 && wheller2.equalsIgnoreCase("BICYCLE")) {
            System.out.println("\n\n                 =>  PLJ Pay 10 RS for Your BICYCLE Parking Charge..");
            System.out.println("                 =>  And Take It from A Block (Basement, Left Side)");
        } else if (Vechicle == 2 && wheller2.equalsIgnoreCase("MOTOR-CYCLE")) {
            System.out.println("\n\n                 =>  PLJ Pay 20 RS for Your MOTOR-CYCLE [" + noplate1 + "] Parking Charge..");
            System.out.println("                 =>  And Take It from B Block (Basement, Right Side)");
        } else if (Vechicle == 3) {
            System.out.println("\n\n                 =>  PLJ Pay 40 RS for Your 4-WHEELER [" + noplate2 + "] Parking Charge..");
            System.out.println("                 =>  And Take It from C Block (Basement, Second Floor)");
        } else {
            System.out.println("                 =>  No vehicle found for parking payment.");
        }

        System.out.println(" \n\n\n                                                                                    ");
        System.out.println("         **********************************************************************************");
        System.out.println("         *                                                                                *");
        System.out.println("         *            Thank you for visiting Lulu Mall — your smile made our day!         *");
        System.out.println("         *                                                                                *");
        System.out.println("         **********************************************************************************");

        // Call meth3 to display developer info and exit
        meth3();
    }

    // Method to display developer info and exit
    void meth3() {
        System.out.println("\n\n\n\n                          If You See Structure of code Then continue this link..");
        System.out.println("                          *****************************************************");
        System.out.println("                          *             https://shorturl.at/qkl7X             *");
        System.out.println("                          *****************************************************");

        System.out.println("\n\n");
        System.out.println("                                  I am Java Full Stack Web Developer..");
        System.out.println("                          *****************************************************");
        System.out.println("                          *             My name is ABHISHEK SINGH             *");
        System.out.println("                          *****************************************************");

        System.out.println("\n\n");
        System.out.println("                          This is my Github  Link You Will See my Mall_project Here..");
        System.out.println("                          *****************************************************");
        System.out.println("                          *        https://github.com/Abhishek-Singh2003      *");
        System.out.println("                          *****************************************************");

        System.exit(0);
    }

    public static void main(String[] args) {
        Parking_management_main obj = new Parking_management_main();
        String name = obj.meth1();

        // Pass the same instance to Store_shopping
        Store_shopping aobj = new Store_shopping(obj);
        aobj.mainMenu(name);
    }
}