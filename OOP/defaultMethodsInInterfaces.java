

interface myInterface{

    void meth1(String name);
    default void meth2(){System.out.println("I am Meth 2");meth4(21);}
    void meth3();
    private void meth4(int age){System.out.println(age);}

}

abstract class A implements myInterface{

    void greet(){System.out.println("How Are You ?");}

    void print(){System.out.println("HELLO WORLD!");}

    //public void meth2(){System.out.println("I am Overrided");}

}

class B extends A{

    public void meth1(String n){System.out.println(n);}

    public void meth3(){System.out.println("I am Meth 3.");}

}

public class defaultMethodsInInterfaces {

    public static void main(String[] args) {

        A ob1 = new B();

        ob1.print();
        ob1.greet();
        ob1.meth1("Murtaza");
        ob1.meth2();
        ob1.meth3();        
    }
    
}

