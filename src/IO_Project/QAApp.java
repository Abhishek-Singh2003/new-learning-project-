package IO_Project;

import java.io.*;
import java.util.*;

public class QAApp {
    private static final String FILE_NAME = "D:\\Java\\Project_file.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Q&A System hello");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.print("Choose your role: ");
        int role = sc.nextInt();
        sc.nextLine();  // consume newline

        switch (role) {
            case 1:
                teacherMode(sc);
                break;
            case 2:
                studentMode(sc);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    private static void teacherMode(Scanner sc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.print("Enter your name (Teacher): ");
            String teacherName = sc.nextLine();

            System.out.print("Enter subject: ");
            String subject = sc.nextLine();

            bw.write("Subject: " + subject);
            bw.newLine();

            System.out.println("How many questions do you want to add?");
            int count = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter Question " + i + ":");
                String question = sc.nextLine();

                bw.write("Q" + i + ": " + question);
                bw.newLine();
                bw.write("--------------------------------");
                bw.newLine();
            }

            System.out.println("Questions saved successfully! Program will now exit.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void studentMode(Scanner sc) {
        System.out.print("Enter your name (Student): ");
        String studentName = sc.nextLine();

        File file = new File(FILE_NAME);
        if (!file.exists() || file.length() == 0) {
            System.out.println("\nNo questions available yet.");
            return;
        }

        System.out.println("\nWelcome, " + studentName + "! Here are all the questions:\n");

        // Read all lines
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Display only questions (ignore previous answers)
        int questionIndex = 0;
        for (String line : lines) {
            if (line.startsWith("Q")) {
                System.out.println(line);
            }
        }

        // Let student answer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            System.out.println("\nPlease provide your answers:");

            for (String line : lines) {
                if (line.startsWith("Q")) {
                    questionIndex++;
                    System.out.print("Answer for " + line + ": ");
                    String studentAnswer = sc.nextLine();

                    // Append student answer in file
                    bw.write("Student Ans: " + studentAnswer);
                    bw.newLine();
                    bw.write("--------------------------------");
                    bw.newLine();
                }
            }

            System.out.println("Your answers have been saved!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
