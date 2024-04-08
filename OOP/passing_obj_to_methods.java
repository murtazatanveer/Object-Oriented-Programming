class account{

    private int balance=100;

    void withdraw(account acc,int amount){

        acc.balance = acc.balance - amount;

    }



    void deposit(account acc,int amount){

        acc.balance = acc.balance + amount;

    }

   void displayBalance(account acc){

        System.out.println("Bank Balance : "+acc.balance);     

    }

    void transfer(account acc1 , account acc2  ,int amount){

        acc1.withdraw(acc1, amount);
        acc2.deposit(acc2, amount);

        
    }

}

public class passing_obj_to_methods {

    public static void main(String[] args) {

    //   account obj = new account();
    //    obj.deposit(obj, 400);
    //    obj.withdraw(obj, 300);
    //    obj.displayBalance(obj);
    //    depositBigAmount(obj, 10000);
    //    obj.displayBalance(obj); 
    
    account a1 = new account();
    a1.deposit(a1, 1000);

    account a2 = new account();
    
    a1.transfer(a1, a2, 300);
    a1.displayBalance(a1);// 800
    a2.displayBalance(a2);// 400
        
    }

    static void depositBigAmount(account acc,int amount){

        acc.deposit(acc, amount);
    }
    
}
