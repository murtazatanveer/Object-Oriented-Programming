package Lab_Assignment_3;

import java.util.Scanner;
class book{

	int bookId;
	int pages;
	int price;

	void get(){

	Scanner inp = new Scanner(System.in);

	System.out.print("\nEnter Book Id : ");
	bookId = inp.nextInt();

	System.out.print("\nEnter Book Pages : ");
	pages = inp.nextInt();

	System.out.print("\nEnter Book Price : ");
	price = inp.nextInt();

    inp.close();
		}

	void set(int id,int pag,int pri){

		bookId = id;
		pages = pag;
		price = pri;

		}

		int getPrice(){return price;}


		void display(){

	           System.out.println("\nBook ID : "+bookId+"\nPages : "+pages+"\nPrice : "+price);

			}

	}

public class Q9{

	public static void main(String [] Str){

		book b1 = new book();

		b1.set(11,950,2000);

		book b2 = new book();

		b2.set(22,700,1350);

		b1.display();
		System.out.println("\n");
		b2.display();

		int maxPrice = b1.getPrice() > b2.getPrice() ? b1.getPrice() : b2.getPrice();

		System.out.println("\nMaximum Price : "+maxPrice);


		}

	}

