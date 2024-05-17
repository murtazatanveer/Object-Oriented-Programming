package Lab_Assignment_8;

class computer{

    int wordSize;
    int memorySize;
    int storage;
    int speed;

    computer(int a , int b , int c , int d){

        wordSize=a;
        memorySize=b;
        storage=c;
        speed=d;

    }

    void display(){
        System.out.println("Word Size : "+wordSize+"\nMemory Size : "+memorySize+"\nStorage : "+storage+
        "\nSpeed : "+speed);
    }
}

class laptop extends computer{

    int length,width,height,weight;

    laptop(int a , int b , int c , int d , int e , int f , int g , int h){
        super(a, b, c, d);
        length=e;
        width=f;
        height=g;
        weight=h;
    }

    void display(){

        super.display();
        System.out.println("Length : "+length+"\nWidth : "+width+"\nHeight : "+height+"\nWeight : "+weight);
        
    }
    

}

public class Q2 {

    public static void main(String[] args) {

        laptop lap = new laptop(10, 20, 30, 40, 50, 60, 70, 80);
        lap.display(); }}
