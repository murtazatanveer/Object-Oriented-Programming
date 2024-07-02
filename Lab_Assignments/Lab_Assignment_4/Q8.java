package Lab_Assignment_4;

class employee{

	String name;
	int yearJoining;
	String add;
	int salary;

	employee(String name,int yearJoining,String add,int salary){

		this.name = name;
		this.yearJoining=yearJoining;
		this.add=add;
		this.salary=salary;

		}

	}


public class Q8{

	public static void main(String [] str){

		employee umar = new employee("Umar",2021,"Islamabad",30000);

		employee adil = new employee("Adil",2010,"Lahore",50000);

		employee zu = new employee("Zubair", 1999,"D.I.K",20000);


		System.out.println("\nName	Year   Salary   Address");

		System.out.println(umar.name+"    "+umar.yearJoining+"    "+umar.salary+"    "+umar.add);

		System.out.println(adil.name+"    "+adil.yearJoining+"    "+adil.salary+"    "+adil.add);

		System.out.println(zu.name+"    "+zu.yearJoining+"    "+zu.salary+"    "+zu.add);


		}}

