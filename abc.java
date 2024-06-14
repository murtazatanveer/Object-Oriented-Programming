class A{
    int i,j;
    

    A(){

        i=1;
        j=2;

    }
}

// class B extends A{
//     int a;
//     B(){
//         super();
//     }
// }

 interface  i1{
    void meth1();
   
}

interface i3 extends i1,i2{

}

interface i2{
    void meth1();
}

 class C implements i1 , i2{

   public void meth1(){System.out.println("meth1");}

   public static final int a = 10;


}

public class abc {

    public static void main(String[] args) {

        // B ob = new B();
        // System.out.println(ob.i+"  "+ob.j);

       System.out.println(removeWord("All the students are good programmer in myclass", " good"));
        
    }

    static String removeWord(String str , String word){

        if(word.length()>str.length()){
            return null;
        }
    
            int startPoint=-1;
            int endPoint=-1;
            int count=1;
    
            for (int i = 0; i < str.length(); i++) {
                
                if(word.charAt(0)==str.charAt(i)){
    
                    
                    int k=i+1;
                    int j;
    
                    for (j=1; j < word.length(); j++,k++) {
                        if(word.charAt(j)==str.charAt(k)){
                            count++;
                        }else{
                          j++;
                            break;
                        }
                    }
                    if(j==count){
                        
                        startPoint=i;
                        endPoint=k-1;
                        str = str.substring(0, startPoint) + str.substring(endPoint+1, str.length());
                        return str;
                    }
    
                    count=1;
                    
                }
                
            }
         
            return null;
    
        }
    
}
