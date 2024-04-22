class A{

	String name="Murtaza";

	A(){System.out.println("A Class Constructor");}

	A(int num){System.out.println("A Class Constructor with value "+num);}

	void print(){System.out.println("Welcome to class A");}

	void greet(){System.out.println("Good Evening");}

	void displayName(){System.out.println(this.name);}

	}

class B extends A{

	void print(){System.out.println("I changes my class.\nWelcome to class B");}

	

	B(){System.out.println("I am B Class Constructor");}

	void pakistan(){System.out.println("Welcome to pakistan");}

	void greet(){System.out.println("Good Morning");}


	}
public class methodsDispatch{
	public static void main(String [] str){

     //B ob = new B();
     //ob.print();

	//  A ob2 = new A();
	//  ob2.print();

	 A ob3 = new B();

	 ob3.print();
	 ob3.displayName();
	 ob3.greet();


		}
	}


