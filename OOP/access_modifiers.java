
class student{

    String name;
   static int age;
    int marks;

    static int calcAge(int birthYear){return 2024-birthYear;}

}


public class access_modifiers {

    public static void main(String[] args) {

        System.out.println(student.calcAge(2003));
        


    }
    
}
