package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class arrays{

	public static void main(String [] str){
 
		//int [] numbers = {10,17,25,100,13,10,200,0,-100,-1000,200};

		// System.err.println(maxElement(numbers));
		// makeArray();
		// System.out.println(reverse_string("java.programming"));

		// int [] arr = {25,10,13,8,17,11,56,23,98,23,46,10,17};

		// rotateArray(arr,9);

		// for(int i=0;i<arr.length;i++){System.out.print(arr[i]+" ");}

		//System.out.println(toUpperCase("hi i am murtaza tanveer"));
        //arrayFunctions();

		//arrayFunctions();

		int [] numbers = {9,2,5,13,1,8,2,1,5,11,7,9};

		int [] duplicateNumbers = duplicateNumbersArray(numbers);

		System.out.println(Arrays.toString(duplicateNumbers));

	
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

	public static int [] sortArray(int [] arr){

					int count=0;
			
					int [] copyArr = new int[arr.length];
			
					for(int i=0;i<arr.length;i++){
						for(int j=0;j<arr.length;j++){
			
							if(arr[i]>arr[j]){count++;}
			
							}
			
							copyArr[count]=arr[i];
							count=0;
			
						}
			
						for(int i=0;i<copyArr.length;i++){arr[i]=copyArr[i];}
			
						return arr;
			
					}

	public static int[] rotateArray(int [] arr,int distance){

				int [] copyArr = new int[arr.length];
				int j = 0,count=0;
			
				for(int i=distance;i<arr.length;i++){
			
						copyArr[j] = arr[i];
						j++;
						count++;
			
							}
			
				j=0;
			
				for(int i=count;i<arr.length;i++){
			
							copyArr[i]=arr[j];
							j++;
						}
			
				for(int i=0;i<arr.length;i++){arr[i]=copyArr[i];}
			
				return arr;
			
			}


	public static int [] even_numbers_at_even_indexes(int [] arr){

			int count = 0;
	
			for(int i=0;i<arr.length;i++){
		
				if((i%2 == 0) && (arr[i]%2 == 0)){count++;}
		
			}
		
			if(count == 0){return arr;}
		
			int [] evenNumbers = new int[count];
			int j=0;
		
			for(int i=0;i<arr.length;i++){
		
				if((i%2 == 0) && (arr[i]%2 == 0)){
					evenNumbers[j]=arr[i];
					j++;
				}
		
			}
		
			return evenNumbers;
		
			}


		public static String toUpperCase(String str){

				char [] alphabets = str.toCharArray();
		
				for(int i=0;i<alphabets.length;i++){
		
					if(alphabets[i]>=97 && alphabets[i]<=122){
						alphabets[i] -= 32;
						}
		
					}
		
					return new String(alphabets);
		}

		static void arrayFunctions(){

             //Sorting array

			int [] numbers = {10,60,28,98,56,13,85,27};

			Arrays.sort(numbers);

			for(int i=0;i<numbers.length;i++){

				System.out.print(numbers[i]+"  ");

				}

			//Binary Search

			int index = Arrays.binarySearch(numbers,56);

				System.out.println("\n"+index);

            //Is Arrays Equal

			int []arr1 = {1,2,3,4,5};
			int []arr2 = {4,7,2,9,6,5,8};

			boolean result = Arrays.equals(arr1,arr2);

			System.out.println(result);

			//Filling Array

			//Arrays.fill(numbers,50);
			//System.out.println();
			//for(int i=0;i<numbers.length;i++){System.out.print(numbers[i]+"  ");}

            //Copying one array into another array

            int []copy = Arrays.copyOf(numbers,numbers.length);

            System.out.print("\n");
			for(int i=0;i<numbers.length;i++){System.out.print(copy[i]+"  ");}

			System.out.println("\nArray to String : "+Arrays.toString(numbers));

            for(int i=0;i<numbers.length;i++){System.out.print(numbers[i]+"  ");}

			Arrays.sort(arr2);
			System.out.println(Arrays.toString(arr2));

			}

	static int [] duplicateNumbersArray(int []arr){

		int count=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
		
				if(arr[i]==arr[j]){count++;}
		
					}
				}
		
		int [] copy = new int[count];
		int k=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
		
				if(arr[i]==arr[j]){
					copy[k]=arr[i];
				    k++;
				 }
		
			}
		}
		
		return copy;
		
				}
	}
