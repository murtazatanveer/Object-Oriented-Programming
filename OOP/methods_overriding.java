public class methods_overriding{
	public static void main(String [] str){

          B b = new B();

          b.print(21);
          b.print();
          b.print(10.56f);
          b.print("Moon");

		}
	}

class A{

	void print(int age){
		System.out.println("My name is Murtaza.\nMy age is "+age);
		}

	void print(){System.out.println("I am in a class");}

	void print(float x){System.out.println(x);}

	}

class B extends A{

    @Override
	void print(int age){
		System.out.println("My name is Murtaza.\nMy age is "+age+"\nI studied in Comsats");
		}

    @Override   
	void print(){System.out.println("I am in b class");}
    
    
	void print(String s){System.out.println(s);}

	}