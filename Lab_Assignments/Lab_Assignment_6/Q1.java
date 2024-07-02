package Lab_Assignment_6;

import java.util.Scanner;
class car{

	String name;
	int model;
	int price;
	Scanner inp = new Scanner(System.in);

	void get(){

		System.out.print("Enter Car Name : ");
		name = inp.nextLine();
		System.out.print("\nEnter Car Model : ");
		model=inp.nextInt();
		System.out.print("\nEnter Car Price : ");
		price=inp.nextInt();

		}

		void display(){
			System.out.println("\nCar Name :  "+name+"\nCar Model :  "+model+"\nCar Price : "+price);
			}

		void max(car []c){

			int lar= c[0].price;
			int index=0;

			for(int i=1;i<c.length;i++){
				if(lar<c[i].price){
					lar=c[i].price;
					index=i;

					}
				}
				System.out.println("Car with Maximum Price is");
				c[index].display();

			}

		void fillCarArray(car[] c){

			for(int i=0;i<c.length;i++){
				c[i]=new car();
				System.out.println("\nEnter "+(i+1)+" Car Requirements");
				c[i].get();
				}

			}

	}


public class Q1{
	public static void main(String [] str){

		car [] c = new car[3];

		car main = new car();

		main.fillCarArray(c);
		main.max(c);

		}
	}
