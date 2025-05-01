package FileHandling;

import java.io.*;

public class WriteFileBasics {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileOutputStream fos = new FileOutputStream("bbx.txt");
        fos.write(15);
        System.out.println("Data is Saved!");

        fos.close();
    }
}
