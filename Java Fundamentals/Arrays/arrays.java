package Arrays;

import java.util.Scanner;
public class arrays{

	public static void main(String [] str){
 
		//int [] numbers = {10,17,25,100,13,10,200,0,-100,-1000,200};

		//System.err.println(maxElement(numbers));
		//makeArray();
		System.out.println(reverse_string("java.programming"));
		
		}

		public static void makeArray(){

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

		  public static int maxElement(int [] arr){

			int max = arr[0];

			for(int i = 1;i<arr.length;i++){

				if(arr[i]>=max){  max =arr[i];}

				}

				return max;

			}

			public static String reverse_string(String str){

				char [] alphabets = str.toCharArray();
	
				char temp;
	
				for(int i =0;i<(int)(alphabets.length/2);i++){
	
					temp = alphabets[i];
					alphabets[i] = alphabets[alphabets.length-i-1];
					 alphabets[alphabets.length-i-1] = temp;
	
					}
	
					return new String (alphabets);
	
				}

	}
