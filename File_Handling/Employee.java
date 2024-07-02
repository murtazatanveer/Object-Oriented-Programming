package File_Handling;

import java.util.Scanner;
import java.io.*;

class emp {
    String name;
    int id;
    Scanner inp = new Scanner(System.in);

    void set(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("\nEmployee name: " + name + "\nEmployee ID: " + id + "\n");
    }

    //....................

    void input() {
        boolean flag = true;

        while (flag) {
            try (DataOutputStream wri = new DataOutputStream(new FileOutputStream("File_Handling/Employee.dat", true))) {

                System.out.print("Enter name: ");
                String name = inp.nextLine();
        
                System.out.print("Enter Id: ");
                int id = inp.nextInt();
                inp.nextLine();

                wri.writeUTF(name);
                wri.writeInt(id);
                flag = false;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("\n");
        }
    }

    private int fetchRecord(emp[] e) {
        int i = 0;

        try (DataInputStream read = new DataInputStream(new FileInputStream("File_Handling/Employee.dat"))) {
            boolean flag = true;

            while (flag) {
                try {
                    String name = read.readUTF();
                    int id = read.readInt();

                    if (e[i] == null) {
                        e[i] = new emp();
                        e[i].set(name, id);
                    }
                    i++;

                } catch (EOFException eof) {
                    flag = false;
                } catch (IOException e1) {
                    System.out.println("Error: " + e1.getMessage());
                    flag = false;
                }
            }

        } catch (FileNotFoundException e2) {
            System.out.println("File not found: " + e2.getMessage());
        } catch (IOException e2) {
            System.out.println("Error: " + e2.getMessage());
        }

        return i;
    }

    void showAllRecords(emp[] e) {
        int entries = fetchRecord(e);
        System.out.println("All Records are:\n");

        for (int i = 0; i < entries; i++) {
            e[i].display();
        }
    }

    void showEmployeeRecord(emp[] e){

        int entries = fetchRecord(e);

        System.out.print("Enter the employee id: ");
        int id = inp.nextInt();

        for (int i = 0; i < entries; i++) {
            if(id==e[i].id){
                e[i].display();
                return;               
            }
        }
        System.out.println("Employee Doesnot Exist\n");

    }
}

public class Employee {

    public static void main(String[] args) {
        int choice = 0;
        Scanner inp = new Scanner(System.in);

        emp[] e = new emp[15];
        emp run = new emp();

        do {
            System.out.println("1. Add Records\n2. Display All Records\n3. Display Employee Record\n4. Exit");
            System.out.print("\nChoice: ");
            choice = inp.nextInt();
            inp.nextLine(); 

            switch (choice) {
                case 1:
                    run.input();
                    break;

                case 2:
                    run.showAllRecords(e);
                    break;

                case 3:
                    run.showEmployeeRecord(e);
                    break;
                               
                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (choice != 3);
        inp.close();
    }
}
