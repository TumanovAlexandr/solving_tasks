package zaur.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;

        try {
            reader = new FileReader("src/zaur/work_with_files/test.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
