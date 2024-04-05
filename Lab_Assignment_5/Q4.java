package Lab_Assignment_5;

class account{

	String name;
	int id;
	int balance;

	void set(String nam,int id){
		name=nam;
		this.id=id;
		}

	account(){this.balance=0;}

	int getBalance(){return this.balance;}

	void deposit(int amu){this.balance += amu;}

	void withdraw(int amu){

		if(amu<=this.balance){
		this.balance -= amu;}
		else{
			System.out.println("Insuffcient amount for this transaction");
			}
		}

		void displayBalance(){

			System.out.println("Current Balance in Dollars are : "+(int)(this.balance/100));

			}

	}

public class Q4{
	public static void main(String []str){

		account acc = new account();
		acc.set("Murtaza",10);
		System.out.println("Current Balance : "+acc.getBalance());
		acc.deposit(500);
		System.out.println("After Depositing : "+acc.getBalance());
		acc.withdraw(300);
		System.out.println("After Withdraw : "+acc.getBalance());
		acc.displayBalance();
		}
	}
