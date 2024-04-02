import java.util.Scanner;

class student{

	String name;
	int rollno;
	int marks;
	int age;

	int calcAge(int birthYear){
		return 2024-birthYear;
		}

	student(/*String name,int rollno,int marks,int by*/){

        Scanner inp = new Scanner(System.in);

	    System.out.print("\nEnter Name : ");
		this.name = inp.nextLine();  //name;

		System.out.print("\nEnter Roll No : ");
		this.rollno = inp.nextInt();  //rollno;

		System.out.print("\nEnter Marks : ");
		this.marks= inp.nextInt(); //marks;

		System.out.print("\nEnter Birth Year : ");
		int by = inp.nextInt();
		this.age = calcAge(by);

        inp.close();

		}

		void display(){System.out.println("Name : "+name+"\nRoll No : "+rollno+"\nAge : "+age+"\nMarks : "+marks);}


	}

public class constructors{
	public static void main(String [] str){

		student stu = new student();//"Murtaza",96,60,2003);

		stu.display();

		}
	}


