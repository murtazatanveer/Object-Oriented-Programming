class A{
    int x=10;
    int y=10;
    void update(){x++;y++;}
    void display(){System.out.println("X : "+x+" Y : "+y);}
}

public class Objects {

   public static void main(String[] args) {
    
    A ob1 = new A();
    ob1.update();
    ob1.display();

    A ob2 = ob1;
    ob2.update();
    ob1.display();
    ob2.x=50;
    ob2.y=100;
    ob1.display();

   }
    
}
