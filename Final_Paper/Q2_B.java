package Final_Paper;

class bank{

    int balance;

    int getBalance() {
        return 0;
    }

    void setBalance(int amount){
       this.balance=amount;
    }

}

class ABL extends bank{


    @Override
    int getBalance() {
        return balance;
    }
    
}

class HBL extends bank{

    @Override
    int getBalance() {
        return balance;
    }
    
}

class MCB extends bank{

    @Override
    int getBalance() {
        return balance;
    }
    
}


public class Q2_B {
    public static void main(String[] args) {
        
        ABL allied = new ABL();
        allied.setBalance(3000);
        System.out.println(allied.getBalance());

        HBL hbl = new HBL();
        hbl.setBalance(5000);
        System.out.println(hbl.getBalance());

        MCB mcb = new MCB();
        mcb.setBalance(2000);
        System.out.println(mcb.getBalance());

    }
}
