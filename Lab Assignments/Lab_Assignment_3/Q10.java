package Lab_Assignment_3;

import java.util.Scanner;
class rectangle{

	float length;
	float width;

	void get(){

		Scanner inp = new Scanner(System.in);

		System.out.print("\nEnter length : ");
		length = inp.nextFloat();

		System.out.print("\nEnter Width : ");
		width = inp.nextFloat();

		inp.close();

		}

	int set(float l , float w){

		if( (l>0.0 && l<20.0 ) && (w>0.0 && w<20.0 ) ){

			length = l;
			width = w;
			return 1;
		  }
	  return 0;

		}

	float perimeter(){return (float)(2*(length + width));}

	float area(){return (float)(length * width);}

	}

public class Q10{

	public static void main(String [] str){

		rectangle obj = new rectangle();

		obj.set(10.5f,3.5f);

		System.out.println("Area : "+obj.area()+"\nPerimeter : "+obj.perimeter());


		}
	}

