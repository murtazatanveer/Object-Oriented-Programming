package Arrays;

public class randomNumbersArray{

	public static void main(String [] str){

		int size = (int)(Math.random() * 11);

		int []arr = new int[size];

		for(int i=0;i<arr.length;i++){

			arr[i]=(int)(Math.random() * 101);

			}

			for(int i=0;i<arr.length;i++){System.out.println("At location "+i+" : "+arr[i]);}

		}

	}
