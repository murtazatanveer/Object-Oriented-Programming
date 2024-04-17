package Projects.Library_Management_System;
import java.util.Scanner;

class admin{

    String name;
    int id;
    Scanner inp = new Scanner(System.in);

    admin(String name , int id){
        this.name = name;
        this.id = id;
    }

}

class library{

    Scanner inp = new Scanner(System.in);
    String [] books=new String[30];
    int []booksId=new int[30];
    int totalBooks = 0;

    void displayBooks(){
        if(totalBooks==0){System.out.println("No Books are Available.");return;}
        System.out.println("\n\nAvailable Books are : ");
        System.out.println("\nBooks ID     Books Name");
        for (int i = 0; i < totalBooks; i++) {
            System.out.println(booksId[i]+ "            "+books[i]);
        }
    }

    void addBooks(){
        System.out.print("\nEnter Book Name You Want To add : ");
        books[totalBooks]=inp.nextLine();

        booksId[totalBooks]=(int)(Math.random()*99) + 10;
        System.out.println("Book Added Successfully\nBook ID is : "+booksId[totalBooks]);
        totalBooks++;

   }

   void returningBooks(String book){
        booksId[totalBooks]=(int)(Math.random()*99) + 10;
        books[totalBooks]=book;
        totalBooks++;
   }

}

class student{

    String name;
    int id;
    String []books = new String[30];
    int totalBooks=0;
    Scanner inp = new Scanner(System.in);

    student(String name , int id){

        this.name=name;
        this.id=id;

    }

    void issueBook(library lib){

        int iid;

        System.out.print("Enter Book ID : ");
        iid=inp.nextInt();

        int i;
        for( i=0;i<lib.totalBooks;i++){
            if(iid==lib.booksId[i]){

                books[totalBooks]=lib.books[i];
                lib.booksId[i]=0;
                lib.books[i]=null;
                for(int j=i;j<lib.totalBooks;j++){

                    lib.booksId[j]=lib.booksId[j+1];
                    lib.books[j]=lib.books[j+1];
                }
                lib.totalBooks--;
                totalBooks++;
                System.out.println("Book Issued Successfully!");
                return;

            }
        }

    System.out.println("ERROR! Given Book ID doesnot exist.\n");

    }

    void returnBook(library lib){

        System.out.print("\nEnter Book Name : ");
        String b = inp.nextLine();

        for(int i=0;i<totalBooks;i++){
            if(b.equals(books[i])){
                lib.returningBooks(b);
                books[i]=null;
                
                for (int j = i; j <totalBooks ; j++) {
                    books[j]=books[j+1];
                }
                totalBooks--;
                System.out.println("Book Returned Successfully!");
                return;
            }
        }
        System.out.println("Given Book Doesnot Exist in Your Record");

    }

    void displayIssuedBooks(){
        if(totalBooks==0){System.out.println("\nNo Books are Issued in Your Record");return;}

        System.out.println("\nYour Issued Books are : ");

        for (int i = 0; i < totalBooks; i++) {

            System.out.println(i+1+". "+books[i]);

        }
    }

}

public class Library_Management_System {

    static Scanner inp = new Scanner(System.in);
    static String name;
    static int id;
    static admin []ad = new admin[15];
    static student []stu = new student[15];
    static library lib = new library();
    static int owners=0;
    static int users=0;
    static int s;
    public static void main(String[] args) {

        int choice;
        do{
            System.out.print("\n1. Admin\n2. Student\n3. Exit\n\nChoice : ");
            choice=inp.nextInt();

            switch (choice) {

                case 1:
                admin();
                break;

                case 2:
                student();
                break;

                case 3:
                System.out.println("Exitting....");
                break;

                default:
                System.out.println("Invalid Choice!");

            }

        }while(choice!=3);
    }

    static void input(){
		inp.nextLine();
        System.out.print("\n\nEnter Your Name : ");
        name=inp.nextLine();
        System.out.print("Enter Your ID : ");
        id=inp.nextInt();
    }

    static void admin(){

		int choice;

        do {

			System.out.println("\n1. SignUp\n2. Login\n3. Exit");

			System.out.print("\nChoice : ");
            choice = inp.nextInt();

            switch (choice) {

                case 1:
                input();
                ad[owners]=new admin(name,id);
                owners++;
                break;

                case 2:
                adExist();
                break;

                case 3:
                System.out.println("Exitting.....");
                break;

                default:
                System.out.println("Invalid Choice");
                break;
            }

        } while (choice!=3);
    }

    static void adExist(){

        System.out.print("Enter Your ID : ");
        int id = inp.nextInt();
        int i;

        for(i=0;i<owners;i++){
            if(id==ad[i].id){

                adAccess();
                return;
            }
        }

        System.out.println("Given ID doesnot exist!");

    }

    static void adAccess(){

       System.out.println("\n\nLogin Successfully!");
       int ch;
        do {

		System.out.println("\n1. Add New Books.\n2. Display Books.\n3. Exit.");
	    System.out.print("Choice : ");
        ch = inp.nextInt();
            switch (ch){

                case 1:
                lib.addBooks();
                break;

                case 2:
                lib.displayBooks();
                break;

                case 3:
                System.out.println("\nExitting.....");
                break;

                default:
                System.out.println("Invalid Choice");
                break;

            }

        } while (ch!=3);
    }

    static void student(){

        int choice;

        do {

			System.out.println("\n1. SignUp\n2. Login\n3. Exit");

			System.out.print("\nChoice : ");
            choice = inp.nextInt();

            switch (choice) {

                case 1:
                input();
                stu[users]=new student(name,id);
                users++;
                break;

                case 2:
                stuExist();
                break;

                case 3:
                System.out.println("\nExitting.....");
                break;

                default:
                System.out.println("Invalid Choice");
                break;

            }

        }while(choice!=3);
    }

    static void stuExist(){

        System.out.print("Enter Your ID : ");
        int id = inp.nextInt();

        for(s=0;s<owners;s++){
            if(id==stu[s].id){

                stuAccess();
                return;
            }
        }

        System.out.println("Given ID doesnot exist!");

    }

    static void stuAccess(){

        System.out.println("\n\nLogin Successfully!");
        int ch;

         do {

         System.out.println("\n\n1. Display Books.\n2. Issue Book.\n3. Return Book.\n4. Display Issued Books\n5. Exit.");
         System.out.print("Choice : ");
         ch = inp.nextInt();
             switch (ch){

                 case 1:
                 lib.displayBooks();
                 break;

                 case 2:
                 stu[s].issueBook(lib);
                 break;

                 case 3:
                 stu[s].returnBook(lib);
                 break;

                 case 4:
                 stu[s].displayIssuedBooks();
                 break;

                 case 5:
                 System.out.println("\nExitting.....");
                 break;

                 default:
                 System.out.println("Invalid Choice");
                 break;

             }

         } while (ch!=5);

    }
}
