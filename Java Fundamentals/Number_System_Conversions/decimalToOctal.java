package Number_System_Conversions;

import java.util.Scanner;

public class decimalToOctal{

	public static void main(String [] str){

		Scanner inp = new Scanner(System.in);

		System.out.print("Enter Decimal Number : ");

		int decimalNum = inp.nextInt();

		int decimalNumCopy = decimalNum;

		String octalNum="";

		while(decimalNum>=8){

			octalNum =  (decimalNum % 8) + octalNum;

		    decimalNum /= 8;

			}

			octalNum = decimalNum + octalNum;

			 System.out.println("\nAfter converting "+decimalNumCopy+" into Octal Number : "+octalNum);

			 inp.close();
		}
	}
