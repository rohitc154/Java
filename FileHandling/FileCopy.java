package FileHandling;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abx.txt");
            FileOutputStream fos = new FileOutputStream("result.txt");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File Copied!");
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("file Nhi Mila!! ");
        }

    }
}
