package Lab_Assignment_2;
import java.util.Scanner;
public class questionNo6{

	public static void main(String [] str){

         Scanner inp = new Scanner(System.in);

		System.out.print("Enter size of your array : ");

		int size = inp.nextInt();

		int [] numbers = new int[size];

		int [] result = new int[size+1];

		System.out.print("\nEnter elements of your array with spaces : ");

		for(int i=0;i<numbers.length;i++){

		numbers[i]=inp.nextInt();

					}

		System.out.print("Enter location of element you want to insert : ");

		int location = inp.nextInt();

		System.out.print("Enter element you want to insert : ");

		int elementInsert = inp.nextInt();

		for(int i = 0;i<location;i++){

			result[i]=numbers[i];

			}



		for(int i=location+1;i<result.length;i++){

			result[i] = numbers[i-1];


			}


			System.out.print("\nResultant array is : ");

			for(int i=0;i<result.length;i++){

						if(location==i){result[i]=elementInsert;}

			}

		for(int i=0;i<result.length;i++){

			System.out.print(result[i]+" ");
			}
        inp.close();

		}

	}