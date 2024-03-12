
import java.util.Scanner;

public class first {

    public static void main(String[] str) {

        System.out.println("Welcome To Java");

       // Datatypes in Java

       int num =10;
       System.out.println(num);

       long bigNum = 9999999;

       System.err.println(bigNum);

       short smallNum = 100;

       System.err.println(smallNum);

       float decimalNumber = 10.5f;
       System.err.println(decimalNumber);

       double number = 10.28746398;
       System.out.println(number);

        boolean x = 5>3;
        System.out.println(x);

        String name = "Murtaza";
        System.out.println(name);

        char ch = 'A';
        System.out.println(ch);

        // How to interact from the user in java
        
        Scanner input = new Scanner(System.in);

		System.out.println("Give Inputs in each Datatype\n");

	    System.out.print("int : ");

		 num = input.nextInt();

		System.out.print("\nLong : ");

		 bigNum = input.nextLong();

		System.out.print("\nfloat : ");

		float decimalNum = input.nextFloat();

		System.out.print("\ndouble : ");

		double longDecimalNum = input.nextDouble();

		System.out.print("\nchar : ");

		 ch = input.next().charAt(0);

		System.out.print("String : ");

		 name = input.nextLine();

		System.out.println("\nYou Entered\n");

		System.out.println("int : "+num+"\nlong : "+bigNum+"\nfloat : "+decimalNum+"\ndouble : "+longDecimalNum+"\nch : "+ch+"\nString : "+name);

        
   
    }

    
}