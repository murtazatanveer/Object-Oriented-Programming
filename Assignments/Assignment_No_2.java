package Assignments;

import java.util.Scanner;

class LineType{

    String line;

    static int entries=0;

    Scanner inp = new Scanner(System.in);
    
    // Option 1 method : Enter Lines of Text
    void inputLines(LineType [] page){

        System.out.print("How Many Lines You Want to Enter : ");
        int no = inp.nextInt();
        inp.nextLine();
        
       for (int i = 1; i <= no; i++) { 

        System.out.print("\nEnter Line # "+entries+" (up to max. 80 char) : ");

        page[entries].line = setLine(inp.nextLine());
        entries++;   
       }

       System.out.println("\n");
    }


    // Option 2 method : Retrieve all Lines
    void retriveLines(LineType [] page){

        System.out.println("\nAll Lines are : \n");

        for(int i=0;i<entries;i++){

            if(page[i]==null){
                continue;
            }

            System.out.println(page[i].line);
        }

        System.out.println("\n");

    }


    //Option 3 method : Retrieve a particular line of Text and reverse it.
    void reverseLine(LineType [] page){

        System.out.print("Enter Line number You Want to Reverse (0,1,2....) : ");
        int no = inp.nextInt();

        if(page[no]==null || no>=entries || no<0){
            System.out.println("Given Line Number No Doesnot Exist in Record");
            return;
        }

        page[no].line = reverseLine(page[no].line);
        System.out.println("Line no "+no+" Reversed!");

        System.out.println("\n");

    }


    //Option 4 method : Delete a particular line of Text.
    void deleteLine(LineType [] page){

        System.out.print("Enter Line number You Want to Delete (0,1,2....) : ");
        int no = inp.nextInt();

        if(page[no]==null || no>=entries || no<0){
            System.out.println("Given Line Number Doesnot Exist in Record\n");
            return;
        }

        page[no]=null;
        System.out.println("Line no "+no+" Deleted!");
        System.out.println("\n");
        System.out.println("\n");

    }


    //Option 5 method : Retrieve the longest line of Text
    void retriveLongestLine(LineType [] page){

        int max = page[0].line.length();
        int index=-1;

        for (int i = 0; i < entries; i++) {

            if(page[i]==null){
                continue;
            }

            if(page[i].line.length()>max){

                max=page[i].line.length();
                index=i;

            }
            
        }

        System.out.println("Longest Line is : "+page[index].line+"\n");

    }

   //Option 6 method : Delete a particular word in a particular line.
   void deleteWord(LineType [] page){

    System.out.print("Enter Line number You Want to Delete Word in it (0,1,2....) : ");
        int no = inp.nextInt();

        if(page[no]==null || no>=entries || no<0){
            System.out.println("Given Line Number Doesnot Exist in Record");
            return;
        }

        System.out.println(page[no].line);
        inp.nextLine();
        System.out.print("\nEnter Word you want to Revove from above line : ");

        String word = inp.nextLine();
        String result = removeWord(page[no].line, word);

        if(result.equals(null)){
            System.out.println("Given Word Doesnot Exist in Line.");
            return;
        }

        page[no].line=result;

        System.out.println("Word from line no "+no+" Deleted!\n\n");
    
   }

   //Option 7 method : Delete all those lines which having greater than 50 character
   void deleteLines(LineType [] page){

    boolean noLine=true;

    for(int i=0;i<entries;i++){

        if(page[i]==null){
            continue;
        }

        if(page[i].line.length()>50){
            noLine = false;
            page[i]=null;
            System.out.println("Line Number "+i+" Deleted!");
        }

    }

    if(noLine){System.out.println("No Line found in Record having more than 50 Characters.");}

    System.out.println("\n");

   }


   //Option 8 : Update the contents of particular line of Text 
    void updateLine(LineType [] page){

        System.out.print("Enter Line number You Want to Delete (0,1,2....) : ");
        int no = inp.nextInt();

        if(page[no]==null || no>=entries || no<0){
            System.out.println("Given Line Number Doesnot Exist in Record\n");
            return;
        }

        System.out.print("\nUpdate Line no "+no+" : ");
        inp.nextLine();
        page[no].line = inp.nextLine();

        System.out.println("Line no "+no+" Updated!\n");

    }

    // Method to set the line if its length is more than 80 Characters;
    private String setLine(String str){

        return str.length()>80 ? str.substring(0, 79) : str;

    }

    // Method to reverse a Line.
    private String reverseLine(String str){

        char []arr=str.toCharArray();

        char temp;

        for(int i=0;i<arr.length/2;i++){

            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        return String.valueOf(arr);

    }

    // Method to remove a specific word from String.
    private String removeWord(String str , String word){

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

public class Assignment_No_2 {
    public static void main(String[] args) {

        System.out.println("\tAssignment No 2\n\n");

        LineType run = new LineType();

        //Declaring Array
        LineType []pages = new LineType[25];

        for (int i = 0; i < pages.length; i++) {
            pages[i] = new LineType();
        }

        Scanner inp = new Scanner(System.in);
        int choice;

        do {

            System.out.println("[1]. Enter Lines of Text\n"+
                    "[2]. Retrieve all Lines\n"+
                    "[3]. Retrieve a particular line of Text and reverse it\n"+ 
                    "[4]. Delete a particular line of Text\n"+ 
                    "[5]. Retrieve the longest line of Text\n"+
                    "[6]. Delete a particular word in a particular line\n"+
                    "[7]. Delete all those lines which having greater than 50 characters\n"+ 
                    "[8]. Update the contents of particular line of Text\n"+
                    "[9]. Exit");

            System.out.print("\nChoice : ");
            choice=inp.nextInt();

            switch (choice){
                case 1:
                run.inputLines(pages);                    
                break;

                case 2:
                run.retriveLines(pages);                    
                break;

                case 3:
                run.reverseLine(pages);                   
                break;

                case 4:
                run.deleteLine(pages);                 
                break;

                case 5:
                run.retriveLongestLine(pages);                    
                break;

                case 6:
                run.deleteWord(pages);                   
                break;

                case 7:
                run.deleteLines(pages);                   
                break;

                case 8:
                run.updateLine(pages);                  
                break;

                case 9:
                System.out.println("Exitting....");                
                break;
            
                default:
                System.out.println("Invalid Choice");
                break;
            }
            
            
        } while (choice!=9);

        inp.close();
        
    }
}
