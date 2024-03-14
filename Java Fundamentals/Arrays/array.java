package Arrays;

import java.util.Scanner;
public class array{

	public static void main(String [] str){

		int [] numbers = new int[5];

		Scanner inp = new Scanner(System.in);

		for(int i =0;i<5;i++){

			System.out.print("Enter value at index "+i+" : ");
			numbers[i] = inp.nextInt();

			}
			System.out.println();

		for(int i=0;i<5;i++){

			System.out.println("At Index "+i+" we have : "+numbers[i]);

			}

            inp.close();


		}

	}
