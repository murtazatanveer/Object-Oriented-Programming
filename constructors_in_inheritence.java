class a{

	a(){System.out.println("I am A class constructor");}
    a(int x){System.out.println("I am A class constructor with value of x as "+x);}
	}

class b extends a{

    b(int x){System.out.println("I am B class constructor with value of x as "+x);}

	b(){
		super(99);
		System.out.println("I am B class constructor");}

	}

class c extends b{

	c(){System.out.println("I am C class constructor");}

	}




public class constructors_in_inheritence{

	public static void main(String [] str){

		c obj = new c();

		}

	}
