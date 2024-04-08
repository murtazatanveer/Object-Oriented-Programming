package Lab_Assignment_2;

import java.util.Scanner;

public class questionNo3{

	public static void main(String [] murtaza){

		 Scanner inp = new Scanner(System.in);

		 		System.out.print("Enter size of your array : ");

		 		int size = inp.nextInt();

		 		int [] arrayA = new int[size];

		 		System.out.print("\nEnter elements of your array with spaces : ");

		 		for(int i=0;i<arrayA.length;i++){

		 			arrayA[i]=inp.nextInt();

			}

		              int [] arrayB = new int[5];

		              int [] arrayC = new int[5];

		              int sizeCopy=size-1;

		              for(int i=0;i<size;i++){

						  arrayB[i] = arrayA[sizeCopy];
						  sizeCopy--;
						  }

						  for(int i = 0;i<size;i++){

							  arrayC[i] = arrayA[i] + arrayB[i];

							  }

							  System.out.print("\nAll three arrays are : ");

							  System.out.println("\nArray A:");

							  for(int i = 0;i<size;i++){

							  		  System.out.print(arrayA[i]+" ");

							  }

							  System.out.println("\nArray B (Reverse of A):");

							   for(int i = 0;i<size;i++){

							  		System.out.print(arrayB[i]+" ");

							  }

							   System.out.println("\nArray C (Sum of A and B):");

							  for(int i = 0;i<size;i++){

							  	 System.out.print(arrayC[i]+" ");

							  }
                    inp.close();



		}

	}
