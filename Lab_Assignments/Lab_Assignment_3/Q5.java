package Lab_Assignment_3;

import java.util.Scanner;

class carPart{

	int modelno;
	int cost;
	int partno;

	void display(){

		System.out.println("Model No : "+modelno+"\nCost : "+cost+"\nPart No : "+partno);
		}

	}


public class Q5{

	public static void main(String [] str){

		Scanner inp = new Scanner(System.in);

		carPart obj = new carPart();

		System.out.print("\nEnter Car Model No : ");
		obj.modelno=inp.nextInt();

		System.out.print("\nEnter Car Part No : ");
		obj.partno=inp.nextInt();

		System.out.print("\nEnter Car Price : ");
		obj.cost=inp.nextInt();

		System.out.println();
		obj.display();

        inp.close();


		}


	}

    

