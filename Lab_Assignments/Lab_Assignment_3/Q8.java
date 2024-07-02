package Lab_Assignments.Lab_Assignment_3;

class employee{

	String name;
	int yearJoining;
	String add;
	int salary;

	}


public class Q8{

	public static void main(String [] str){

		employee umar = new employee();

		umar.name="Umar";
		umar.yearJoining = 2021;
		umar.add="Islamabad";
		umar.salary=30000;


		employee adil = new employee();

		adil.name="Adil";
		adil.yearJoining = 2010;
		adil.add="Lahore";
		adil.salary=50000;


		employee zu = new employee();

		zu.name="Adil";
		zu.yearJoining = 1999;
		zu.add="D.I.K";
		zu.salary=20000;

		System.out.println("\nName	Year   Salary   Address");

		System.out.println(umar.name+"    "+umar.yearJoining+"    "+umar.salary+"    "+umar.add);

		System.out.println(adil.name+"    "+adil.yearJoining+"    "+adil.salary+"    "+adil.add);

		System.out.println(zu.name+"    "+zu.yearJoining+"    "+zu.salary+"    "+zu.add);


		}}

