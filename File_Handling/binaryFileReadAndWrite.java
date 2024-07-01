package File_Handling;

import java.io.*;

public class binaryFileReadAndWrite {


    public static void main(String[] args) {

       
        try (DataInputStream read = new DataInputStream(new FileInputStream("File_Handling/exp.dat"))){
            
            boolean flag = true;

            while (flag) {

                try{

                    int digit = read.readInt();
                    String name = read.readUTF();
                    boolean is = read.readBoolean();
                    float decimalNum = read.readFloat();
                    System.out.println(digit+"\t"+name+"\t"+is+"\t"+decimalNum);

                }
                catch(Exception e){
                    flag=false;
                }
                
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // public static void main(String[] args) {
        
    //     try(DataOutputStream write = new DataOutputStream(new FileOutputStream("File_Handling/exp.dat"))){
            
    //         write.writeInt(100);
    //         write.writeUTF("Murtaza");
    //         write.writeBoolean(true);
    //         write.writeFloat(10.5f);


    //         System.out.println("Data Written");


    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }

    // }
    
}
