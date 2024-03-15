package Arrays;

public class reverseArray{

	public static void main(String [] str){

		int [] evenNumbers = {2,4,6,8,10};

		array_reverse(evenNumbers);

		// Reversed array is

		for(int i = 0;i<evenNumbers.length;i++){

			System.out.print(evenNumbers[i]+" ");

			}

		}

		public static int[] array_reverse(int [] numbers){

			int temp = 0;

			for(int i =0;i< (int)(numbers.length/2);i++){

				temp = numbers[i];
				numbers[i] = numbers[numbers.length - i-1];
				numbers[numbers.length - i-1] = temp;

				}

				return numbers;

			}

	}