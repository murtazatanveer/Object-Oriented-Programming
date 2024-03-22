import java.util.Scanner;
class student{

   String name;
   int age=30;
   int id;
 
    int calcAge(int birthYear){return 2024-birthYear;}
  
}

public class first {

    public static void main(String[] args) {


        student mySelf = new student();

        mySelf.name = "murtaza";
        mySelf.age = 21;
        mySelf.id = 3;
       
        Scanner inp = new Scanner(System.in);

       student [] bse = new student[3];

       for(int i=0;i<3;i++){

        bse[i]=new student();

       }

       int birthYear;

       bse[0].name = "X";
       bse[1].name = "Y";
       bse[2].name = "Z";

       for(int i = 0;i<3;i++){

        System.out.print("\nEnter ID of "+bse[i].name+" : ");
        bse[i].id = inp.nextInt();

        System.out.print("\nEnter Birth Year of "+bse[i].name+" : ");
        birthYear = inp.nextInt();
        bse[i].age = bse[i].calcAge(birthYear);


        }

        System.out.println("\n");

        for(int i = 0;i<3;i++){

            System.out.println("Student "+bse[i].name+" details : ");

            System.out.println("Age : "+bse[i].age);
            System.out.println("ID  : "+bse[i].id);

            System.out.println("\n");

            }
    
            

    inp.close();


    }
    

}
