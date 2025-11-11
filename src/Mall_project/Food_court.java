package Mall_project;

import java.util.Scanner;

public class Food_court {
    static Scanner sc = new Scanner(System.in);
    String name;
    private Parking_management_main parkingObj;

    public Food_court(String name, Parking_management_main parkingObj) {
        this.name = name;
        this.parkingObj = parkingObj;

        System.out.println("\n\n\n                       ****************************************");
        System.out.println("                       *                                      *");
        System.out.println("                       *  Welcome to Food Court In LULU MALL! *");
        System.out.println("                       *                                      *");
        System.out.println("                       ****************************************");
    }

    public void Food_court(String name2) {
        while (true) {
            int foodCourtOption = 0;

            System.out.println("\n\n\n\n\n                 *  PLJ choose one option...");
            System.out.println("                    ------------------------\n");
            System.out.println("                 *  1. KFC...");
            System.out.println("                 *  2. DOMINOS...");
            System.out.println("                 *  3. Burger KING...");
            System.out.println("                 *  4. STARBUCKS...");
            System.out.println("                 *  5. Main Menu...");
            System.out.print("\n                 *  Enter your choice (1-5): ");

            if (sc.hasNextInt()) {
                foodCourtOption = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("\n                 *  Please enter valid number (1-5)...");
                sc.nextLine();
                continue;
            }

            if (foodCourtOption == 5) {
                Store_shopping obj = new Store_shopping(parkingObj);
                obj.mainMenu(name);
                return;
            }

            String[] items = new String[5];
            int[] prices = new int[5];
            String shopName = "";

            switch (foodCourtOption) {
                case 1:
                    shopName = "KFC";
                    items = new String[]{"Hot & Crispy Chicken", "Variety Buckets", "Classic Zinger Box", "Popcorn Chicken"};
                    prices = new int[]{550, 499, 399, 699};
                    break;
                case 2:
                    shopName = "DOMINOS";
                    items = new String[]{"Margherita", "Farmhouse", "Peppa Paneer", "Delux Veggie"};
                    prices = new int[]{99, 299, 249, 499};
                    break;
                case 3:
                    shopName = "Burger KING";
                    items = new String[]{"Whopper", "Maharaja Veg Burger", "Tandoori Chicken Burger", "Double Patty Burger"};
                    prices = new int[]{89, 149, 199, 189};
                    break;
                case 4:
                    shopName = "STARBUCKS";
                    items = new String[]{"Frappuccino", "Filter Coffee", "Caffè Lattes", "Cappuccino"};
                    prices = new int[]{299, 99, 320, 349};
                    break;
                default:
                    System.out.println("\n                 * Invalid choice.");
                    continue;
            }

            while (true) {
                System.out.println("\n\n                  *  Welcome [" + name + "] In " + shopName + " Food Court Section...");
                System.out.println("                   -----------------------------------------\n");
                for (int i = 0; i < items.length; i++) {
                    System.out.println("                 *  " + (i + 1) + ". " + items[i] + " ===> " + prices[i]);
                }
                System.out.println("                 *  5. Back to Food Court Menu");
                System.out.print("\n                 *  Enter your choice (1-5): ");

                int itemChoice = 0;
                if (sc.hasNextInt()) {
                    itemChoice = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("\n                 *  Invalid input. Please enter numbers only...");
                    sc.nextLine();
                    continue;
                }

                if (itemChoice == 5) {
                    break; 
                }

                if (itemChoice < 1 || itemChoice > 4) {
                    System.out.println("\n                 *  Invalid choice. Please select between (1-5)");
                    continue;
                }

                String itemName = items[itemChoice - 1];
                int price = prices[itemChoice - 1];

                System.out.print("\n                 *  How many you want? ");
                int quantity = 0;
                if (sc.hasNextInt()) {
                    quantity = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("\n                 * Invalid input. Please enter a number");
                    sc.nextLine();
                    continue;
                }

                int total = price * quantity;
                double finalBill = total - (total * 0.10);

                System.out.println("\n                 *   [" + name + "] You selected: " + itemName + " | Price: " + price);
                System.out.println("\n\n                 *  Your bill on " + itemName + " is [" + total + "] RS-/");
                System.out.println("                 *  Congratulation you have 10% discount = [" + Math.round(total * 0.10) + "] RS-/");
                System.out.println("\n                 *  [" + name + "] Your Final Bill is: [" + finalBill + "] RS-/");

                System.out.println("\n                 *  [" + name + "] PLJ Pay The Bill Of This Bar Code [" + finalBill + "] RS-/\n\n");

                System.out.println("                               #############");
                System.out.println("                               #############");
                System.out.println("                               #############");
                System.out.println("                               #############");
                System.out.println("                               #############");
                System.out.println("                               #############");

                System.out.print("\n                 *  Thankyou So Much [" + name + "] For Visiting " + shopName + " Shop..\n\n\n");

                int option2 = 0;
                while (true) {
                    System.out.println("\n                 *  1. Want to buy another item?");
                    System.out.println("                 *  2. Back to Food Court Menu");
                    System.out.print("                 *  Enter your choice: ");

                    if (sc.hasNextInt()) {
                        option2 = sc.nextInt();
                        sc.nextLine();

                        if (option2 == 1) {
                            break; // continue current shop
                        } else if (option2 == 2) {
                            new Food_court(name, parkingObj); // restart food court menu
                            return;
                        } else {
                            System.out.println("\n                 *  Please enter (1 or 2) only...");
                        }
                    } else {
                        System.out.println("\n                 *  Please enter (1 or 2) only...");
                        sc.nextLine();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Parking_management_main obj = new Parking_management_main();
        String name = obj.meth1();
        Food_court aobj = new Food_court(name, obj);
        aobj.Food_court(name);
    }
}