package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileReadandWrite{
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Records.");
            System.out.println("2. View Records.");
            System.out.println("3. Exit.");
            System.out.print("Choice: ");
            choice = inp.nextInt();
            inp.nextLine(); 

            switch (choice) {
                case 1:
                    addRecord(inp);
                    break;
                case 2:
                    viewRecords();
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (choice != 3);

        inp.close();
    }

    static void addRecord(Scanner inp) {
        try (FileWriter write = new FileWriter("File_Handling/record.txt", true)) {
            System.out.print("Enter name: ");
            String name = inp.nextLine();
            System.out.print("Enter Roll No: ");
            int roll = inp.nextInt();
            inp.nextLine(); // Consume newline

            write.write(name + "\n" + roll + "\n");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    static void viewRecords() {
        boolean hasRecords = false;

        try (BufferedReader read = new BufferedReader(new FileReader("File_Handling/record.txt"))) {
            String line;

            while ((line = read.readLine()) != null) {
                System.out.println("Name: " + line);
                if ((line = read.readLine()) != null) {
                    System.out.println("Roll No: " + line);
                }
                hasRecords = true;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        if (!hasRecords) {
            System.out.println("No Records Added");
        }
    }

}
