class A{
	A(){System.out.println("A class Constructor");}
	void hello(){System.out.println("Hello World");}
}

class B extends A{
	B(){System.out.println("B class Constructor");}
	void hello(){System.out.println("Hello World.....");}
}

class C extends B{
	C(){System.out.println("C class Constructor");}
}

public class inheritence2 {

	public static void main(String[] args) {

		A ob = new C();
		ob.hello();
		
		
	}
}
