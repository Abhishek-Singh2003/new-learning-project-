package Mall_project;

import java.util.Scanner;

public class Store_shopping {
    static Scanner sc = new Scanner(System.in);
    private Parking_management_main parkingObj; // Reference to Parking_management_main

    // Constructor to accept Parking_management_main instance
    public Store_shopping(Parking_management_main parkingObj) {
        this.parkingObj = parkingObj;
    }

    void mainMenu(String name) {
        int main_option = 0;
        while (true) {
            System.out.println("\n\n\n\n\n                 *  PLJ choose one option...");
            System.out.println("                    ------------------------\n");
            System.out.println("                 *  1. Store & Shopping ");
            System.out.println("                 *  2. Food-Court ");
            System.out.println("                 *  3. Movie-Theater");
            System.out.println("                 *  4. Exit ");
            System.out.print("\n                 *  Enter your choice (1-4): ");

            if (sc.hasNextInt()) {
                main_option = sc.nextInt();
                sc.nextLine(); // clear buffer

                if (main_option == 1) {
                    storeShopping(name);
                    return;
                } else if (main_option == 2) {
                    Food_court obj = new Food_court(name, parkingObj);
                    obj.Food_court(name);
                } else if (main_option == 3) {
                    Movie_theater obj = new Movie_theater(parkingObj);
                    obj.meth1();
                } else if (main_option == 4) {
                    parkingObj.meth2(); 
                    break;
                } else {
                    System.out.println("\n                 *  Please enter choice between (1 to 4) only...");
                }
            } else {
                System.out.println("\n                 *  Invalid input! Please enter numbers only (1-4).");
                sc.nextLine(); // Clear invalid input
            }
        }
    }

