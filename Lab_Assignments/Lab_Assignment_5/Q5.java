package Lab_Assignment_5;

class animal{

	String name;
	int feedingTime;

	animal(String name,int feedingTime){
		this.name=name;
		this.feedingTime=feedingTime;
		}

		void display(){

			System.out.println("Name : "+name+"\nFeeding Time : "+feedingTime);

			}

	}

public class Q5{
	public static void main(String []str){

		animal ani = new animal("Tiger",1300);
		ani.display();

		}

	}
