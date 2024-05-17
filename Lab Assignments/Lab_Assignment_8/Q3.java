package Lab_Assignment_8;

import java.util.Scanner;
class fruit{

	String name;
	String taste;
	int size;
	Scanner inp = new Scanner(System.in);

	void input(){

		System.out.print("Enter Fruit Name : ");
		name = inp.nextLine();

		System.out.print("Enter Fruit Taste : ");
		taste = inp.nextLine();

		}

		void eat(){
			System.out.println("Name : "+name+"\nTaste : "+taste+"\nSize : "+size);
	}

	}

class apple extends fruit{

	int price;
	int quantity;

	void input(){

		super.input();

		System.out.print("Enter Fruit Size : ");
		size = inp.nextInt();

		System.out.print("Enter Fruit Price : ");
		price = inp.nextInt();

		System.out.print("Enter Fruit Quantity : ");
		quantity = inp.nextInt();

		}

		void eat(){
			super.eat();
			System.out.println("Quantity : "+quantity+"\nPrice : "+price);

			}

	}

	class orange extends fruit{

		int price;
		int quantity;
	
		void input(){
	
			super.input();
	
			System.out.print("Enter Fruit Size : ");
			size = inp.nextInt();
	
			System.out.print("Enter Fruit Price : ");
			price = inp.nextInt();
	
			System.out.print("Enter Fruit Quantity : ");
			quantity = inp.nextInt();
	
			}
	
			void eat(){
				super.eat();
				System.out.println("Quantity : "+quantity+"\nPrice : "+price);
	
				}
	
		}

	public class Q3{

		public static void main(String [] str){

			apple app = new apple();
			app.input();
			app.eat();

			orange or = new orange();
			or.input();
			or.eat();

			}

		}
