package Final_Paper;

interface tasks{

    void calculator(int item);

}

class square implements tasks{

    public void calculator(int num){
        System.out.println("Square of "+num+" is : "+(num*num));
    }

}

class factorial implements tasks{

    public void calculator(int num){
       
        int fact=1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of "+num+" is : "+fact);
        
    }

}

class fibonacci  implements tasks{

    public void calculator(int n){
       
        if(n<2){
            System.out.println("Fibonacci Sequence of "+n+" is : "+n);
            return;
        }
        
        int prev = 0;
        int current=1;
        int answer=prev+current;

        for(int i=3;i<=n;i++){

            prev=current;
            current = answer;
            answer= prev+current;
    
        }


        System.out.println("Fibonacci Sequence of "+n+" is : "+answer);
        
    }

}


public class Q3_B {
    public static void main(String[] args) {

        square ob1 = new square();
        ob1.calculator(10);

        factorial ob2 = new factorial();
        ob2.calculator(5);

        fibonacci ob3 = new fibonacci();
        ob3.calculator(10);

        
    }
    
}
