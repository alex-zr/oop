package session3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isDirectory());
        //FileReader reader = null;
/*        try {
            reader = new FileReader(file);
            // int counter = 0;
            int charRead = 0;
            //System.out.print((char)charRead);
            while ((charRead = reader.read()) >= 0) {
                System.out.print((char) charRead);
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }*/

// 0-255 2147486348
        try (
                FileReader reader = new FileReader(file)
                ){

            // int counter = 0;
            int charRead = 0;
            //System.out.print((char)charRead);
            while ((charRead = reader.read()) >= 0) {
                System.out.print((char) charRead);
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

/*
        FileReader reader = new FileReader(file);
        char charVal = (char) reader.read();
        System.out.print(charVal);
        charVal = (char) reader.read();
        System.out.print(charVal); */
    }
}
