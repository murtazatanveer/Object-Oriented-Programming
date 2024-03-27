package Methods;
import java.util.Arrays;

public class varArgs{

	static void changeArray(int ...arr){

			int add=5;

		for(int i =0;i<arr.length;i++){
				arr[i] = add;
				add += 10;
				}

		}

	public static void main(String [] str){

		int [] numbers = {10,20,30,40,50,60};

        changeArray(numbers);

        System.out.println(Arrays.toString(numbers));

		}
	}
    