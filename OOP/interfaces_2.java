
interface myInterface{
    void greet();
    void print();
}

class A{

    A(){System.out.println("Class A Constructor.");}

    void print(){System.out.println("Welcome to Class A");}

}

class B extends A implements myInterface{

    public void greet(){System.out.println("Good Night");}

    public void print(){System.out.println("Hello World!");}

}

public class interfaces_2 {

    public static void main(String[] args) {

        B ob = new B();

        ob.print();  

    }

}

class C {   

    C(){System.out.println("Class C Constructor.");}

 interface inte{
    void meth1();
    void meth2();
}

}


class D implements C.inte{

    D(){System.out.println("Class D Constructor.");}

    public void meth1(){System.out.println("I am meth1");}

    public void meth2(){System.out.println("I am meth2");}

}