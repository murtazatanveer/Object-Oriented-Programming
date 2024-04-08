package Lab_Assignment_5;

import java.util.Scanner;
class car{

	String name,model,owner;
	int price;

	car(){
		Scanner inp = new Scanner(System.in);
		System.out.print("\nEnter Car name : ");
		name = inp.nextLine();
		System.out.print("\nEnter Car model : ");
		model=inp.nextLine();
		System.out.print("Enter Owner name : ");
		owner=inp.nextLine();
		System.out.print("Enter Car price : ");
		price = inp.nextInt();
        inp.close();
		}

		void display(){

			System.out.println("Car Name   : "+name);
			System.out.println("Car Model  : "+model);
			System.out.println("Car Owner  : "+owner);
			System.out.println("Car Price  : "+price);

			}

		int pri(){return price;}

	}

public class Q1{
	public static void main(String [] str){

		System.out.println("\nEnter 1st Car Requirements");
		car c1 = new car();
		System.out.println("\nEnter 2nd Car Requirements");
		car c2 = new car();
		System.out.println("\nEnter 3rd Car Requirements");
		car c3 = new car();

		if(c1.pri()>c2.pri() && c1.pri()>c3.pri()){

			System.out.println("\nThis car has maximum price");
			c1.display();

			}
			else if(c2.pri()>c1.pri() && c2.pri()>c3.pri()){

			System.out.println("\nThis car has maximum price");
			c2.display();

			}

			else{
			System.out.println("\nThis car has maximum price");
			c3.display();
				}

		}

	}