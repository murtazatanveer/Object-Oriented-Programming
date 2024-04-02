package Lab_Assignment_3;

 class courseResult{

	String name;
	String course;
	char grade;


	void display(){

		System.out.println("Name : "+name+"\nCourse : "+course+"\nGrade : "+grade);

		}


	}


public class Q1{

	public static void main(String [] str){

		courseResult stu1 = new courseResult();

		stu1.name = "Murtaza";
		stu1.course = "Object Oriented Programming";
		stu1.grade = 'A';


		courseResult stu2 = new courseResult();

		stu2.name = "Naseem";
	    stu2.course = "Financial Accounting";
		stu2.grade = 'B';

		stu1.display();
		System.out.println("\n");
		stu2.display();

		}


	}