    void storeShopping(String name) {
        while (true) {
            int shop_option = 0;
            while (true) {
                System.out.println("\n\n                  *  Welcome [" + name + "] In Shopping Section...");
                System.out.println("                   -----------------------------------------\n");
                System.out.println("                 *  PLJ Choose Which Shop you Go...");
                System.out.println("                    -------------------------------\n");
                System.out.println("                 *  1. LOUIS PHILIPPE ");
                System.out.println("                 *  2. PETER ENGLAND ");
                System.out.println("                 *  3. MUFTI");
                System.out.println("                 *  4. Main Menu");
                System.out.print("\n                 *  Enter your choice (1-4): ");

                if (sc.hasNextInt()) {
                    shop_option = sc.nextInt();
                    sc.nextLine();

                    if (shop_option == 4) {
                        mainMenu(name);
                        return;
                    }
                    if (shop_option >= 1 && shop_option <= 3) {
                        break;
                    } else {
                        System.out.println("\n                 *  Please enter Choice Btw (1 to 4) only.");
                    }
                } else {
                    System.out.println("\n                 *  Please enter Choice Btw (1 to 4) only...");
                    sc.nextLine();
                }
            }

            String shop_name = "";
            switch (shop_option) {
                case 1:
                    shop_name = "LOUIS PHILIPPE";
                    break;
                case 2:
                    shop_name = "PETER ENGLAND";
                    break;
                case 3:
                    shop_name = "MUFTI";
                    break;
            }

            int cloth_option = 0;
            while (true) {
                System.out.println("\n\n                 *  Welcome [" + name + "] In [" + shop_name + "] Shop...");
                System.out.println("                  ---------------------------------------------\n");
                System.out.println("                 *  PLJ choose one option...");
                System.out.println("                    ------------------------\n");
                System.out.println("                 *  1. MENS ");
                System.out.println("                 *  2. WOMENS ");
                System.out.println("                 *  3. CHILDREN");
                System.out.println("                 *  4. Main Menu");
                System.out.print("\n                 *  Enter your choice (1-4): ");

                if (sc.hasNextInt()) {
                    cloth_option = sc.nextInt();
                    sc.nextLine();

                    if (cloth_option == 4) {
                        mainMenu(name);
                        return;
                    }
                    if (cloth_option >= 1 && cloth_option <= 3) {
                        break;
                    } else {
                        System.out.println("\n                 *  Please enter Choice Btw (1 to 4) only...");
                    }
                } else {
                    System.out.println("\n                 *  Please enter Choice Btw (1 to 4) only...");
                    sc.nextLine();
                }
            }

            if (cloth_option == 1) {
                System.out.println("\n\n                 *  Welcome [" + name + "] In [" + shop_name + "] Shop...");
                System.out.println("                 ------------------------------------------------------\n");
                System.out.println("                 *  1. Shirt - 1500");
                System.out.println("                 *  2. Pant - 1999");
                System.out.println("                 *  3. Baggy Jeans - 3000");
                System.out.println("                 *  4. T-Shirt - 1700");
            } else if (cloth_option == 2) {
                System.out.println("\n\n                 *  Welcome [" + name + "] In [" + shop_name + "] Shop...");
                System.out.println("                 ------------------------------------------------------\n");
                System.out.println("                 *  1. Sari - 4999");
                System.out.println("                 *  2. Suit-Salwar - 3999");
                System.out.println("                 *  3. Baggy Jeans - 3500");
                System.out.println("                 *  4. Jump-Suit - 6500");
            } else if (cloth_option == 3) {
                System.out.println("\n\n                 *  Welcome [" + name + "] In [" + shop_name + "] Shop...");
                System.out.println("                 ------------------------------------------------------\n");
                System.out.println("                 *  1. Hoodies - 1999");
                System.out.println("                 *  2. Jackets - 3500");
                System.out.println("                 *  3. Blazers - 2500");
                System.out.println("                 *  4. Shirt-Pant Set - 3000");
            }

            int Cloth1 = 0;
            while (true) {
                System.out.print("\n                 *  Please enter item number (1-4): ");
                if (sc.hasNextInt()) {
                    Cloth1 = sc.nextInt();
                    sc.nextLine();
                    if (Cloth1 >= 1 && Cloth1 <= 4) {
                        break;
                    } else {
                        System.out.println("\n                 * Please enter number between 1 to 4.");
                    }
                } else {
                    System.out.println("\n                 *  Please enter numbers only...");
                    sc.nextLine();
                }
            }
            String itemName = "";
            int price = 0;

            if (cloth_option == 1) {
                switch (Cloth1) {
                    case 1:
                        itemName = "Shirt";
                        price = 1500;
                        break;
                    case 2:
                        itemName = "Pant";
                        price = 1999;
                        break;
                    case 3:
                        itemName = "Baggy Jeans";
                        price = 3000;
                        break;
                    case 4:
                        itemName = "T-Shirt";
                        price = 1700;
                        break;
                }
            } else if (cloth_option == 2) {
                switch (Cloth1) {
                    case 1:
                        itemName = "Sari";
                        price = 4999;
                        break;
                    case 2:
                        itemName = "Suit-Salwar";
                        price = 3999;
                        break;
                    case 3:
                        itemName = "Baggy Jeans";
                        price = 3500;
                        break;
                    case 4:
                        itemName = "Jump-Suit";
                        price = 6500;
                        break;
                }
            } else if (cloth_option == 3) {
                switch (Cloth1) {
                    case 1:
                        itemName = "Hoodies";
                        price = 1999;
                        break;
                    case 2:
                        itemName = "Jackets";
                        price = 3500;
                        break;
                    case 3:
                        itemName = "Blazers";
                        price = 2500;
                        break;
                    case 4:
                        itemName = "Shirt-Pant Set";
                        price = 3000;
                        break;
                }
            }

            System.out.print("\n                 *  How many you want? ");
            int quantity = sc.nextInt();
            sc.nextLine();

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

            System.out.print("\n                 *  Thankyou So Much [" + name + "] For Shopping In [" + shop_name + "]\n\n\n");

            int option2 = 0;
            while (true) {
                System.out.println("\n                 *  1. Want to buy another item?");
                System.out.println("                 *  2. Go to Main Menu");
                System.out.print("                 *  Enter your choice: ");

                if (sc.hasNextInt()) {
                    option2 = sc.nextInt();
                    sc.nextLine();

                    if (option2 == 1) {
                        break;
                    } else if (option2 == 2) {
                        mainMenu(name);
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

    public static void main(String[] args) {
        Parking_management_main obj = new Parking_management_main();
        String name = obj.meth1();
        Store_shopping aobj = new Store_shopping(obj);
        aobj.mainMenu(name);
    }
}