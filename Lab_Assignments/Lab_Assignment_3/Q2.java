package Lab_Assignment_3;

class date{
    int day;
    int month;
    int year;

    void display(){

    System.out.println(day+"/"+month+"/"+year);

       }

   }




public class Q2{

   public static void main(String [] str){

       date d1 = new date();

       d1.day=04;
       d1.month=03;
       d1.year=2024;


       date d2 = new date();

       d2.day=22;
       d2.month=03;
       d2.year=2024;

       d1.display();
       System.out.println("\n");
       d2.display();

       }}

