abstract class A {
    int i, j;
    A(int a, int b) {
    i = a;
    j = b;
    }
    // display i and j
    void show() {
    System.out.println("i and j: " + i + " " + j);
    }

}

class B extends A {
    int k;
    B(int a, int b, int c) {
    super(a, b);
    k = c;
    }
    void show() {
    super.show(); // this calls A's show()
    System.out.println("k: " + k);
    }

    
    }

public class Overriding2 {

    public static void main(String[] args) {
        B ob = new B(10,20,30);
        ob.show();
    }
    
}
