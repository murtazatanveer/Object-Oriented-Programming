package File_Handling;

import java.io.*;

public class WriteBinaryFile {

    public static void main(String[] args) throws IOException {
        int regno;  
        String name;    
        int marks;

        FileOutputStream fw = new FileOutputStream("test.dat", true);
        DataOutputStream dw = new DataOutputStream(fw);
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        char ch = 'y';
        while (ch == 'y' || ch == 'Y') {
            System.out.print("Registration #: ");
            regno = Integer.parseInt(a.readLine());

            System.out.print("Name of Student: ");
            name = a.readLine();

            System.out.print("Marks: ");
            marks = Integer.parseInt(a.readLine());

            dw.writeInt(regno);
            dw.writeUTF(name);
            dw.writeInt(marks);
            dw.writeChars(name);

            System.out.print("\n\nAdd more [y/n]: ");
            ch = (char) a.read();
            a.readLine(); // Consume the newline character
        }

        fw.close();
        dw.close();
    }
}
