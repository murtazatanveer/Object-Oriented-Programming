package File_Handling.Object_Serialization;

import java.io.*;

class student implements Serializable{

    String name;
    int rollno;
    String address;

    student(String name,int rollno,String address){
        this.name=name;
        this.rollno=rollno;
        this.address=address;
        }

    void display(){
        System.out.println(name+"\t"+rollno+"\t"+address);
    }
    
    }


public class Storing_Object {
    public static void main(String[] args) {

        writingObject();
        readingObject();
        
    
    }

    static void writingObject(){

        student s1=new student("Murtaza",96,"Jhelum");
        student s2=new student("Naseem",76,"Bannu");

        
        try(ObjectOutputStream wri = new ObjectOutputStream(new FileOutputStream("File_Handling/Object_Serialization/obj.ser"))){
            wri.writeObject(s1); 
            wri.writeObject(s2);
            System.out.println("Object Written");           
        } catch (Exception e) {
           System.out.println("Error : "+e);
        }
    }

    static void readingObject(){
       
        try(ObjectInputStream read = new ObjectInputStream(new FileInputStream("File_Handling/Object_Serialization/obj.ser"))){

            student me = (student)read.readObject();
            me.display();

            student stu = (student)read.readObject();
            stu.display();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}