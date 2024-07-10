package Final_Paper;

class person{
    int id;
    double horlyPay;

    void set(int id , double horlyPay){
        this.id=id;
        this.horlyPay=horlyPay;
    }
   
    
}

class employees extends person{

    float raise(){
         horlyPay += ((20*horlyPay)/100) ;
         return (float)horlyPay; 
    }

    float payday(int hours){

        return hours>40 ?  (float)((horlyPay*40)+(((hours-40)*horlyPay)*2)) : (float)(horlyPay*hours);
    }

}

public class Q3_C {
    public static void main(String[] args) {
        
        employees ob = new employees();
        ob.set(100, 500);
    
        System.out.println(ob.raise()+"\t"+ob.payday(41));
        

    }
}
