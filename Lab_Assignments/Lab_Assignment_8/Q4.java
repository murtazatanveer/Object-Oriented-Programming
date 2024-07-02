package Lab_Assignment_8;

class person{

    String name;
    int age;
    String cast;

    person(String name , int age , String cast){
        this.name=name;
        this.age=age;
        this.cast=cast;
    }

    void display(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nCast : "+cast);
    }

}

class teacher extends person{

    int id,scale;
    String department;

    teacher(String name, int age, String cast , String department , int id , int scale){

        super(name, age, cast);

        this.department=department;
        this.id=id;
        this.scale=scale;
    }

    void display(){

        super.display();
        System.out.println("Department : "+department+"\nID : "+id+"\nScale : "+scale);

    }

}

class student extends person{

    int year;
    String department;

    student(int year , String department , String name , int age , String cast){
        super(name, age, cast);

        this.department=department;
        this.cast=cast;

    }

    void display(){
        super.display();
        System.out.println("Year : "+year+"\nDepartment : "+department);
    }

}

public class Q4 {

    public static void main(String[] args) {
        
        student stu = new student(2024, "Software Engineering", "Murtaza", 21, "ABC");
        stu.display();

        teacher tea = new teacher("XYZ", 30, "xyz", "Software Engineering", 100, 17);
        tea.display();

    }
    
}
