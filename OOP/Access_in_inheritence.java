// 1st Example
class A {
    int i; // public by default
    private int j; // private to A
    
    
    void setij(int x, int y) {
    i = x;
    j = y;
    }
    int getj(){return j;}
    }

    // A's j is not accessible here.
    class B extends A {
    int total;
    void sum() {
    total = getj() + i;
    }
    }
    
    //2nd Example
    
   class X{
    private int num1;
    private int num2;

    void setter(int a,int b){
        num1=a;
        num2=b;
    }

    int getNum1(){return num1;}
    int getNum2(){return num2;}

   }

   class Y extends X{
    private int sum;

    void sum(){sum = getNum1() + getNum2();}

    int getSum(){return sum;}

   }
    
    class Access_in_inheritence{
    public static void main(String args[]) {
    
    //1st Example Obj
    B subOb = new B();
    subOb.setij(10, 20);
    subOb.sum();
    System.out.println("Total is " + subOb.total);
    
    //2nd example Obj
    
    Y ob = new Y();
    
    ob.setter(50,100);
    ob.sum();
    System.out.println("\nSum : "+ob.getSum());
    }
    }