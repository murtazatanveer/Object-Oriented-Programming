package Methods;

public class methodsOverloading{

	static void printBirthday(){

		System.out.println("Happy Birthday");

		}

	static void printBirthday(String name){

		System.out.println("Happy Birthday "+name);

		}

		static int sum(int a,int b,int c){return a+b+c;}

		static int sum(int a,int b){return a+b;}

	public static void main(String [] str){

		printBirthday();
		printBirthday("Murtaza");

		System.out.println(sum(10,20));

		System.out.println(sum(5,10,20));


		}
	}
