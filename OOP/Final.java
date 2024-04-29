final class A{

	A(){System.out.println("A class constructor.");}

	void print(){System.out.println("Call me A method.");}

    void print(int x){System.out.println(x);}

	}

 //class B extends A{} // (Error! cannot extends final class).

 class C{

	 C(){System.out.println("C class constructor.");}

	 final void greet(){System.out.println("Good Evening.");}

	 }

class D extends C{

	D(){System.out.println("D class constructor.");}

	//void greet(){System.out.println("Good Evening.");} (ERROR! cannot override final method)


	}

public class Final{
	public static void main(String [] str){
 
		}
}


