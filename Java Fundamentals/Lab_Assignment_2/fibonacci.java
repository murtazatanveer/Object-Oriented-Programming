package Lab_Assignment_2;

import java.util.Scanner;

public class fibonacci{

	public static void main(String [] murtaza){

		        Scanner input = new Scanner(System.in);

				System.out.print("Enter size of your Fibonacci series : ");

				int n = input.nextInt();

                input.close();

				int [] fab = new int[n];

				fab[0]=1;

				fab[1]=1;

				for(int i=2;i<n;i++){

					fab[i] = fab[i-1] + fab[i-2];

					}

					System.out.print("Fab Series from 1 to "+n+" is : ");

					for(int i=0;i<n;i++){

					   System.out.print(fab[i]+" ");

					}



		}

	}
