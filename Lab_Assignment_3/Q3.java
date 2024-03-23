package Lab_Assignment_3;

class student{

	String name;
	int rollNo;

	void display(){

		System.out.println("Name : "+name+"\nRoll No : "+rollNo);

		}

}


public class Q3{

	public static void main(String [] str){

		student stu = new student();

		stu.name = "Muhammad Umar";

		stu.rollNo = 105;

		stu.display();

		}}

