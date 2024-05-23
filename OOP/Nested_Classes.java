
/*In Java, classes can be nested within other classes. These nested classes can be divided into four categories:

1. Static Nested Classes
2. Non-Static Nested Classes (Inner Classes)
3. Local Classes (Classes defined within a method)
4. Anonymous Classes */


class outer{

     int a;

    void greet(){System.out.println("Good Morning");}
    outer(){a=100;}
    int getA(){return a;}

     class inner{
        int b;
        inner(){b=40;}
        void greet(){System.out.println("Good Night");}
        void display(){
            
            System.out.println(a+b);
        }
        
    }
}

// Static Nested Classes

class outer2{

    void print(){System.out.println("Outer Class");}

    static class inner{

        void display(){System.out.println("Inner Class");}

        void greet(){System.out.println("I am Fine.");}

    }

}

interface details{

    void publicDetails(String name , int age , String uni , boolean isStudent);

    void privateDetails(int cnic , float cgpa);

    void display();

}

abstract class person implements details{

    boolean isStudent;

    int abc;


}


public class Nested_Classes {

public static void main(String[] args) {

    outer ob1 = new outer();
    
    outer.inner ob2 = ob1.new inner();
    
    ob2.display();// 140
    ob2.greet();// Good Night

    ob1.greet();// Good Morning 

    // Anonymous Classes

    person student = new person() {
        String name;
        int age;
        String uni;
        float cgpa;
        int cnic;

        public void publicDetails(String name , int age , String uni,boolean isStudent){
            this.name = name;
            this.age=age;
            this.uni=uni;
            this.isStudent=isStudent;

        }

        public void privateDetails(int cnic , float cgpa){

            this.cgpa=cgpa;
            this.cnic=cnic;

        }

        public void display(){
            System.out.println("Name : "+name+"\nAge : "+age+"\nCNIC : "+cnic+"\nUni : "+uni+"\nCGPA : "+cgpa+"\nStudent Exist : "+isStudent);
        }


    };

    student.publicDetails("Murtaza", 21, "COMSATS", true);
    student.privateDetails(123456789, 3.2f);
    student.display();

}
    
 }

