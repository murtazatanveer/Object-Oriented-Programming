package Bank_Management_System;

import java.util.Scanner;
class client{

	String name , address , username , pass;

	int accNo , balance;

	client(String name , String address , String username , String pass , int accNo,int balance){

		this.name = name;
		this.address = address;
		this.username = username;
		this.pass = pass;
		this.accNo = accNo;
		this.balance=balance;

		}

	void deposit(int balance){this.balance += balance;}

	void withdraw(int balance){this.balance -= balance;}

	}

public class Bank_Management_System{

    static client [] person = new client[20];

    static Scanner inp = new Scanner(System.in);

    static int amount;

    static int entries=0;

	static String u,p;

	public static void main(String [] str){

    int choice=0;

	do{

		displayMenu();

	   System.out.print("\nChoice : ");
       choice=inp.nextInt();

	   switch (choice) {

		case 1:
		openAccount();
		break;

		case 2:
		input();
		deposit(u, p);
		break;

		case 3:
		input();
		withdraw(u, p);
		break;

		case 4:
		input();
		sendAmount(u, p);
		break;

		case 5:
		input();
		changeUsernamePass(u, p);
		break;

		case 6:
		input();
		viewDetails(u, p);
		break;

		case 7:
        System.out.println("Exitting....");
		break;

		default:
		System.out.println("Invalid Choice");

	   }

		}while(choice!=7);


		}

	static void displayMenu(){

		System.out.print("\n\n1. Open Account.\n2. Deposit Amount.");
		System.out.print("\n3. Withdraw Amount.\n4. Transfer Amount.\n5. Change Password and Username\n6. View Account Details\n7. Exit\n");


		}



	static void changeUsernamePass(String username , String pass){

			int i;
		for(i=0;i<person.length;i++){

			 if(person[i]!=null && person[i].username.equals(username) && person[i].pass.equals(pass)) {

		         System.out.print("\nSet New Username : ");
		         person[i].username = inp.nextLine();

		         System.out.print("\nSet New Password : ");
		         person[i].pass = inp.nextLine();
		         break;

				 }

			   }

		  if(i==person.length){System.out.println("\nError! Incorrect Username or Password");}

		}


		static void viewDetails(String username,String pass){

			int i;
			for(i=0;i<person.length;i++){

				 if(person[i]!=null && person[i].username.equals(username) && person[i].pass.equals(pass)){

					 System.out.println("\nName       : "+person[i].name);
					 System.out.println("Address    : "+person[i].address);
					 System.out.println("Username   : "+person[i].username);
					 System.out.println("Password   : "+person[i].pass);
					 System.out.println("Account No : "+person[i].accNo);
					 System.out.println("Balance    : "+person[i].balance);
					 break;

					}

			  }

			if(i==person.length){System.out.println("\nError! Incorrect Username or Password");}

			}

		 static void withdraw(String username, String pass) {

		       for (int i = 0; i < person.length; i++) {

		           if (person[i] != null && person[i].username.equals(username) && person[i].pass.equals(pass)) {

		               System.out.print("\nEnter Amount you want to Withdraw : ");
		               amount = inp.nextInt();

		               if (amount > person[i].balance) {

		                   System.out.println("ERROR! Insufficient Balance for this Transaction\nYour current balance is " + person[i].balance);

		               } else {

		                   person[i].withdraw(amount);
		                   System.out.println("Amount Withdrawn Successfully!");
		                   System.out.println("Your Balance : " + person[i].balance);

		               }
		               return;
		           }
		       }

		       System.out.println("\nError! Incorrect Username or Password");

   }

	    static void deposit(String username , String pass){

	           int i;
	           for(i=0;i<person.length;i++){

	              if(person[i]!=null && person[i].username.equals(username) && person[i].pass.equals(pass)){

	                  System.out.print("\nEnter Amount you want to Deposit : ");
	                  amount=inp.nextInt();

	                  person[i].deposit(amount);
	                  System.out.println("Amount Deposited Successfully!");
	                  System.out.println("Your Balance : "+person[i].balance);

	                   return;

	                  }

	               }

	          if(i==person.length){System.out.println("\nError! Incorrect Username or Password");}


       }

		static void openAccount(){

            inp.nextLine();
			System.out.print("\nEnter Your Name : ");
			String name = inp.nextLine();

			System.out.print("\nEnter Your Address : ");
			String address = inp.nextLine();

			System.out.print("\nSet Your Username : ");
			String username = inp.nextLine();

			System.out.print("\nSet Your Password: ");
			String pass = inp.nextLine();

			int accNo = (int)(Math.random() * 10000);

			int balance = 100;

            person[entries] = new client(name, address, username, pass, accNo,balance);

			System.out.println("\nYour Account Number is "+person[entries].accNo);
			System.out.print("\nYour Opening Balance is "+person[entries].balance);

             entries++;

			}

		static void sendAmount(String username , String pass){

		  int no;
		  int a;
		  int i;

		  for(i=0;i<person.length;i++){

	  			 if(person[i]!=null && person[i].username.equals(username) && person[i].pass.equals(pass)){

					System.out.print("\nEnter Account Number : ");
					no=inp.nextInt();

					System.out.print("\nEnter Amount you want to Transfer : ");
					amount=inp.nextInt();

					if(amount>person[i].balance){System.out.println("\nERROR! Insufficient Balance for this Transaction\nYour current balance is " + person[i].balance);}
               
				else{ 
						int j;
				for(j=0;j<person.length;j++){

	  			 if(person[j]!=null && person[j].accNo==no){

					 System.out.println("\nAccount Holder Details\nName       : "+person[j].name+"\nAccount No : "+person[j].accNo);

					 System.out.print("Press 1 to Transfer : ");
					 a=inp.nextInt();

					 if(a==1){
					  person[i].withdraw(amount);
					  person[j].deposit(amount);
					  System.out.println("\nAmount Transfered Successfully");
				      }
					  return;
					   }

					  }

				   if(j==person.length){System.out.println("\nError! Incorrect Account Number");}}

					 return;
					}

	  			 }

	  			 if(i==person.length){System.out.println("\nError! Incorrect Username or Password");}

			}

	   static void input(){

         inp.nextLine();
         System.out.print("\nEnter Username : ");
		 u = inp.nextLine();

		 System.out.print("\nEnter Password : ");
		 p = inp.nextLine();

		}


	}