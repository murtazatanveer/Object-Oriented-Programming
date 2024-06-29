package File_Handling;

import java.io.*;
import java.util.Scanner;

class Student {

    String name;
    String regNo;
    int marks;
    static int entries = 0;
    static Scanner inp = new Scanner(System.in);

    Student(String name, String regNo, int marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("\nName: " + name + "\nReg No: " + regNo + "\nMarks: " + marks + "\n");
    }

    void addNewRecord() {
        boolean flag = true;

        while (flag) {
            try {
                System.out.print("Enter Student Name: ");
                String n = inp.nextLine();
                System.out.print("Enter Student Reg No: ");
                String r = inp.nextLine();
                System.out.print("Enter Student Marks: ");
                int m = inp.nextInt();
                inp.nextLine(); 

                FileWriter w = new FileWriter("File_Handling/demo.txt", true);
                w.write(n + "\n" + r + "\n" + m + "\n");
                w.close();

                flag = false;
                entries++;

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    void fetchRecord(Student[] stu) {
        try (BufferedReader read = new BufferedReader(new FileReader("File_Handling/demo.txt"))) {
            String name;
            int i = 0;

            while ((name = read.readLine()) != null) {
                String regNo = read.readLine();
                String marks = read.readLine();

                if (stu[i] == null) {
                    stu[i] = new Student(name, regNo, Integer.parseInt(marks));
                }
                i++;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    void displayAllRecords(Student[] stu) {
        fetchRecord(stu);

        for (int i = 0; i < entries; i++) {
            if (stu[i] != null) {
                stu[i].display();
            }
        }
    }

    void displayStudentRecord(Student[] stu) {
        fetchRecord(stu);

        System.out.print("Enter Student Reg No: ");
        String r = inp.nextLine();

        for (int i = 0; i < entries; i++) {
            if (stu[i] != null && stu[i].regNo.equals(r)) {
                stu[i].display();
                return;
            }
        }

        System.out.println("Registration Number Not Found in Record");
    }
}

public class demo {
    public static void main(String[] args) {

        System.out.println("\tSchool Registration System");

        Scanner inp = new Scanner(System.in);
        int choice = -1;

        Student[] stu = new Student[20];
        Student run = new Student(null, null, 0);

        do {
            System.out.println("1. Add Records.");
            System.out.println("2. Display All Records.");
            System.out.println("3. Display Student Record");
            System.out.println("4. Exit");

            try {
                System.out.print("\nChoice: ");
                choice = inp.nextInt();
                inp.nextLine(); // Consume newline
            } catch (Exception e) {
                System.out.println("Error: " + e);
                inp.nextLine(); // Consume invalid input
                choice = 4;
            }

            switch (choice) {
                case 1:
                    run.addNewRecord();
                    break;
                case 2:
                    run.displayAllRecords(stu);
                    break;
                case 3:
                    run.displayStudentRecord(stu);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (choice != 4);

        inp.close();
    }
}


