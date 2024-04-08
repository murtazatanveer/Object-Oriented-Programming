class A{

	A(){System.out.println("A Class Constructor");}
	void print(){System.out.println("Welcome to class A");}

	}

class B extends A{

	void print(){System.out.println("Welcome to class B");}



	void pakistan(){System.out.println("Welcome to pakistan");}


	}
public class methodsDispatch{
	public static void main(String [] str){

     A ob = new A();
     ob.print();
    
	 A ob2 = new A();
	 ob2.print();

		}
	}


