import java.util.Scanner;
public class Armstrong_Numbers {

    public static void main(String [] str){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Starting Num : ");
		int startNum = input.nextInt();

		System.out.print("\nEnter Ending Num : ");
		int endNum = input.nextInt();

		int copyNum,lastNum=0,rev=0;

		System.out.println("\nArmstrong numbers from "+startNum+" to "+endNum+" are ");

		for(int num = startNum;num<=endNum;num++){

			copyNum=num;

			while(copyNum>0){

				lastNum = copyNum%10;
				rev = (rev*10) + lastNum;
				copyNum /= 10; // copyNum = copyNum / 10;

				}

				if(rev==num){

					System.out.print(num+" ");

					}

					rev = 0;
					lastNum = 0;


			}


    
}

}
