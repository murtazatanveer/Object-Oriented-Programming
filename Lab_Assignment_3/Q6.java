package Lab_Assignment_3;

class building{

	float area;
	int occupants;

	void set(float a , int o){

		area = a;
		occupants = o;

		}

	float areaPerPerson(){return (float)(area/occupants);}

	}

public class Q6{

	public static void main(String [] str){

		building house = new building();

		house.set(36.0f , 4);

		building office = new building();

		office.set(300.0f , 50);

		System.out.println("\nArea_Per_Person for House : "+house.areaPerPerson());
		System.out.println("Area_Per_Person for Office : "+office.areaPerPerson());
		}

	}

