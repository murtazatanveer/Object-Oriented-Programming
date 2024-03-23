package Lab_Assignment_3;

public class Q12{
    public static void main(String [] str){
    
        Q12 obj = new Q12();
    
        int [] integers = new int[10];
    
        obj.fill(integers);
        obj.display(integers);
    
    
        }
    
      void fill(int [] arr){
    
          for(int i=0;i<arr.length;i++){
    
              arr[i] = (int)(Math.random() * 50);
    
              }
    
          }
    
      void display(int[] arr){
    
          int evenCount=0,oddCount=0;
    
          for(int i=0;i<arr.length;i++){
    
              if(arr[i] % 2 == 0){
    
                  System.out.println("\n"+arr[i]+" is Even");
                  evenCount++;
    
                 }else{
    
                  System.out.println("\n"+arr[i]+" is Even");
                  oddCount++;
                }
              }
    
              System.out.println("\nTotal Even Numbers : "+evenCount+"\nTotal Odd Numbers : "+oddCount);
    
          }
    
    
        }
    
