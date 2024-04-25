class Z{

	int a;
	static int b;
	void set(int x , int y){
		a=x;
		b=y;
		}
	void display(){
		System.out.println("A : "+a+"\nB : "+b+"\n X : "+up.x);
		}

	void update(){a++;b++;}

	void updateX(){up.x++;}

	}

class up{
	static int x=0;

	void display(){System.out.println("X : "+x);}


}



public class Static{
	public static void main(String [] str){

		Z ob1 = new Z();
		ob1.set(5,10);
		ob1.update();
		ob1.display();
		ob1.update();

		Z ob2 = new Z();
		ob2.display();

		//Use of static variable in Other Class.

		ob1.updateX();
		ob2.updateX();

		up ob3 = new up();

		ob3.display();




		}
	}
