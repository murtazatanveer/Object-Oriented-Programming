package Lab_Assignment_4;

class triangle{

	float side1,side2,side3;

	triangle(float s1,float s2,float s3){

		side1=s1;
		side2=s2;
		side3=s3;

		}

		float getPerimeter(){return (float)(side1+side2+side3);}

		float getArea(){return (float)((side1*side2)/2);}

	}

public class Q1{
public static void main(String [] str){

	triangle tri = new triangle(3f,4f,5f);

	System.out.println("Area : "+tri.getArea());

	System.out.println("Perimeter : "+tri.getPerimeter());

	}

}
