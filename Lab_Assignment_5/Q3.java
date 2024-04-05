package Lab_Assignment_5;

import java.util.Scanner;
class student{

	String name;
	int rollno;
	String address;
	String [] courses=new String[5];
	int [] marks=new int[5];
	int totalMarks;
	int average;
	Scanner inp = new Scanner(System.in);

	student(String nam,int roll,String add){
		name = nam;
		rollno=roll;
		address=add;

		}


	void setCourses(){

			for(int i=0;i<5;i++){
				System.out.print("\nEnter "+(i+1)+" Course : ");
				courses[i]=inp.nextLine();}

		}

	void setMarks(){

		System.out.print("\nEnter Marks of your 5 courses by spaces : ");
		for(int i=0;i<5;i++){marks[i]=inp.nextInt();}

		}


	void setTotal(){

		for(int i=0;i<5;i++){
			totalMarks += marks[i];}

		}

	 void setAverage(){average = (int)(totalMarks/5);}


		 void display(){

			 System.out.print("\nName    : "+name);
			 System.out.print("\nRoll No : "+rollno);
			 System.out.print("\nAddress : "+address);
			 System.out.println("\n\nCourses and their Marks\n");

			 for(int i=0;i<5;i++){

				 System.out.println(courses[i]+"    :    "+marks[i]);

				 }
			 System.out.println("\nTotal Marks : "+totalMarks+"\nAverage   : "+average);
			 }

	}

public class Q3{
	public static void main(String [] str){

        System.out.println("1st Student Requirements");
		student s1 = new student("Murtaza",96,"Jhelum");

		s1.setCourses();
		s1.setMarks();
		s1.setTotal();
		s1.setAverage();
		s1.display();

		System.out.println("\n2nd Student Requirements");
		student s2 = new student("Xyz",100,"Abbottabad");

		s2.setCourses();
		s2.setMarks();
		s2.setTotal();
		s2.setAverage();
		s2.display();

		}
	}
