package FileHandling;

import java.io.*;

public class FileBasics {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ax.txt");

            int data1 = fis.read();
            int data2 = fis.read();
            int data3 = fis.read();
            int data4 = fis.read();
            System.out.println("Data : " + data1);
            System.out.println("Data2 : " + data2);
            System.out.println("Data3 : " + data3);
            System.out.println("Data3 : " + data4);

            // System.out.println("Data : " + (char) data1);
            fis.close();
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf);
        } catch (IOException io) {
            System.out.println(io);
        }
    }
}
