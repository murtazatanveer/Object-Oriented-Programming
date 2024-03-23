package Lab_Assignment_3;

import java.util.Scanner;
class average{

	int n1,n2,n3;

	void display(int n1 , int n2 , int n3){

		int avg = (n1+n2+n3)/3;
		System.out.println("Average : "+avg);

		}

	}

public class Q4{

	public static void main(String [] str){

		Scanner inp = new Scanner(System.in);

		average q1 = new average();

		System.out.print("Enter three numbers with spaces : ");
		q1.n1 = inp.nextInt();
		q1.n2 = inp.nextInt();
		q1.n3 = inp.nextInt();

		System.out.println();
		q1.display(q1.n1,q1.n2,q1.n3);

        inp.close();
		}}

