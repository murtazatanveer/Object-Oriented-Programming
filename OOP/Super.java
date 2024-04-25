
class A{
    int x;

	 void diplay(){System.out.println("Value of X in Class A : "+x);};
}

class B extends A{

	int x;

	void setter(int a , int b){
		this.x = a;
		super.x=b;
	}

	void display(){
		super.diplay();
		System.out.println("Value of X in Class B : "+this.x);
	}

}

public class Super{
	public static void main(String [] str){

		B ob = new B();

		ob.diplay();
		ob.setter(50, 99);
		ob.diplay();
		
		
		}
	
	}