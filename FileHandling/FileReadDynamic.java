package FileHandling;

import java.io.*;

public class FileReadDynamic {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abx.txt");
        int data;
        
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        fis.close();
    }
}
