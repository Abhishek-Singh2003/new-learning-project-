package Mall_project;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Movie_theater {
    static Scanner sc = new Scanner(System.in);
    static Set<String> bookedSeats = new HashSet<>(); // Track booked seats
    private Parking_management_main parkingObj;

    public Movie_theater(Parking_management_main parkingObj) {
        this.parkingObj = parkingObj;
    }

    void meth1() {
        // Display welcome message
        System.out.println("\n\n");
        System.out.println("         ****************************************************");
        System.out.println("         *                                                  *");
        System.out.println("         *         Welcome to PVR Theater..!!               *");
        System.out.println("         *                                                  *");
        System.out.println("         ****************************************************");

        String movie;
        // Get valid movie name
        while (true) {
            System.out.print("\n\n\n                 *  Please Enter Which Movie You Will See: ");
            movie = sc.nextLine().trim();
            if (movie.matches("[a-zA-Z0-9 ]+") && !movie.isEmpty()) {
                break;
            } else {
                System.out.println("                 *  Invalid input! Please enter a valid movie name (letters, numbers, spaces).");
            }
        }

        while (true) {
            // Display section menu
            System.out.println("\n\n\n                 *  Which Section Would You Prefer...");
            System.out.println("                    ----------------------------\n");
            System.out.println("                 *  1. Gold...");
            System.out.println("                 *  2. Platinum...");
            System.out.println("                 *  3. Recliner...");
            System.out.println("                 *  4. Main Menu...");
            System.out.print("\n                 *  Enter your choice (1-4): ");

            if (sc.hasNextInt()) {
                int sectionChoice = sc.nextInt();
                sc.nextLine(); // Clear the buffer
                if (sectionChoice >= 1 && sectionChoice <= 4) {
                    if (sectionChoice == 4) {
                        Store_shopping obj = new Store_shopping(parkingObj);
                        obj.mainMenu("");
                    }

                    String section = "";
                    int price = 0;
                    String[] validSeats = null;

                    // Handle section selection
                    if (sectionChoice == 1) {
                        section = "Gold";
                        price = 200;
                        validSeats = new String[]{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12",
                                "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10",
                                "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10",
                                "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10",
                                "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"};
                        System.out.println("\n\n");
                        System.out.println("*************************************************************************");
                        System.out.println("*                                                                       *");
                        System.out.println("*                 *  Gold -----------> ₹200                             *");
                        System.out.println("*                    --------------------------                         *");
                        System.out.println("*  [A1] [A2] [A3] [A4] [A5] [A6] [A7]  [A8] [A9] [A10] [A11] [A12]      *");
                        System.out.println("*       [B1] [B2] [B3] [B4] [B5]       [B6] [B7] [B8]  [B9]  [B10]      *");
                        System.out.println("*       [C1] [C2] [C3] [C4] [C5]       [C6] [C7] [C8]  [C9]  [C10]      *");
                        System.out.println("*       [D1] [D2] [D3] [D4] [D5]       [D6] [D7] [D8]  [D9]  [D10]      *");
                        System.out.println("*       [E1] [E2] [E3] [E4] [E5]       [E6] [E7] [E8]  [E9]  [E10]      *");
                        System.out.println("*                                                                       *");
                        System.out.println("*************************************************************************");
                    } else if (sectionChoice == 2) {
                        section = "Platinum";
                        price = 300;
                        validSeats = new String[]{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12",
                                "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12",
                                "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "C11", "C12",
                                "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"};
                        System.out.println("\n\n");
                        System.out.println("****************************************************************************");
                        System.out.println("*                                                                          *");
                        System.out.println("*                 *  Platinum -----------> ₹300                            *");
                        System.out.println("*                   -------------------------------                        *");
                        System.out.println("*     [A1] [A2] [A3] [A4] [A5]  [A6] [A7] [A8] [A9] [A10] [A11] [A12]      *");
                        System.out.println("*     [B1] [B2] [B3] [B4] [B5]  [B6] [B7] [B8] [B9] [B10] [B11] [B12]      *");
                        System.out.println("*     [C1] [C2] [C3] [C4] [C5]  [C6] [C7] [C8] [C9] [C10] [C11] [C12]      *");
                        System.out.println("*         [D1] [D2] [D3] [D4] [D5]     [D6] [D7] [D8] [D9] [D10]           *");
                        System.out.println("*                                                                          *");
                        System.out.println("****************************************************************************");
                    } else if (sectionChoice == 3) {
                        section = "Recliner";
                        price = 400;
                        validSeats = new String[]{"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13",
                                "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"};
                        System.out.println("\n\n");
                        System.out.println("*****************************************************************************");
                        System.out.println("*                                                                           *");
                        System.out.println("*                 *  Recliner -----------> ₹400                             *");
                        System.out.println("*                    ---------------------------                            *");
                        System.out.println("*    [A1] [A2] [A3] [A4] [A5]  [A6] [A7] [A8] [A9] [A10] [A11] [A12] [A13]  *");
                        System.out.println("*         [B1] [B2] [B3] [B4]  [B5]      [B6] [B7] [B8]  [B9]  [B10]        *");
                        System.out.println("*                                                                           *");
                        System.out.println("*****************************************************************************");
                    }

                    // Display screen
                    System.out.println("      ------------------------------------------------------------");
                    System.out.println("     ||                                                          ||");
                    System.out.println("     ||                    *--Screen--*                          ||");
                    System.out.println("     ||                                                          ||");
                    System.out.println("      ------------------------------------------------------------");

                    // Get number of tickets
                    int tickets;
                    while (true) {
                        System.out.print("\n                How Many Tickets to Buy in [" + section + "] ? ");
                        if (sc.hasNextInt()) {
                            tickets = sc.nextInt();
                            sc.nextLine(); // Clear the buffer
                            if (tickets > 0) {
                                break;
                            } else {
                                System.out.println("                 *  Please enter a valid number of tickets (greater than 0).");
                            }
                        } else {
                            System.out.println("                 *  Invalid input! Please enter a number.");
                            sc.nextLine(); // Clear invalid input
                        }
                    }

                    // Get and validate seat numbers
                    String seatNumbers;
                    while (true) {
                        System.out.println("                Please Enter [" + section + "] Seat Numbers in this Format {[A1],[A2]}");
                        seatNumbers = sc.nextLine().trim();

                        // Remove square brackets and split by comma
                        String cleanedInput = seatNumbers.replaceAll("[\\[\\]]", "").trim();
                        String[] selectedSeats = cleanedInput.isEmpty() ? new String[0] : cleanedInput.split("\\s*,\\s*");

                        // Check if the number of seats matches the number of tickets
                        if (selectedSeats.length != tickets) {
                            System.out.println("                 *  Invalid input! Number of seats (" + selectedSeats.length +
                                    ") does not match number of tickets (" + tickets + ").");
                            continue;
                        }

                        // Validate seat format and availability
                        boolean valid = true;
                        Set<String> seatSet = new HashSet<>();
                        for (String seat : selectedSeats) {
                            // Check seat format (e.g., A1, B2, etc.)
                            if (!seat.matches("[A-E][1-9][0-3]?") || !isValidSeat(seat, validSeats)) {
                                System.out.println("                 *  Invalid seat: " + seat + ". Please select valid seats for " + section + ".");
                                valid = false;
                                break;
                            }
                            // Check for duplicate seats
                            if (!seatSet.add(seat)) {
                                System.out.println("                 *  Duplicate seat: " + seat + ". Please select unique seats.");
                                valid = false;
                                break;
                            }
                            // Check if seat is already booked
                            if (bookedSeats.contains(seat)) {
                                System.out.println("                 *  Seat " + seat + " is already booked. Please select another seat.");
                                valid = false;
                                break;
                            }
                        }

                        if (valid) {
                            // Add seats to bookedSeats
                            for (String seat : selectedSeats) {
                                bookedSeats.add(seat);
                            }
                            seatNumbers = "[" + String.join("],[", selectedSeats) + "]";
                            break;
                        }
                    }

                    // Confirm ticket selection
                    System.out.println("\nYou Will Choose [" + tickets + "] Tickets in [" + section + "] Section.");
                    System.out.println("And Their Seat Numbers Are ==> " + seatNumbers);

                    // Calculate total price
                    int totalPrice = tickets * price;
                    System.out.println("Please Pay " + totalPrice + " via This Bar Code");

                    // Display barcode placeholder
                    System.out.println("\n\n");
                    System.out.println("                               #############");
                    System.out.println("                               #############");
                    System.out.println("                               #############");
                    System.out.println("                               #############");
                    System.out.println("                               #############");
                    System.out.println("                               #############");

                    // Bill or snacks menu
                    System.out.println("\n\n                           *  1. Generate Bill");
                    System.out.println("                           *  2. Have Some Snacks");
                    System.out.print("\n                           *  Enter your choice (1-2): ");
                    if (sc.hasNextInt()) {
                        int option2 = sc.nextInt();
                        sc.nextLine(); // Clear the buffer
                        if (option2 == 1) {
                            // Generate bill
                            System.out.println("\n\n                 --------------------- BILL ---------------------");
                            System.out.println("                 *   Movie: " + movie);
                            System.out.println("                 *   Section: " + section);
                            System.out.println("                 *   Number of Tickets: " + tickets);
                            System.out.println("                 *   Seat Numbers: " + seatNumbers);
                            System.out.println("                 *   Total Price: " + totalPrice);
                            System.out.println("                 -----------------------------------------------");
                            
                            Store_shopping obj = new Store_shopping(parkingObj);
                            obj.mainMenu("");
                        } else if (option2 == 2) {
                            // Snacks menu
                            while (true) {
                                System.out.println("\n                 -------** Have Some Snacks for INTERVAL **-------");
                                System.out.println("                 *****************************************************");
                                System.out.println("                 *  1) Popcorn                                       *");
                                System.out.println("                 *  2) Burger                                        *");
                                System.out.println("                 *  3) Beverages                                     *");
                                System.out.println("                 *  4) Snacks                                        *");
                                System.out.println("                 *****************************************************");

                                System.out.print("\n                 Enter your item code (1 to 4): ");
                                if (sc.hasNextInt()) {
                                    int foodOption = sc.nextInt();
                                    sc.nextLine();
                                    int foodPrice = 0, quantity = 0;
                                    String foodItem = "";

                                    if (foodOption == 1) { // Popcorn
                                        while (true) {
                                            System.out.println("\n                 1) Tub Salted Popcorn - 220");
                                            System.out.println("                 2) Cheese Popcorn     - 240");
                                            System.out.print("                 Choose option (1 or 2): ");
                                            if (sc.hasNextInt()) {
                                                int choice = sc.nextInt();
                                                sc.nextLine();
                                                if (choice == 1 || choice == 2) {
                                                    System.out.print("                 Enter quantity: ");
                                                    if (sc.hasNextInt()) {
                                                        quantity = sc.nextInt();
                                                        sc.nextLine();
                                                        if (quantity > 0) {
                                                            foodItem = (choice == 1) ? "Tub Salted Popcorn" : "Cheese Popcorn";
                                                            foodPrice = (choice == 1) ? 220 : 240;
                                                            break;
                                                        } else {
                                                            System.out.println("                 Quantity must be greater than 0.");
                                                        }
                                                    } else {
                                                        System.out.println("                 Invalid input for quantity.");
                                                        sc.nextLine();
                                                    }
                                                } else {
                                                    System.out.println("                 Invalid popcorn choice!");
                                                }
                                            } else {
                                                System.out.println("                 Enter a valid number (1 or 2).");
                                                sc.nextLine();
                                            }
                                        }
                                    } else if (foodOption == 2) { // Burger
                                        while (true) {
                                            System.out.println("\n                 1) Cheese Mahraja Burger       - 189");
                                            System.out.println("                 2) Paneer Double Patty Burger  - 249");
                                            System.out.print("                 Choose option (1 or 2): ");
                                            if (sc.hasNextInt()) {
                                                int choice = sc.nextInt();
                                                sc.nextLine();
                                                if (choice == 1 || choice == 2) {
                                                    System.out.print("                 Enter quantity: ");
                                                    if (sc.hasNextInt()) {
                                                        quantity = sc.nextInt();
                                                        sc.nextLine();
                                                        if (quantity > 0) {
                                                            foodItem = (choice == 1) ? "Cheese Mahraja Burger" : "Paneer Double Patty Burger";
                                                            foodPrice = (choice == 1) ? 189 : 249;
                                                            break;
                                                        } else {
                                                            System.out.println("                 Quantity must be greater than 0.");
                                                        }
                                                    } else {
                                                        System.out.println("                 Invalid input for quantity.");
                                                        sc.nextLine();
                                                    }
                                                } else {
                                                    System.out.println("                 ");
                                                }
                                            } else {
                                                System.out.println("                 Enter a valid number (1 or 2).");
                                                sc.nextLine();
                                            }
                                        }
                                    } else if (foodOption == 3) { // Beverages
                                        while (true) {
                                            System.out.println("\n                 1) Coca-Cola - 99");
                                            System.out.println("                 2) Pepsi     - 89");
                                            System.out.print("                 Choose option (1 or 2): ");
                                            if (sc.hasNextInt()) {
                                                int choice = sc.nextInt();
                                                sc.nextLine();
                                                if (choice == 1 || choice == 2) {
                                                    System.out.print("                 Enter quantity: ");
                                                    if (sc.hasNextInt()) {
                                                        quantity = sc.nextInt();
                                                        sc.nextLine();
                                                        if (quantity > 0) {
                                                            foodItem = (choice == 1) ? "Coca-Cola" : "Pepsi";
                                                            foodPrice = (choice == 1) ? 99 : 89;
                                                            break;
                                                        } else {
                                                            System.out.println("                 Quantity must be greater than 0.");
                                                        }
                                                    } else {
                                                        System.out.println("                 Invalid input for quantity.");
                                                        sc.nextLine();
                                                    }
                                                } else {
                                                    System.out.println("                 Invalid beverage choice!");
                                                }
                                            } else {
                                                System.out.println("                 Enter a valid number (1 or 2).");
                                                sc.nextLine();
                                            }
                                        }
                                    } else if (foodOption == 4) { // Snacks
                                        while (true) {
                                            System.out.println("\n                 1) Sandwich - 169");
                                            System.out.println("                 2) Samosa   - 49");
                                            System.out.print("                 Choose option (1 or 2): ");
                                            if (sc.hasNextInt()) {
                                                int choice = sc.nextInt();
                                                sc.nextLine();
                                                if (choice == 1 || choice == 2) {
                                                    System.out.print("                 Enter quantity: ");
                                                    if (sc.hasNextInt()) {
                                                        quantity = sc.nextInt();
                                                        sc.nextLine();
                                                        if (quantity > 0) {
                                                            foodItem = (choice == 1) ? "Sandwich" : "Samosa";
                                                            foodPrice = (choice == 1) ? 169 : 49;
                                                            break;
                                                        } else {
                                                            System.out.println("                 Quantity must be greater than 0.");
                                                        }
                                                    } else {
                                                        System.out.println("                 Invalid input for quantity.");
                                                        sc.nextLine();
                                                    }
                                                } else {
                                                    System.out.println("                 Invalid snack choice!");
                                                }
                                            } else {
                                                System.out.println("                 Enter a valid number (1 or 2).");
                                                sc.nextLine();
                                            }
                                        }
                                    } else {
                                        System.out.println("                 Invalid food option! Please enter 1 to 4.");
                                        continue;
                                    }

                                    // Show final bill
                                    int totalFoodPrice = quantity * foodPrice;
                                    System.out.println("\n\n                 --------------------- BILL ---------------------");
                                    System.out.println("                 Movie: " + movie);
                                    System.out.println("                 Section: " + section);
                                    System.out.println("                 Number of Tickets: " + tickets);
                                    System.out.println("                 Seat Numbers: " + seatNumbers);
                                    System.out.println("                 Ticket Price: " + totalPrice);
                                    System.out.println("                 Snack: " + foodItem + " (" + totalFoodPrice + ")");
                                    System.out.println("                 Total Price: " + (totalPrice + totalFoodPrice));
                                    System.out.println("                 -----------------------------------------------");
                                    
                                    Store_shopping obj = new Store_shopping(parkingObj);
                                    obj.mainMenu("");
                                } else {
                                    System.out.println("                 Invalid input! Please enter a number between 1 and 4.");
                                    sc.nextLine();
                                }
                            }
                        } else {
                            System.out.println("                 *  Invalid choice! Please enter 1 or 2.");
                            continue;
                        }
                    } else {
                        System.out.println("                 *  Invalid input! Please enter a number between 1 and 2.");
                        sc.nextLine();
                        continue;
                    }
                } else {
                    System.out.println("                 *  Invalid choice! Please enter a number between 1 and 4.");
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("                 *  Invalid input! Please enter a number between 1 and 4.");
                sc.nextLine();
                continue;
            }
        }
    }

    // Helper method to check if a seat is valid for the selected section
    private boolean isValidSeat(String seat, String[] validSeats) {
        for (String validSeat : validSeats) {
            if (validSeat.equals(seat)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Parking_management_main obj = new Parking_management_main();
        String name = obj.meth1();
        Movie_theater aobj = new Movie_theater(obj);
        while (true) {
            aobj.meth1();
            System.out.print("\nDo you want to make another booking? (yes/no): ");
            String continueBooking = sc.nextLine().trim().toLowerCase();
            if (!continueBooking.equals("yes")) {
                break;
            }
        }
        sc.close(); // Close scanner
    }
}