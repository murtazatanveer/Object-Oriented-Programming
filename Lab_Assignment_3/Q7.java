package Lab_Assignment_3;

import java.util.Scanner;

class area{

	int len;
	int bre;

	void setDim(int l,int b){

		len = l;
		bre = b;

		}

	int getArea(){

		return len*bre;

		}

	}

public class Q7{

	public static void main(String [] str){

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter Length : ");
		int l = inp.nextInt();

		System.out.print("Enter Breadth : ");
		int b = inp.nextInt();

		area obj = new area();

		obj.setDim(l,b);

		System.out.println("Area is : "+obj.getArea());

        inp.close();
		}}    

