package Lab_Assignment_4;

 class employee{

	int salary;

	employee(int salary){this.salary = salary;}

	void display(){System.out.println("Salary : "+salary);}

	void update(){salary += (int)((10*salary)/100);}

	}


public class Q5{

	public static void main(String [] str){

		employee emp1 = new employee(10000);

		employee emp2 = new employee(20000);

		System.out.println("Before Increasing : ");

		emp1.display();
		emp2.display();

		System.out.println("\nAfter Increasing : ");

		emp1.update();
		emp2.update();

		emp1.display();
		emp2.display();


		}

	}

