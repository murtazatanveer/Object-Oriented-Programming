package Number_System_Conversions;
import java.util.Scanner;
public class decimalToBinary{

	public static void main(String [] str){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Decimal Number : ");
		int decimalNum = input.nextInt();
		String binaryNum = "";

		int digit;

		while(decimalNum>1){

			digit = decimalNum % 2;

			decimalNum /= 2;

			if(digit==1){

				binaryNum = "1" + binaryNum;

				}else{

					binaryNum = "0" + binaryNum;

					}


			}

			binaryNum = "1" + binaryNum;
		    System.out.println("\nAfter converting "+decimalNum+" into Binary Number : "+binaryNum);

            input.close();


		}
	}
