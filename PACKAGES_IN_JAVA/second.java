package PACKAGES_IN_JAVA;

public class second {
    void show(){
        System.out.println("FIRST CLASS in second.java");
    }
}

 class B{
    void show(){
        System.out.println("CLASS B in second.java"+first.flag);
    }
}
