
abstract class A{

    A(){System.out.println("I am A class Constructor");}

    void printHelloWorld(){System.out.println("Hello World");}

    abstract void greet();
    abstract void printJava();
    
}

 abstract class B extends A{

    
    void greet(){System.out.println("Good Evening");}

    @Override
    void printJava(){System.out.println("Java Is Fun");}

    B(){System.out.println("I am B Class Constructor");}

}

class C extends B{

    C(){
        System.out.println("I am C Class Constructor");
    }

    void greet(){System.out.println("Good Evening.....");}

    void printC(){System.out.println("Hello I am C class");}
    void printJava(){System.out.println("Java Is Fun and Easy");}
}

abstract class D extends A{

    D(){System.out.println("I am D Class Constructor");}

	void displayNumbers(){
		for(int i=1;i<=10;i++){System.out.println(i);}
		}

		void greet(){System.out.println("Good Morning");}

	}

	class E extends D{

		E(){System.out.println("I am E Class Constructor");}

		void printJava(){System.out.println("Java is Mostly Used in Mobile Application Development");}

		}

public class Abstract_Classes_and_Methods{
    public static void main(String[] args) {

        //C obj = new C();

        // obj.printHelloWorld();
        // obj.greet();
        // obj.printJava();

        // E ob2 = new E();
        // ob2.printJava();
        // ob2.greet();
        // ob2.displayNumbers();

        A a = new C();

         a.printHelloWorld();
        // a.greet();
        a.printJava();
        a.greet();
    }

}
