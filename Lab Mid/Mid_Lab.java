import java.util.Scanner;
class bankAccount{

    String name;
    int accNo;
    String email;
    String accType;
    int balance;

    static int accNoGenerate=700;
    Scanner inp = new Scanner(System.in);
    static int entries=0;


    void generateAccNo(){

        this.accNo=accNoGenerate;
        accNoGenerate++;

    }

    void deposit( bankAccount []users){

        System.out.print("Enter Your Account Number : ");
        int no=inp.nextInt();

        System.out.print("Enter amount You Want to Deposit : ");
        int amount =inp.nextInt();

        int index = userExist(no,users);

        if(index!=0){users[index].balance += amount;System.out.println("Amount Deposited!");}

        else{System.out.println("Account Number doesnot Exist");}


    }

    void withdraw(bankAccount []users){

        System.out.print("Enter Your Account Number : ");
        int no=inp.nextInt();

        System.out.print("Enter amount You Want to Withdraw : ");
        int amount =inp.nextInt();

        int index = userExist(no,users);

        if(index!=0){users[index].balance -= amount;System.out.println("Amount WithDrawn!");}

        else{System.out.println("Account Number doesnot Exist");}


    }

    void display(bankAccount []users){

        System.out.print("Enter Your Account Number : ");
        int no=inp.nextInt();


        int index = userExist(no,users);

        if(index!=0){

        System.out.println("\nName : "+users[index].name+"\nAccount No : "+users[index].accNo+"\nEmail : "+users[index].email+"\nAccount Type : "+users[index].accType+"\nBalance : "+users[index].balance);
    }else{System.out.println("Account Number doesnot Exist");}

}


    void deleteAcc(bankAccount []users){

        System.out.print("Enter Account Number of person you want to Delete Account : ");
        int no=inp.nextInt();

        int index = userExist(no, users);

        if(index!=0){
            users[index]=null;
            System.out.println("Account Deleted Successfully");
        }

        else{
            System.out.println("Account Number doesnot Exist");
        }

    }

    int userExist(int no , bankAccount [] clients){

        for(int i=0;i<entries;i++){

            if(clients[i]==null){continue;}

            if(clients[i].accNo==no){
                return i;
            }
        }
        return 0;
    }

    void get(bankAccount []users){


        System.out.print("Enter Name : ");
        users[entries].name=inp.nextLine();
        System.out.print("Enter Your Email : ");
        users[entries].email=inp.nextLine();
        System.out.print("Enter Account Type (Current/PLS) : ");
        users[entries].accType=inp.nextLine();

        users[entries].generateAccNo();
        System.out.print("Your Account Number is "+users[entries].accNo);
        entries++;

    }

    void displayMenu(){    

        System.out.println("\n\n1. Generate Account\n2. Display Account Details\n3. Deposit Amount\n4. Withdraw Amount\n5. Delete Acoount\n6. EXIT\n");
        System.out.print("Choice : ");
    }


}

public class Mid_Lab {

    public static void main(String[] args) {

        System.out.println("________WELCOME TO BANK MANAGEMENT SYSTEM_______\n");

        bankAccount run = new bankAccount();
        Scanner inp = new Scanner(System.in);

        bankAccount []users = new bankAccount[20];

        for(int i=0;i<users.length;i++){users[i]=new bankAccount();}

        int choice;
        do{
            run.displayMenu();
            choice=inp.nextInt();

            switch (choice) {
                case 1:
                run.get(users);
                break;

                case 2:
                run.display(users);
                break;

                case 3:
                run.deposit(users);
                break;

                case 4:
                run.withdraw(users);
                break;

                case 5:
                run.deleteAcc(users);
                break;

                case 6:
                System.out.println("EXITTING....");
                break;
                default:
                System.out.println("Invalid Choice");
                    break;
            }

        }while(choice!=6);




    }

}
