package Lab_Assignment_4;

public class Q2{

	public static void main(String [] str){

		rectangle area1 = new rectangle(4,5);

		rectangle area2 = new rectangle(5,8);

		System.out.println("Area 1 : "+area1.getArea());

		System.out.println("Area 2  : "+area2.getArea());


		}
	}

	class rectangle{

	int len,bre;

	rectangle(int len,int bre){
		this.len=len;
		this.bre=bre;
	}

	int getArea(){return(len*bre);}


}


