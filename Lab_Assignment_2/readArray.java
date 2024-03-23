package Lab_Assignment_2;

import java.util.Scanner;
public class readArray{

	public static void main(String [] murtaza){

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter size of your array : ");

		int size = inp.nextInt();

		int [] array = new int[size];

		System.out.print("\nEnter elements of your array with spaces : ");

		for(int i=0;i<array.length;i++){

			array[i]=inp.nextInt();

			}

		System.out.print("\nEnter number you want to read : ");

		int input = inp.nextInt();

		int count = 0;

		for(int i=0;i<array.length;i++){

				if(input==array[i]){ count++;}

							}

		int [] numberIndexes = new int[count];

		int j=0;

		for(int i=0;i<array.length;i++){

			if(input==array[i]){
			numberIndexes[j]=i;
				j++;}
									}

		System.out.print("\n"+input+" exist "+count+" times and its indexes in array are : ");

		for(int i=0;i<array.length;i++){

		System.out.print(numberIndexes[i]+" ");

					}

        inp.close();

		}
        

	}
