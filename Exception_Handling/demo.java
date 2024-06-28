package Exception_Handling;
import java.util.*;

class AgeException extends Exception{
    AgeException(String str){
        super(str);
    }
}

public class demo{
    public static void main(String[] args) {
        
    Scanner inp = new Scanner(System.in);
        
    try {
        System.out.print("Enter Age : ");
        int age = inp.nextInt();
       if(age>=18){
        System.out.println("You are eligible to vote.");
    }else{
        AgeException ob = new AgeException("Age must be greator than 18.");
        throw ob;
    }
     
    } catch (Exception e) {
        System.out.println("Error : "+e);
    }
    finally{
        System.out.println("Program End without any Stop");
        inp.close();
    }

    }

    
}


// public class demo{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             System.out.print("Enter numerator: ");
//             int numerator = scanner.nextInt();

//             System.out.print("Enter denominator: ");
//             int denominator = scanner.nextInt();

//             int result = numerator / denominator;
//             System.out.println("Result: " + result);
//         } catch (Exception e) {
//             System.out.println(e);
//          } finally {
//             scanner.close();
//         }
//     }
// }


// public class demo {

//     public static void main(String[] args) {
        
//         Scanner inp =new Scanner(System.in);
//         int num=0;

//         while(true){

//         try {
//             System.out.print("Enter any Digit : ");
//             num=inp.nextInt();
//             break;
//         } catch (Exception e) {
//             System.out.println(e+"\n");
//             inp.nextLine();
//         }

//     }

//     System.out.println(num);
//     inp.close();

//  }

// }


// public class demo {

//     public static void main(String[] args) {
        
//        try {
//        int []arr = {5,10,15,20,25};
//        System.out.println(arr[10]);
        
//        } catch ( IndexOutOfBoundsException e) {
//         System.out.println(e);
//        }


//         finally{
//         System.out.println("code below");
//         }
//         System.out.println("code below finally");


//     }
        
// }



