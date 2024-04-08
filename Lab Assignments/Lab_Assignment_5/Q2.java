package Lab_Assignment_5;

import java.util.Scanner;
class employee{

	String name,code;
	int joinYear;
	Scanner inp = new Scanner(System.in);

	employee(){

		System.out.print("\nEnter Name : ");
		name=inp.nextLine();
		System.out.print("\nEnter Code : ");
		code=inp.nextLine();
		System.out.print("\nEnter Date of joining(in years) : ");
		joinYear = inp.nextInt();

		}

		void tenure(){

			System.out.print("\nEnter Current date(in years) : ");
			int year = inp.nextInt();

			if((year-joinYear)>3){System.out.println("Employee tenure is more than 3 years");}
            else{System.out.println("Employee tenure is less than 3 years");}

			}

	}



public class Q2{

	public static void main(String [] str){

		employee emp1 = new employee();
		emp1.tenure();
		employee emp2 = new employee();
		emp2.tenure();

		}
	}
