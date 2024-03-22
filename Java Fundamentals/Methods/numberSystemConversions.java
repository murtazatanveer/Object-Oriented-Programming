package Methods;

public class numberSystemConversions{

    public static void main(String[] args){

System.out.println(octalToBinary(777));

 }

 static String octalToBinary(int octalNum){

     int digit=0;

     String reqBinaryNum="";

     int length=0;

     String binaryNum="";

     while(octalNum>0){

          digit = octalNum % 10;
         reqBinaryNum = decimaltobinary(digit);
         length = reqBinaryNum.length();

         if(length<3){

             if(length == 2){reqBinaryNum = 0 + reqBinaryNum;}

             else{reqBinaryNum = "0"+"0"+reqBinaryNum;}}



         binaryNum  = reqBinaryNum + binaryNum;

         octalNum/=10;}



         return binaryNum;}


     static String decimaltobinary(int decimalNum){
         int digit;

         String binaryNum="";

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

            return binaryNum;

         }
   }