package Lab_Assignment_4;

class building{

	float area;
	int occupants;

	building(float area , int occupants){

		this.area = area;
		this.occupants = occupants;

		}

	float areaPerPerson(){return (float)(area/occupants);}

	}

public class Q7{

	public static void main(String [] str){

		building house = new building(36.0f , 4);

		building office = new building(300.0f , 50);


System.out.println("\nArea_Per_Person for House : "+house.areaPerPerson());
System.out.println("Area_Per_Person for Office : "+office.areaPerPerson());

		}

	}

