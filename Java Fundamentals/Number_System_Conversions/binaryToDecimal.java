package Number_System_Conversions;
import java.util.Scanner;

public class binaryToDecimal{

	public static void main(String [] str){

		Scanner input = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
		long binaryNum = input.nextLong();
		long binaryNumCopy = binaryNum;
		long lastDigit = 0,decimalNum=0,power=0;

		while(binaryNum>0){

		lastDigit = binaryNum % 10;
		decimalNum += lastDigit * Math.pow(2,power);
		binaryNum /= 10;
		power++;

            }

            System.out.println("\nAfter converting "+binaryNumCopy+" into Decimal Number : "+decimalNum);
            input.close();

		}

	}
