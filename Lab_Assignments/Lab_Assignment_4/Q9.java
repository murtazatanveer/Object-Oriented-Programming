package Lab_Assignment_4;

class book{

	int bookId;
	int pages;
	int price;

	book(int id,int pag,int pri){

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

		book b1 = new book(11,950,2000);


		book b2 = new book(22,700,1350);

		b1.display();
		System.out.println("\n");
		b2.display();

		int maxPrice = b1.getPrice() > b2.getPrice() ? b1.getPrice() : b2.getPrice();

		System.out.println("\nMaximum Price : "+maxPrice);


		}

	}

