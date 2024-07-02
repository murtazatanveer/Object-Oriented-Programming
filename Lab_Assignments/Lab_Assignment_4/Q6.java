package Lab_Assignment_4;

class date{
    int day;
    int month;
    int year;

    date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;

		}

    void display(){

    System.out.println(day+"/"+month+"/"+year);

       }

   }


public class Q6{

   public static void main(String [] str){

       date d1 = new date(04,03,2024);

       date d2 = new date(22,03,2024);

       d1.display();
       System.out.println();
       d2.display();

       }}

