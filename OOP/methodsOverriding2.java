class A{

	static int x=5;

	void greet(){System.out.println("Good Morning");}

    static void print(){System.out.println("OOP is Fun");}

	}

class B extends A{

	int x;

	void greet(){
		super.greet();
		System.out.println("Good Afternoon\nGood Night");
		super.greet();
		}

		static void print(){System.out.println("OOP is not Fun");}

		void update(){
			x++;
			super.x++;

		}

		void display(){System.out.println(x+"\t"+super.x+"\t"+A.x);}

	}

public class methodsOverriding2{
	public static void main(String [] str){

		B ob = new B();

		ob.greet();
		ob.print();

		B.print();

		A.print();

		}
	}
