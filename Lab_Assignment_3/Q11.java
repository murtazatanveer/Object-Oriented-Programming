package Lab_Assignment_3;

import java.util.Scanner;
class result{

	String name;
	int rollno;
	int [] marks = new int[3];
	int totalMarks;

	void input(){

		Scanner inp = new Scanner(System.in);

		System.out.print("\nEnter Name of Student : ");
		name = inp.nextLine();

		System.out.print("\nEnter Roll_No of Student : ");
		rollno = inp.nextInt();

		System.out.print("\nEnter Marks of three Subjects with Spaces : ");

		for(int i=0;i<3;i++){marks[i] = inp.nextInt();}

		inp.close();

		}


	  void show(){

		  System.out.print("\nStudent Details\n"+"\nName : "+name+"\nRoll No : "+rollno+"\nMarks : ");

		  for(int i=0;i<3;i++){System.out.print(marks[i]+" ");}

		  }

	  int total(){

		  for(int i=0;i<3;i++){totalMarks+=marks[i];}

		  return totalMarks;

		  }

	int average(){return (int)(totalMarks/3);}


	}

public class Q11{

	public static void main(String [] str){

		result stu = new result();

		stu.input();
		stu.show();

		System.out.println("\n\nTotal Marks : "+stu.total()+"\nAvarage of Marks :"+stu.average());

		}

	}

